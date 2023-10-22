package ma.uh2c.uh2.gscompte.dto;

public class Compte {
	private String nom;
	private String prenom;

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
