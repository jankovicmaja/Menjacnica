package menjacnica;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;
import menjacnica.valuta.Valuta;
public class Menjacnica implements MenjacnicaInterfejs{
	private LinkedList<Valuta> valute=new LinkedList<Valuta>();

	@Override
	public String toString() {
		return "Menjacnica [valute=" + valute + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menjacnica other = (Menjacnica) obj;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}

	@Override
	public void dodajKurs(String ime, String skracenoIme, GregorianCalendar datum, double prodajniKurs,
			double kupovniKurs, double srednjiKurs) {
		Valuta v=new Valuta();

		v.setDatum(datum);
		v.setIme(ime);
		v.setSkracenoIme(skracenoIme);
		v.setProdajniKurs(prodajniKurs);
		v.setSrednjiKurs(srednjiKurs);
		v.setKupovniKurs(kupovniKurs);
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i)==null) {
				valute.add(v);
				break;
			}
		}
		
	}

	@Override
	public void brisanjeKursaNaOdredjeniDan(String skracenoIme, GregorianCalendar datum) {
		for (int i = 0; i < valute.size(); i++) {
			Valuta v=valute.get(i);
			if(v.getDatum().get(GregorianCalendar.DAY_OF_MONTH)==datum.get(GregorianCalendar.DAY_OF_MONTH) &&
					v.getSkracenoIme().equals(skracenoIme)) {
				valute.remove(v);
				break;
			}
		}
		
	}

	@Override
	public Valuta vratiKurs(String skracenoIme, GregorianCalendar datum) {
		Valuta v=new Valuta();
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getDatum().get(GregorianCalendar.DAY_OF_MONTH)==datum.get(GregorianCalendar.DAY_OF_MONTH) &&
					valute.get(i).getSkracenoIme().equals(skracenoIme)) {
				v=valute.get(i);
				break;
			}
		}
		return v;
	}
	
}
