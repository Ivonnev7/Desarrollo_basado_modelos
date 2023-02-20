
//Implementación de Main
public class Main {

    public static void main(String [] args){


        //Creación de la primera base de datos
        Singleton b1 = Singleton.getInst("Dirección 1", "Base de datos 1");
        System.out.println(b1.getBaseDatos());
        System.out.println(b1.getDireccion());


        //Se cierra la primera base y se crea la nueva base de datos
        Singleton b2 = Singleton.getInst("Direccion 2", "Base de datos 2");
        System.out.println(b2.getBaseDatos());
        System.out.println(b2.getDireccion());
    }

}
