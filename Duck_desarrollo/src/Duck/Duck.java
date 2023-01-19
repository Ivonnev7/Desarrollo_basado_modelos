package Duck;

//Implementamos la clase Duck
//Usamos showDuck, es un método que muestra performFly y performQuack y los métodos de swim se denominan

public class Duck {
    FlyBehavior fb;
    QuackBehavior qb;

    // This is a constructor that takes two arguments
    // and assigns them to the instance variables fb and qb
    public Duck(FlyBehavior fb, QuackBehavior qb) {
        this.fb = fb;
        this.qb = qb;
    }

    // performFly is a method that calls the fly method of the instance variable fb
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
    // Function to display the duck
    public void showDuck() {
        display();
        performFly();
        performQuack();
        swim();
    }
}
