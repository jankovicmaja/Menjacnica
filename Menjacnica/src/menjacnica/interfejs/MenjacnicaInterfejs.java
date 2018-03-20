package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.valuta.Valuta;

public interface MenjacnicaInterfejs {
	public void dodajKurs(String ime, String skracenoIme, GregorianCalendar datum, double prodajniKurs, double kupovniKurs, double srednjiKurs);
	public void brisanjeKursaNaOdredjeniDan(String skracenoIme, GregorianCalendar datum);
	public Valuta vratiKurs(String skracenoIme, GregorianCalendar datum);
}
