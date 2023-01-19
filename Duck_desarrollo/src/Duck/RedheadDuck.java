package Duck;

//Aquí agregamos la subclase de la clase Duck y que contiene el método de visualización y el constructor.


public class RedheadDuck extends Duck {

    //Implementamos un constructor que tome dos argumentos y los asigne a la instancia
    //de las variables fb y qb
    

    public RedheadDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }

    //Método en el que mostramos el pato
    
    public void display() {
        System.out.println("I'm a real Redhead duck");
    }
}