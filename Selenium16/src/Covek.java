
public abstract class Covek {
	
	private String ime;
	private int id;
	
	public Covek(String ime, int id) {
		this.ime = ime;
		this.id = id;
	}

	public abstract String pricaj();
	public abstract void stmpaj();
	
	public String getIme() {
		return ime;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
}

 class Vozac extends Covek{

	public Vozac(String ime, int id) {
		super(ime, id);
	}

	@Override
	public String pricaj() {
		return "Vozi!!!";
	}

	@Override
	public void stmpaj() {
		System.out.println("[" + this.getId() +"]"
							+ " > { " + this.pricaj() + " }");
		
	}
	
}
 
 class Komentator extends Covek{

	public Komentator(String ime, int id) {
		super(ime, id);
	}

	@Override
	public String pricaj() {
		return "Goooo!";
	}

	@Override
	public void stmpaj() {
		System.out.println("[" + this.getId() +"] " + this.getIme()
							+ " > { " + this.pricaj() + " }");
		
	}
	
}
