package jiraws_live;

public class Barista {
	
	public String nom;
	public String prenom;
	
	public Barista(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Cafe faireUnCafe() {
		return faireUnCafe(0, 0);
	}
	
	public Cafe faireUnCafe(Integer nombreSucre, Integer nombreLait) {
		return new Cafe(nombreSucre, nombreLait);
	}
	
	public Cafe abuserSurLeSucre(Cafe cafe) {
		System.out.println("Le Barista " + this.nom + " " + this.prenom + " ajoute du Sucre.");
		cafe.nombreSucre = 10000;
		return cafe;
	}
	
	public int testPrimitif(int primitif) {
		primitif = 4;
		return primitif;
	}

	
//	@Override
//	public String toString() {
//		return "bien";
//	}
}
