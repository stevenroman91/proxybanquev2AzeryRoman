package model;

public abstract class  Personne {
	
	//Attribus
	
	private int idPersonne;
	private String prenom, nom;
	
	// Constructeurs
	
	public Personne() {
		
	}
	
	public Personne(int idPersonne, String prenom, String nom) {
		super();
		this.idPersonne = idPersonne;
		this.prenom = prenom;
		this.nom = nom;
	}

	//Getters & Setters
	
	public int getIdPersonne() {
		return idPersonne;
	}
	
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	// Methodes

	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
}
