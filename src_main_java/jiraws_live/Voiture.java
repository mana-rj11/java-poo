package jiraws_live;

public class Voiture extends VehiculeTerrestre implements TestInterface {
	
	public Voiture(String marque, String modele) {
		this.marque = marque;
		this.modele = modele;
	}

	@Override
	public void testLog() {
		
	}
}