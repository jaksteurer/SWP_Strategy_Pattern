
public class Buch {
	
	Steuerklasse steuerk = new Steuer10(); 

	public void setSteuertarif(Steuerklasse steuer) { 
		steuerk = steuer;
	}
	public double getSteuertarif() {
		return steuerk.printSteuerklasse();
	}

}
