
public class Pflanze {

	Steuerklasse steuerk = new Steuer13(); 

	public void setSteuertarif(Steuerklasse steuer) { 
		steuerk = steuer;
	}
	public double getSteuertarif() {
		return steuerk.printSteuerklasse();
	}
}
