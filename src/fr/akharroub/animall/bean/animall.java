package fr.akharroub.animall.bean;

public class animall {
 private String nom ;
 private String type ;
 private int age;
public animall() {
	super();
	// TODO Auto-generated constructor stub
}
public animall(String nom, String type, int age) {
	super();
	this.nom = nom;
	this.type = type;
	this.age = age;
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
 * @return the type
 */
public String getType() {
	return type;
}
/**
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
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

 
 
}
