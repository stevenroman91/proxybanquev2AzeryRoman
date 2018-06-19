package model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author Badr Azeri et Steven Roman
 *
 */

public class Client extends Personne {
	
	//---------- Attributs de la Classe Client
	
	private int telephone;
	private Adresse adresse;
	private String email;
	private boolean typeDeClient;
	private ConseillerClientele conseiller;
	private Collection<Compte> comptes = new ArrayList<Compte>();
	private Collection<Placement> placements = new ArrayList<Placement>();
	
	//---------- Constructeur de la Classe Personne 
	
	public Client(String prenom, String nom, String email) {
		super();
		super.setPrenom(prenom);
		super.setNom(nom);
		this.email = email;
	}
	
	/**
	 * 
	 * @param prenom
	 * @param nom
	 * @param adresse
	 * @param email
	 */
	public Client(String prenom, String nom, Adresse adresse, String email) {
		super();
		super.setPrenom(prenom);
		super.setNom(nom);
		this.email = email;
		this.adresse = adresse;
	}
	
	/**
	 * 
	 * @param prenom
	 * @param nom
	 * @param telephone
	 * @param adresse
	 * @param email
	 */
	public Client(String prenom, String nom,int telephone, Adresse adresse, String email) {
		super();
		super.setPrenom(prenom);
		super.setNom(nom);
		this.telephone = telephone;
		this.adresse = adresse;
		this.email = email;
	}

	//---------- Getters & Setters
	
	
	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTypeDeClient() {
		return typeDeClient;
	}

	public void setTypeDeClient(boolean typeDeClient) {
		this.typeDeClient = typeDeClient;
	}

	public ConseillerClientele getConseiller() {
		return conseiller;
	}

	public void setConseiller(ConseillerClientele conseiller) {
		this.conseiller = conseiller;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	public Collection<Placement> getPlacements() {
		return placements;
	}

	public void setPlacements(Collection<Placement> placements) {
		this.placements = placements;
	}

	@Override
	public String toString() {
		return "Client [getIdPersonne= "+getIdPersonne()+ ", nom =" +getNom() + ", prenom =" + getPrenom()+ ", telephone=" + telephone + ", adresse=" + adresse + ", email=" + email + ", typeDeClient="
				+ typeDeClient + ", conseiller=" + conseiller + ", comptes=" + comptes + ", placements=" + placements+ "]";
	}

	
	
	//---------- Reecriture de la methode toString

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	

}
