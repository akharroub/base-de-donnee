package fr.akharroub.animall.business.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.akharroub.animall.bean.Gardien;

import fr.akharroub.animall.business.IGardienBusiness;

public class GardienBusiness implements IGardienBusiness{

	@Override
	public ArrayList<Gardien> recupLaListeDesGardien() {
		ArrayList<Gardien> listedesGardien = new ArrayList<>();
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/animal", "root", "");
			
			Statement st = cnx.createStatement();
			
			ResultSet resultat = 
					st.executeQuery("SELECT nom,prenom,numero,age,urlimage FROM gardien");
			
			while (resultat.next()) {
				String nomGardien = resultat.getString("nom");
				String typeGardien = resultat.getString("prenom");
				int numeroGardien = resultat.getInt("numero");
				int ageGardien = resultat.getInt("age");
				String urlimageGardien = resultat.getString("urlimage");
				
				Gardien gr = new Gardien(nomGardien,typeGardien,numeroGardien,ageGardien,urlimageGardien);
				listedesGardien.add(gr);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return listedesGardien;
	}
	

}
