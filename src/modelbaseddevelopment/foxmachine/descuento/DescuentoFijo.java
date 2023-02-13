package modelbaseddevelopment.foxmachine.descuento;

public class DescuentoFijo implements Descuento{


    //Clase que implementa la interfaz descuento
    @Override
    public double discount(double precio) {


        //Descuento fijo de 50 
        return precio - 50;
    }
}

