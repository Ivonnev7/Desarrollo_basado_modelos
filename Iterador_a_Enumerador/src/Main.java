import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Navidad ");
        list.add("es ");
        list.add("la ");
        list.add("mejor ");
        list.add("festividad ");
        list.add("de ");
        list.add("TODAS");
        list.add("!");

        System.out.println("La lista es: \n " + list);

        Iterator<String> iter = list.iterator();
        Enumeration ite = new Iterator_Enumeration(iter);

        System.out.println("\nLos valores de la lista Iterator son: ");
        while (iter.hasNext()) {
            System.out.print(ite.nextElement() + " ");
        }
    }
}