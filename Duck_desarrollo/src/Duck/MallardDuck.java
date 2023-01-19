package Duck;

//Aquí tenemos la subclase de la clase Duck
//En esta clase se usará para implementar "MallarDuck" y además contendrá el metodo de display


public class MallardDuck extends Duck {

    //Constructor que toma 2 argumentos y las asigna a la instancia de variables
    

    public MallardDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }

    //Metódo que muestra pato
    
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}