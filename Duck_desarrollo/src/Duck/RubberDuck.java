package Duck;

public class RubberDuck extends Duck {

    //Implementamos el constructor el cual tomará dos argumentos
    // y los asignará para instanciar las variables de fb y qb
   
    public RubberDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }

    //Insertamos el metodo que mostrará al pato
    
    public void display() {
        System.out.println("I'm a Rubber duck");
    }
}
