package modelbaseddevelopment.foxmachine.descuento;

public class DescuentoCinco implements Descuento{


    //Clase que implementa la interfaz Descuento, el descuento se sustrae del precio
    @Override
    public double discount(double precio) {

        //Se hace descuento del 5%
        return precio - (precio * 0.05);
    }
}