
public class Main {
	
	public static void main(String[] args) {
		Dienstleistung friseur = new Dienstleistung();
		System.out.println("Steuertarif Friseur: "+friseur.getSteuertarif()+" %");
		
		Buch harryPotter = new Buch();
		System.out.println("Steuertarif f�r das Buch Harry Potter: "+ harryPotter.getSteuertarif()+" %");
		
		Aktien dowJones = new Aktien();
		System.out.println("Steuertarif f�r die Gewinnauszahl von DowJones: "+ dowJones.getSteuertarif()+" %");
		
		Pflanze ringelblume = new Pflanze();
		System.out.println("Steuertarif f�r das Buch Harry Potter: "+ ringelblume.getSteuertarif()+" %");
	}
	
	
	

}
