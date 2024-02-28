package gestionBibli.entites;

public class Exemplaire {
	
	//attribut
	private boolean dispoEnLigne=true;
	private boolean dispoEmprunt=true;
	private String cote;
	
	//constructeur
	public Exemplaire(String cote) {
		this.cote=cote;
		toString();
	}

	
	//methode
	
	
	public boolean isDispoEnLigne() {
		return dispoEnLigne;
	}

	@Override
	public String toString() {
		return "Exemplaire [dispoEnLigne=" + dispoEnLigne + ", dispoEmprunt=" + dispoEmprunt + ", cote=" + cote + "]";
	}


	public boolean isDispoEmprunt() {
		return dispoEmprunt;
	}

	public String getCote() {
		return cote;
	}
	
	//test
	public static void main(String args []) {
		Exemplaire monExemplaire=new Exemplaire("01");

	}

	
	
}
