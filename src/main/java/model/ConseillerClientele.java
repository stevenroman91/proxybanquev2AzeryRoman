package model;

import java.util.ArrayList;
import java.util.Collection;


/**
 * 
 * @author Quentin Ussunet et Steven Roman
 *
 */

public class ConseillerClientele extends Personne {
	
	//---------- Attributs de la Classe ConseillerClientelle 
	
	private String login;
	private String password;
	private Gerant gerant;
	private Collection<Client> clients = new ArrayList<Client>();
	
	//---------- Constructeur de la Classe Conseill� Clientelle
	
	public ConseillerClientele() {
		
	}
	
	/**
	 * 
	 * @param prenom prenom du conseiller clientele
	 * @param nom nom du conseiller clientele
	 * @param login login du conseiller clientele
	 * @param password password du conseiller clientele
	 */
	public ConseillerClientele(String prenom, String nom, String login, String password) {
		super.setPrenom(prenom);
		super.setNom(nom);
		this.login = login;
		this.password = password;
	}

	
	//---------- Getters & Setters
	
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	
	
	//---------- Reecriture de la methode toString

	@Override
	public String toString() {
		return "ConseillerClientele [login=" + login + ", password=" + password + ", gerant=" + gerant + ", clients="
				+ clients + "]";
	}

	
	
}
	
