package fr.akharroub.animall.business;

import java.util.ArrayList;

import fr.akharroub.animall.bean.animall;

public interface IAnimallBusiness {
	
	public ArrayList<String> getanimal();
	
	public ArrayList<String> getLesType();
	
	 public ArrayList<Integer> getAge();
	 
	 public ArrayList<animall> recupLaListeDesAnimaux();
}
