package modelbaseddevelopment.subasta;

import modelbaseddevelopment.subasta.subject.Producto;
import modelbaseddevelopment.subasta.subscriptor.Licitador;

public class Main {
    public static void main(String[] args) {

        // Creamos licitadores
        Licitador Licitador1 = new Licitador("Ivonne");
        Licitador Licitador2 = new Licitador("David");
        Licitador Licitador3 = new Licitador("Carmen");
        Licitador Licitador4 = new Licitador("Atenas");
        Licitador Licitador5 = new Licitador("Fabián");
       


        //Los primeros 3 licitadores ofertan por el producto 1 el cual es un iPhone
        // Los otros 2 ofertarán por el producto 2 el cual es un iPad

        // Crearemos productos
        Producto product1 = new Producto("iPhone 14 Pro Max", "Celular", 30000, true);
        Producto product2 = new Producto("iPad Air", "Tableta", 20000, true);

        // Mostramos productos
        System.out.println("\nProducto 1: " + product1.getnombre() + " Precio inicial: " + product1.getprecio());
        System.out.println("Producto 2: " + product2.getnombre() + " Precio inicial: " + product2.getprecio() + "\n");

        // Subscribimos a los productos
        product1.registerLicitador(Licitador1);
        product1.registerLicitador(Licitador2);
        product1.registerLicitador(Licitador3);
        product1.registerLicitador(Licitador4);

        //Se realiza la oferta por los productos y se notifica a los demás licitadores
        Licitador1.offer(product1, 20000);
        Licitador2.offer(product1, 22000);

        // Se debe notificar a los licitadores que el precio ha cambiado
        //Con la primera oferta se retiran del producto 1 ciertos licitadores, 
        //estos se unen al producto 2, al igual que los licitadores 4 y 5

        product1.removeLicitador(Licitador2);
        product1.removeLicitador(Licitador3);

        product2.registerLicitador(Licitador2);
        product2.registerLicitador(Licitador3);
        product2.registerLicitador(Licitador4);
        product2.registerLicitador(Licitador5);
      

        // El licitador 3 y 4 hacen ofertas 
        Licitador3.offer(product1, 25000);
        Licitador4.offer(product2, 22000);

        // Los licitadores del producto 1 se retiran y gana Licitador 3
        product1.removeLicitador(Licitador2);
        product1.removeLicitador(Licitador4);
        product1.removeLicitador(Licitador1);



        //Licitadores hacen ofertas por el producto 2
        Licitador5.offer(product2, 18900);
        Licitador2.offer(product2, 18500);
        Licitador3.offer(product2, 18700);

        // Los licitadores del producto 2 se retiran y gana Licitador 5
        product2.removeLicitador(Licitador2);
        product2.removeLicitador(Licitador3);
        product2.removeLicitador(Licitador4);



        // Se modifica el estado de los productos
        product2.setdisponible(false);
        System.out.println("Producto 2: " + product2.getnombre() + " Precio base: " + product2.getprecio() + " Disponibilidad: " + product2.isdisponible() + "\n");
        product1.setdisponible(false);
        System.out.println("Producto 1:" + product1.getnombre() + "Precio base:" + product1.getprecio() + "Disponibilidad: " + product1.isdisponible() + "\n");
    }
}