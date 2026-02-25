package jiraws_live;

public abstract class Vehicule {
	
	public String marque;
	public String modele;
	
	public int annee;
	
	public String type;
	public String typeLocomotion;
	
	public abstract void demarrer();
	public abstract void stopper();
		
}