package gestionBibli.entites;

public enum GenreLittéraire {
	
	R("roman"),RP("roman policier"),SF("science fiction"),T("théâtre"),S("savoir");
	
	private String nom;
	
	private GenreLittéraire(String nom){
		this.nom=nom;
	}
	
	public String toString() {
		return nom;
	}
	
	
}
