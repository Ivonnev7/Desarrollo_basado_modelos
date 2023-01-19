package Duck;

//Subclase de la clase Duck y que contiene el método de muestra y constructor



public class BallonDuck extends Duck {

    //Constructor que toma dos argumentos y los asigna a la instancia de variables fb y qb
    

    public BallonDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }

    //Método que muestra a Duck
    
    
    public void display() {
        System.out.println("I'm a Ballon duck");
    }
}
