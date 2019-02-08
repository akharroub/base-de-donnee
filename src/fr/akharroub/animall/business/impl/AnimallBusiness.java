package fr.akharroub.animall.business.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.akharroub.animall.bean.animall;
import fr.akharroub.animall.business.IAnimallBusiness;

public class AnimallBusiness implements IAnimallBusiness{

	@Override
	public ArrayList<String> getanimal() {

		ArrayList<String> animal = new ArrayList<>();

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/animal", "root", "");

			Statement sm = cnx.createStatement();
			ResultSet resultat = sm.executeQuery("select nom from zoo");

			while (resultat.next()) {
				String nomAnimal = resultat.getString("nom");
				animal.add(nomAnimal);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return animal;
	}

	@Override
	public ArrayList<String> getLesType() {

		ArrayList<String> typeanimal = new ArrayList<>();

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/animal", "root", "");

			Statement sm = cnx.createStatement();
			ResultSet resultat = sm.executeQuery("select type from zoo");

			while (resultat.next()) {
				String typeAnimal = resultat.getString("type");
				typeanimal.add(typeAnimal);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return typeanimal;
	}

	@Override
	public ArrayList<Integer> getAge() {

		ArrayList<Integer> ageAnimal = new ArrayList<>();

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/animal", "root", "");
			Statement sm = cnx.createStatement();
			ResultSet resultat = sm.executeQuery("select age from zoo");

			while (resultat.next()) {
				int Age = resultat.getInt("age");
				ageAnimal.add(Age);
			} 
		}catch (Exception e) {
				e.printStackTrace();
		}

		return ageAnimal;
	}

	@Override
	public ArrayList<animall> recupLaListeDesAnimaux() {
		
ArrayList<animall> listedesAnimaux = new ArrayList<>();
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/animal", "root", "");
			
			Statement st = cnx.createStatement();
			
			ResultSet resultat = 
					st.executeQuery("SELECT nom, type, Age FROM zoo");
			
			while (resultat.next()) {
				String nomAnimal = resultat.getString("nom");
				String typeAnimal = resultat.getString("type");
				int esp = resultat.getInt("Age");
				
				animall an = new animall(nomAnimal, typeAnimal, esp);
				listedesAnimaux.add(an);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listedesAnimaux;
	}
	


}
