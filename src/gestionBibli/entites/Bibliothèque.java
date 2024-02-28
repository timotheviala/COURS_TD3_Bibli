package gestionBibli.entites;



public class Bibliothèque {
	
	//attribut
	private int nbOuvrages;
	private Ouvrage[] fond;
	private int nbMaxOuvrages;
	
	//constructeur
	public Bibliothèque(int nbMaxOuvrages) {
		this.nbMaxOuvrages=nbMaxOuvrages;
		this.fond=new Ouvrage[nbMaxOuvrages];
		toString();
	}

	//methode
	

	
	public void ajouterOuvrage(Ouvrage ouvrageAAjouter) {
		if (nbOuvrages<fond.length) {
			fond[nbOuvrages]=ouvrageAAjouter;
			nbOuvrages+=1;
		}else {
			System.out.println("Bibliothèque pleine");
		}
	}
	
	
	
	@Override
	public String toString() {
		String base="Bibliotheque [nbMaxOuvrages=" + nbMaxOuvrages + ", nbOuvrages=" + nbOuvrages + "]";
		for (Ouvrage ouvrage : fond) {
			if (ouvrage != null) {
				base = base + "\n\t" + ouvrage.toString();
			}
		}

		return base;
	}
		

	public Ouvrage[] getFond() {
		return fond;
	}

	public void setFond(Ouvrage[] fond) {
		this.fond = fond;
	}

	public int getNbOuvrages() {
		return nbOuvrages;
	}
	
	//test
	public static void main(String args []) {
		Bibliothèque bibliTest=new Bibliothèque(50);
		
		}

}
