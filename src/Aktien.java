
public class Aktien {

	Steuerklasse steuerk = new Steuer27p5(); 

	public void setSteuertarif(Steuerklasse steuer) { 
		steuerk = steuer;
	}
	public double getSteuertarif() {
		return steuerk.printSteuerklasse();
	}
}
