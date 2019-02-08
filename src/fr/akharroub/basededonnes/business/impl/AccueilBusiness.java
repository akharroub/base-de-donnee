package fr.akharroub.basededonnes.business.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.akharroub.basededonnes.business.IAccueilBusiness;

public class AccueilBusiness implements IAccueilBusiness{
	


	@Override
	public ArrayList<String> getvilles() {
		ArrayList<String> villes = new ArrayList<>();
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/jee", "root", "");
			
			Statement sm = cnx.createStatement();
			ResultSet resultat = sm.executeQuery("select nom from ville");
			
			
			
			while (resultat.next()) {
				String nomVille = resultat.getString("nom");
				villes.add(nomVille);
			}
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return villes;
	}}
