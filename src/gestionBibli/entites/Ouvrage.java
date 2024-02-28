package gestionBibli.entites;

import java.util.Arrays;

public class Ouvrage {
	
	private static final int NB_EXEMPLAIRES_MAX=50;
	//attribut
	private Exemplaire[] lesExemplaires=new Exemplaire[NB_EXEMPLAIRES_MAX];
	private String titre;
	private String auteurs;
	private String isbn;
	private String editeur;
	private int annee;
	private int nbExemplaires=0;
	private GenreLittéraire genre;
	
	//constructeur
	public Ouvrage(String titre,String auteurs,String isbn,String editeur,int annee,GenreLittéraire genre) {
		this.genre=genre;
		this.titre=titre;
		this.auteurs=auteurs;
		this.isbn=isbn;
		this.editeur=editeur;
		this.annee=annee;
		toString();
	}
	
	//methode
	
	public void ajouterExemplaire(Exemplaire exemplaireAAjouter) {
		if (nbExemplaires<NB_EXEMPLAIRES_MAX) {
			lesExemplaires[getNbExemplaires()]=exemplaireAAjouter;
			nbExemplaires+=1;	
		}else {
			System.out.println("Trop d'exemplaires");
		}
		
	}


	public String toString() {
		String tos = "Ouvrage [ titre=" + titre + ", auteurs=" + auteurs + ", editeur=" + editeur
				+ ", annee=" + annee + ", isbn=" + isbn + ", nbExemplaires=" + nbExemplaires + "]";
		for (Exemplaire exemplaire : lesExemplaires) {
			if (exemplaire != null) {
				tos = tos + "\t" + exemplaire.getCote();
			}

		}

		return tos;
	}

	public static int getNbExemplairesMax() {
		return NB_EXEMPLAIRES_MAX;
	}

	public Exemplaire[] getLesExemplaires() {
		return lesExemplaires;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteurs() {
		return auteurs;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getEditeur() {
		return editeur;
	}

	public int getAnnee() {
		return annee;
	}

	public int getNbExemplaires() {
		return nbExemplaires;
	}
	
	//méthode globale
	public static void main(String args []) {
		Ouvrage monOuvrage=new Ouvrage("Shinning","Stephen King","ISBN_01","Hachette",1977,GenreLittéraire.SF);
		
		
	}
}

	
	
