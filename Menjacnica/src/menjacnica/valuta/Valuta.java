package menjacnica.valuta;

import java.util.GregorianCalendar;

public class Valuta {
		private String ime;
		private String skracenoIme;
		private GregorianCalendar datum;
		private double prodajniKurs;
		private double kupovniKurs;
		private double srednjiKurs;
		public String getIme() {
			return ime;
		}
		public void setIme(String ime) {
			this.ime = ime;
		}
		public String getSkracenoIme() {
			return skracenoIme;
		}
		public void setSkracenoIme(String skracenoIme) {
			this.skracenoIme = skracenoIme;
		}
		public GregorianCalendar getDatum() {
			return datum;
		}
		public void setDatum(GregorianCalendar datum) {
			this.datum = datum;
		}
		public double getProdajniKurs() {
			return prodajniKurs;
		}
		public void setProdajniKurs(double prodajniKurs) {
			this.prodajniKurs = prodajniKurs;
		}
		public double getKupovniKurs() {
			return kupovniKurs;
		}
		public void setKupovniKurs(double kupovniKurs) {
			this.kupovniKurs = kupovniKurs;
		}
		public double getSrednjiKurs() {
			return srednjiKurs;
		}
		public void setSrednjiKurs(double srednjiKurs) {
			this.srednjiKurs = srednjiKurs;
		}
}
