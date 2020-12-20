
public class Context {
	
	  // Instanzvariable für die Strategy (Komposition) 
    // vom Typ des Interfaces -> Implementierungunabhängigkeit 
    // Defaultverhalten: ConcreteStrategyA 
    private Steuerklasse strategy = new Steuer20(); 

    public void execute() { 
        //delegiert Verhalten an Strategy-Objekt 
        strategy.printSteuerklasse(); 
    } 

    public void setStrategy(Steuerklasse strategy) { 
        strategy = this.strategy; 
    } 

    public Steuerklasse getStrategy() { 
        return strategy; 
    } 
} 


