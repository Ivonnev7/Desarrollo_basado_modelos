package modelbaseddevelopment.foxmachine;

import modelbaseddevelopment.foxmachine.descuento.Descuento;

public class Producto {
    Descuento descuento;


    //Insertamos atributos de la clase Producto
    private final String nombre;
    private final double precio;
    private final String descripcion;
    private final double descuentoprecio;


    //Creamos constructor de la clase 
    public Producto(String nombre, double precio, String descripcion, Descuento discount) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.descuento = discount;
        this.precio = precio;
        this.descuentoprecio = discount.discount(precio);
    }

    //Getters y Setter implementados 
    public String getnombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public double getdescuentoprecio() {
        return descuentoprecio;
    }

}