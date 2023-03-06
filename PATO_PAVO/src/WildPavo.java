

//Se implementa el segundo tipo de pato que tenemos junto con sus respectivas operaciones
import static java.lang.System.out;

class WildPavo implements Pavo {
    @Override
    public void gobble() {
        out.println("gobble gobble");
    }

    @Override
    public void fly() {
        out.println("I'm flying a short distance");
    }
}