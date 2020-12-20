
public class Dienstleistung {

	Steuerklasse steuerk = new Steuer20(); 

	public void setSteuertarif(Steuerklasse steuer) { 
		steuerk = steuer;
	}
	public double getSteuertarif() {
		return steuerk.printSteuerklasse();
	}
}
