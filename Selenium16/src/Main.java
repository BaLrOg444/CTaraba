
public class Main {

	public static void main(String[] args) {
		Radnik r1 = new Radnik("Pera Peric", "1606990787620", 50000, "prodaja");
		Radnik r2 = new Radnik("Jovan Jovanovic", "2308988787620", 60000, "marketing");
		Radnik r3 = new Radnik("Ivan Ivanovic", "1503986787620", 40000, "finansije");
		
		Radnik[] radnici = {r1, r2, r3};
		
		Firma firma = new Firma("Nova firma", radnici);
		firma.radnikNajvecaPlata();
		firma.radnikNajmanjaPlata();
		
		firma.povecajPlatu(0, 5000);
		
		System.out.println(radnici[0].getPlata());
		
		System.out.println("Broj radnika: " + firma.brojRadnika());
		
		

	}

}
