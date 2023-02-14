package modelbaseddevelopment.ventana;


//Implementamos clase VentanaImplemen, que esta precisamente implementa Ventana
public class VentanaImplemen implements Ventana {


    //Agregamos el atributo descripción
    //En este caso a la descripción no le agregaremos ninguna decoración
    private String descripcion = "Ventana Simple";

    
    //Implementamos nuestro get que usaremos
    public String getdescripcion() {
        return descripcion;
    }

    public void display() {
        System.out.println("Displaying " + descripcion);
    }
}