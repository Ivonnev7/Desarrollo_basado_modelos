package modelbaseddevelopment.ventana;


//Implementación de Decorator de la ventana
public class VentanaDecorator implements Ventana{


    // VentanaADecorar se modificará por las clases de VentanaDecorator, debido a esto tenemos que protegerla
    protected Ventana VentanaADecorar;

    public VentanaDecorator(Ventana VentanaADecorar) {
        this.VentanaADecorar = VentanaADecorar;
    }

    public void display() {
        VentanaADecorar.display();
    }
}