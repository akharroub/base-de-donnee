package fr.akharroub.animall.bean;

public class Gardien {
	private String nom;
	private String prenom;
	private int numero;
	private int age;
	private String urlimage;
	public Gardien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gardien(String nom, String prenom, int numero, int age, String urlimage) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.age = age;
		this.urlimage = urlimage;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the urlimage
	 */
	public String getUrlimage() {
		return urlimage;
	}
	/**
	 * @param urlimage the urlimage to set
	 */
	public void setUrlimage(String urlimage) {
		this.urlimage = urlimage;
	}
	
	

}
