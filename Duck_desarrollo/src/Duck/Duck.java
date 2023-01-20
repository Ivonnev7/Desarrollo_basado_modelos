package Duck;

//Implementamos la clase Duck
//Usamos showDuck, es un método que muestra performFly y performQuack y los métodos de swim se denominan

public class Duck {
    FlyBehavior fb;
    QuackBehavior qb;

    //Constructor que toma dos argumentos y los asigna a las variables instanciadas fb y qb
    
    
    public Duck(FlyBehavior fb, QuackBehavior qb) {
        this.fb = fb;
        this.qb = qb;
    }

    //perFormFly es un método que manda a llamar al método de la variable instanciada fb
    
    
    public void performFly() {
        fb.fly();
    }
    public void performQuack() {
        qb.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public void display() {
        System.out.println("I'm a real Duck");
    }
    
    //Muestreo de función de duck
    
    public void showDuck() {
        display();
        performFly();
        performQuack();
        swim();
    }
}
