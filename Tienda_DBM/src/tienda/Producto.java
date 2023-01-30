package tienda;

//Iniciamos interfaz de los productos

interface Producto {

    String getNombre();

    void setNombre(String nombre);

    String getDescripcion();

    void setDescripcion(String descripcion);

    double getPrecio();

    void setPrecio(double precio);

    boolean isDisponible();
    
    void setDisponible(boolean disponible);
}