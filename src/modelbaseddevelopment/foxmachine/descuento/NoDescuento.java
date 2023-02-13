package modelbaseddevelopment.foxmachine.descuento;

public class NoDescuento implements Descuento{


    //Ningún descuento es aplicado
    @Override
    public double discount(double precio) {


        //retorna únicamente el precio inicial
        return precio;
    }
}