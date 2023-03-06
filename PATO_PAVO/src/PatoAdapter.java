
//Se implementa la clase para usar el patrón adaptador y se pueda usar a la clase pato

import static java.lang.System.out;

public class PatoAdapter implements Pavo {
    Pato Pato;

    public PatoAdapter(Pato Pato) {
        this.Pato = Pato;
    }

    public void gobble() {
        Pato.quack();
    }

    public void fly() {
        Pato.fly();
        out.println("a short distance");
    }
}