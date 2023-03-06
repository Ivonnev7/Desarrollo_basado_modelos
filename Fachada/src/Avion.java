
//Implementación de la clase avión, en la cual agregamos las operaciones de impresión de nuestro vuelo, origen
//aerolíneas disponibles
public class Avion {

    public void buscarAvion(String fecha_de_Ida, String fecha_de_Vuelta, String ORIGEN, String DESTINO) {

        System.out.println("\nVuelos para " + DESTINO + " \nOrigen en: " + ORIGEN);

        System.out.println("Su salida de Partida es: " + fecha_de_Ida + " Su regreso es en: " + fecha_de_Vuelta);

        System.out.println("\nAerolíneas disponibles encontradas: ");

        System.out.println("Aeroméxico");

        System.out.println("Volaris");

        System.out.println("VivaAerobus");

        System.out.println("Interjet");

        System.out.println("DELTA");

        System.out.println("UNITED");
    }

}