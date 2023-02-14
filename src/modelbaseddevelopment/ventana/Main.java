package modelbaseddevelopment.ventana;


//Implementación del main
public class Main {
    public static void main(String[] args) {

        System.out.println("Creamos una nueva ventana: ");
        Ventana ventana = new VentanaImplemen();
        ventana.display();

        System.out.println("\nLe agregamos bordes: ");
        ventana = new BordeVentana(ventana);
        ventana.display();

        System.out.println("\nLe agregamos desplazamiento vertical: ");
        ventana = new DesplazamientoVertical(ventana);
        ventana.display();

        System.out.println("\nLe agregamos desplazamiento horizontal: ");
        ventana = new DesplazamientoHorizontal(ventana);
        ventana.display();
    }
}