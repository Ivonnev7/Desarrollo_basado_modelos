package modelbaseddevelopment.ventana;


//Implementamos clase de desplazamiento para que así las ventanas puedan hacerlo, este caso es vertical
public class DesplazamientoHorizontal implements Ventana {


    //La ventana será decorada con esta clase implementada para decorar
    private Ventana VentanaADecorar; 
    public DesplazamientoHorizontal(Ventana VentanaADecorar) {
        this.VentanaADecorar = VentanaADecorar;
    }


    //Se inserta display
    public void display() {
        VentanaADecorar.display();
        System.out.println("Desplazamiento de barra en horizontal");
    }
}
