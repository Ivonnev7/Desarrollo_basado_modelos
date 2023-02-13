package modelbaseddevelopment.foxmachine;

import modelbaseddevelopment.foxmachine.descuento.*;

public class Main {

    public static void main(String[] args) {



        //Creamos un nuevo producto pero un cliente frecuente obtiene un 15% de descuento
        Producto Producto = new Producto("Epson Ecotank L3250", 5000, "Tecnología de impresión de primera", new DescuentoFrecuente());


        // Creamos un nuevo producto sin descuento
        Producto Producto2 = new Producto("Epson Ecotank L3250", 5688, "Tecnología de impresión de primera", new NoDescuento());


        //Creamos con el mismo producto, un descuento fijo
        Producto Producto3 = new Producto("Cannon PIXMA G2110", 17900, "Calidad y multifuncionalidad", new DescuentoFijo());


        //Creamos un nuevo prodcuto pero ahora con descuento de 5% 
        Producto Producto4 = new Producto("HP 135NW", 17900, "Calidad láser", new DescuentoCinco());


        //Mostramos los productos, primero sin descuento y luego con descuento

        System.out.println("\nProducto 1: (cliente frecuente) \n\t" + Producto.getnombre() + "\n\tDescripción: " + Producto.getdescripcion() + " \n\tPrecio Original: " + Producto.getprecio() + " \n\tPrecio con Descuento: " + Producto.getdescuentoprecio());

        System.out.println("\nProducto 2: (sin descuento) \n\t" + Producto2.getnombre() + "\n\tDescripción: " + Producto2.getdescripcion() + " \n\tPrecio Original: " + Producto2.getprecio() + " \n\tPrecio con Descuento: " + Producto2.getdescuentoprecio());

        System.out.println("\nProducto 3: (descuento fijo por 50) \n\t" + Producto3.getnombre() + "\n\tDescripción: " + Producto3.getdescripcion() + " \n\tPrecio Original: " + Producto3.getprecio() + " \n\tPrecio con Descuento: " + Producto3.getdescuentoprecio());

        System.out.println("\nProducto 4: (Descuento de 5%) \n\t" + Producto4.getnombre() + "\n\tDescripción: " + Producto4.getdescripcion() + " \n\tPrecio Original: " + Producto4.getprecio() + " \n\tPrecio con descuento: " + Producto4.getdescuentoprecio());
    }
}