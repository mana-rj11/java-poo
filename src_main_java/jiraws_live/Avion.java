package jiraws_live;

public class Avion extends Vehicule {

	@Override
	public void demarrer() {
		System.out.println("Le réacteur souffle");
	}

	@Override
	public void stopper() {
		System.out.println("Le réacteur s'eteint");
	}
	
}
