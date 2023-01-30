package tienda;

//Creamos interfaz del proveedor

interface Proveedor {

    void suscribir(Suscriptor suscriptor, Producto producto);

    void notificarDisp(Producto producto);
}
