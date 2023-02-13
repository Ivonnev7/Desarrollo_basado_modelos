package modelbaseddevelopment.foxmachine.descuento;

public class DescuentoFrecuente implements Descuento{

    //Siento un cliente frecuente obtienes un descuento del 15% en el precio, aquí se aplica
    @Override
    public double discount(double precio) {
        return precio - (precio * 0.15);
    }
}