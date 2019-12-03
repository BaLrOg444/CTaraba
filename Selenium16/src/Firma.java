
public class Firma {

	private String naziv;
	private Radnik[] radnici;

	public Firma(String naziv, Radnik[] radnici) {
		this.naziv = naziv;
		this.radnici = radnici;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Radnik[] getRadnici() {
		return radnici;
	}

	public void setRadnici(Radnik[] radnici) {
		this.radnici = radnici;
	}

	public int brojRadnika() {
		return radnici.length;
	}

	public void radnikNajvecaPlata() {
		int index = 0;

		for (int i = 1; i < radnici.length; i++) {
			if (this.radnici[index].getPlata() < this.radnici[i].getPlata()) {
				index = i;
			}
		}

		System.out.println("Najvecu platu ima - " + radnici[index].toString());
	}

	public void radnikNajmanjaPlata() {
		int index = 0;

		for (int i = 1; i < radnici.length; i++) {
			if (this.radnici[index].getPlata() > this.radnici[i].getPlata()) {
				index = i;
			}
		}

		System.out.println("Najmanju platu ima - " + radnici[index].toString());
	}

	public void povecajPlatu(int indexRadnika, double sumaPovecanja) {
		double inicijalnaPlata = radnici[indexRadnika].getPlata();
		radnici[indexRadnika].setPlata(inicijalnaPlata + sumaPovecanja);
	}

}
