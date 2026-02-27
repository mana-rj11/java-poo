package jiraws_live;

public class Test {
	
	public static void main(String[] args) {
		
		Barista newBarista = new Barista("JirAWS", "Youtube");
		
		Cafe newCafe = newBarista.faireUnCafe(0, 4);
		Cafe secondCafe = newBarista.faireUnCafe();
		
		afficherNombreSucre(newCafe);
		afficherNombreSucre(secondCafe);

		
		newBarista.abuserSurLeSucre(newCafe);
		newBarista.abuserSurLeSucre(secondCafe);

		
		afficherNombreSucre(newCafe);
		afficherNombreSucre(secondCafe);
		
		newBarista.toString();
		
		
	}
	
	public static void afficherNombreSucre(Cafe newCafe) {
		System.out.println("Nombre de sucre actuel dans le cafe :" + newCafe.nombreSucre);

	}

}
