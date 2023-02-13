package modelbaseddevelopment.subasta.subject;

import modelbaseddevelopment.subasta.subscriptor.Licitador;

import java.util.ArrayList;
import java.util.List;

public class Producto implements Subject {
    
    
    //Ingresamos los atributos del producto
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean disponible;


    //listamos los tenders
    private List<Licitador> Licitadors = new ArrayList<Licitador>();

    // Instanciamos constructores del producto 
    public Producto(String nombre, String descripcion, double precio, boolean disponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
    }


    @Override
    public void registerLicitador(Licitador t) {
        Licitadors.add(t);
    }

    @Override
    public void removeLicitador(Licitador t) {
        Licitadors.remove(t);
    }

    @Override
    public void notifyLicitadors() {
        for (Licitador Licitador : Licitadors) {
            Licitador.oferta(this);
        }
    }


    //Implementamos todos los Getters y setters necesarios
    public String getnombre() {
        return nombre;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public double getprecio() {
        return precio;
    }
    

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setprecio(double precio) {
        this.precio = precio;
        notifyLicitadors();
    }

    public boolean isdisponible() {
        return disponible;
    }

    public void setdisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<Licitador> getLicitadors() {
        return Licitadors;
    }
}