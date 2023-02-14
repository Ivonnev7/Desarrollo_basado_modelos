package modelbaseddevelopment.ventana;


//Implementamos clase, esta es en la cual se le agregaran bordes a las ventanas, usando la clase extendida

public class BordeVentana extends VentanaDecorator {
    public BordeVentana(Ventana VentanaADecorar) {
        super(VentanaADecorar);
    }

    //Se inserta display
    public void display() {
        super.display();
        System.out.println("Bordes de ventana");
    }
}