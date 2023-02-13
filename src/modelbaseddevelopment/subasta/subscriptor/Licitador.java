package modelbaseddevelopment.subasta.subscriptor;

import modelbaseddevelopment.subasta.subject.Producto;
import modelbaseddevelopment.subasta.subject.Subject;

public class Licitador implements Subscriptor{

    
    //Atributo de la clase 
    private String nombre;

    // Constructor
    public Licitador(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void oferta(Subject subject) {
        Producto product = (Producto) subject;
        System.out.println("[Mensaje para: "+ this.nombre +"]: Se ha realizado una actualización al precio del producto [" + product.getnombre() + "]: " + product.getprecio());
    }


    // Oferta del producto

    public void offer(Producto product, double precio) {
        product.setprecio(precio);
    }
}