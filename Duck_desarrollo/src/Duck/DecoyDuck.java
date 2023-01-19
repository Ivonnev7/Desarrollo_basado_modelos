package Duck;


//Esta es una subclase de la clase Duck y que contiene el método de muestra y constructor


public class DecoyDuck extends Duck {

    //Constructor que toma dos argumentos y los asigna a las variables fb y qb
    

    public DecoyDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }

    //Método que muestra a Duck
    
    
    public void display() {
        System.out.println("I'm a simple Decoy duck");
    }
}