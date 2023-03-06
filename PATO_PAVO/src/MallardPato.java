
//Se implementa el primer tipo de pato que tenemos junto con sus respectivas operaciones
import static java.lang.System.out;

public class MallardPato implements Pato {
    @Override
    public void quack() {
        out.println("Quack!");
    }

    @Override
    public void fly() {
        out.println("I'm flying");
    }
} 
