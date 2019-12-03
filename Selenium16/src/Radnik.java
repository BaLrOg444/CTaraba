
public class Radnik {

	private String imeIPrezime;
	private String maticniBroj;
	private double plata;
	private String odeljenje;
	
	
	
	public Radnik() {
	}

	public Radnik(String imeIPrezime, String maticniBroj, double plata, String odeljenje) {
		this.imeIPrezime = imeIPrezime;
		this.maticniBroj = maticniBroj;
		this.plata = plata;
		this.odeljenje = odeljenje;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}
	
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	
	public String getMaticniBroj() {
		return maticniBroj;
	}
	
	public void setMaticniBroj(String maticniBroj) {
		this.maticniBroj = maticniBroj;
	}
	
	public double getPlata() {
		return plata;
	}
	
	public void setPlata(double plata) {
		this.plata = plata;
	}
	
	public String getOdeljenje() {
		return odeljenje;
	}
	
	public void setOdeljenje(String odeljenje) {
		this.odeljenje = odeljenje;
	}

	@Override
	public String toString() {
		return "Ime i prezime: " + imeIPrezime + ", maticni broj: " + maticniBroj + ", plata: " + plata
				+ ", odeljenje: " + odeljenje;
	}
	

	
	
	
	
}
