package modelbaseddevelopment.ventana;


//Implementamos clase de desplazamiento para que así las ventanas puedan hacerlo, este caso es vertical
public class DesplazamientoVertical extends VentanaDecorator {
    public DesplazamientoVertical(Ventana VentanaADecorar) {
        super(VentanaADecorar);
    }


    //Implementación de display
    public void display() {
        super.display();
        System.out.println("Desplazamiento de barra en vertical");
    }
}