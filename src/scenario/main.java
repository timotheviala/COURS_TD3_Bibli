package scenario;

import gestionBibli.entites.Bibliothèque;
import gestionBibli.entites.Exemplaire;
import gestionBibli.entites.Ouvrage;

public class main {
	
	public static void main(String args []) {
	Bibliothèque maBibli=new Bibliothèque(50);
	Ouvrage monOuvrage=new Ouvrage("Shinning","Stephen King","ISBN-01","Hachette",1977);
	Exemplaire monExemplaire=new Exemplaire("01");
	Exemplaire monExemplaire2=new Exemplaire("02");
	
	maBibli.ajouterOuvrage(monOuvrage);
	monOuvrage.ajouterExemplaire(monExemplaire);
	monOuvrage.ajouterExemplaire(monExemplaire2);
	
	System.out.println(maBibli);
	
	}
}
