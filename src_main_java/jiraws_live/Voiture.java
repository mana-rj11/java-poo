package jiraws_live;

public class Voiture extends Vehicule{
	
	public Voiture(String marque, String modele) {
		this.marque = marque;
		this.modele = modele;
	}
	
	@Override
	public String toString() {
		return "-> " + this.marque + " - " + this.modele;
	}
}
