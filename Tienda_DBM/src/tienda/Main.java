//EJERCICIO PATRÓN OBSERVADOR
//ALUMNA: IVONNE VARGAS GARCÍA
//MATRÍCULA: 201957846
//MATERIA: DESARROLLLO BASADO EN MODELOS
//FECHA: 28/01/2023

package tienda;

// Iniciamos función principal

public class Main {
    public static void main(String[] args) {

        // Implementación de nuestra tienda

        Tienda tienda = new Tienda("CompraTODO");

        // Implementación de los Productos en existencia
        
        ProductoImpl producto1 = new ProductoImpl("iPhone", "iPhone 14 Pro Max", 30000, true, tienda);
        ProductoImpl producto2 = new ProductoImpl("Refrigerador", "Refrigerador de 16 pies", 15000, true, tienda);
        ProductoImpl producto3 = new ProductoImpl("Lavadora", "Lavadora de 18 kg", 8000, true, tienda);

        // Implementación de los clientes
        Cliente cliente1 = new Cliente("Ivonne");
        Cliente cliente2 = new Cliente("Carmen");
        Cliente cliente3 = new Cliente("Fabián");

        // Suscripción de los clientes
        // Primero suscribimos a Ivonne, esta se suscribe a los cambios de precio del iphone
        tienda.suscribir(cliente1, producto1);


        // Ahora suscribimos a Carmen, se suscribe a los cambios de precio del iPhone y del refrigerador
        tienda.suscribir(cliente2, producto1);
        tienda.suscribir(cliente2, producto2);

        //Por último suscribimos a Fabián, él se suscribe a los cambios de precio del refrigerador y Lavadora
        tienda.suscribir(cliente3, producto2);
        tienda.suscribir(cliente3, producto3);


        // Cambio de precio del iPhone
        producto1.setPrecio(27000);

        // Cambio de precio del refrigerador
        producto2.setPrecio(10000);

        //Cambio de precio de la lavadora
        producto3.setPrecio(6000);

        // Cambio de disponibilidad del televisor
        producto1.setDisponible(false);
    }
}