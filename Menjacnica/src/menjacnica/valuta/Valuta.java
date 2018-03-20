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
		@Override
		public String toString() {
			return "Valuta [ime=" + ime + ", skracenoIme=" + skracenoIme + ", datum=" + datum + ", prodajniKurs="
					+ prodajniKurs + ", kupovniKurs=" + kupovniKurs + ", srednjiKurs=" + srednjiKurs + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((datum == null) ? 0 : datum.hashCode());
			result = prime * result + ((ime == null) ? 0 : ime.hashCode());
			long temp;
			temp = Double.doubleToLongBits(kupovniKurs);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(prodajniKurs);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((skracenoIme == null) ? 0 : skracenoIme.hashCode());
			temp = Double.doubleToLongBits(srednjiKurs);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			Valuta other = (Valuta) obj;
			if (datum == null) {
				if (other.datum != null)
					return false;
			} else if (!datum.equals(other.datum))
				return false;
			if (ime == null) {
				if (other.ime != null)
					return false;
			} else if (!ime.equals(other.ime))
				return false;
			if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
				return false;
			if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
				return false;
			if (skracenoIme == null) {
				if (other.skracenoIme != null)
					return false;
			} else if (!skracenoIme.equals(other.skracenoIme))
				return false;
			if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
				return false;
			return true;
		}
		
}
