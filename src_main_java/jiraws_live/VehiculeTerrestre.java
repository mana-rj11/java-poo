package jiraws_live;

public abstract class VehiculeTerrestre extends Vehicule {

	@Override
	public void demarrer() {
		System.out.println("Le moteur démarre et brule de l'essence");
	}

	@Override
	public void stopper() {
		System.out.println("Le moteur arrete de tourner");
	}
	
}
