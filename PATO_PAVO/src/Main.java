

import static java.lang.System.*;

//Creamos el main
public class Main {

    public static void main(String[] args) {

        //Agregamos las clases de los tipos de patos junto con el adapter
        Pato Pato = new MallardPato();
        Pavo Pavo = new WildPavo();
        Pavo PatoaPavo = new PatoAdapter(Pato);


        //Imprimimos el mensaje del pavo y del pato adaptador
        out.println("\nThe Pavo says...");
        testPavo(Pavo);

        out.println("\nThe Pato adapter says...");
        testPavo(PatoaPavo);
    }
    static void testPavo(Pavo Pavo) {
        Pavo.gobble();
        Pavo.fly();
    }
}