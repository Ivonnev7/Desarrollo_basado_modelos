
//Implementación de clase Singleton
public class Singleton {

    //atributos de la clase
    private String direccion;
    private String baseDatos;
    private static  Singleton instUni;

    private Singleton(String direccion,String baseDatos){
        this.direccion = direccion;
        this.baseDatos = baseDatos;
    }


    //Implementamos gets necesarios
    public static Singleton getInst(String direccion, String baseDatos){

        if(instUni == null){
            System.out.println("Esta instancia se encuentra vacía... Creando una instancia --->");
            instUni = new Singleton(direccion, baseDatos);
        }
        System.out.println("Cerrando la instancia usada anterior --->");
        System.out.println("Creando una nueva instancia --->");
        instUni = new Singleton(direccion, baseDatos);
        return instUni;
    }

    public String getBaseDatos(){
        return baseDatos;
    }

    public String getDireccion(){
        return direccion;
    }
}
