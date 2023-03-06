
//Implementamos patrón fachada
public class Fachada {

    private final Avion FachadaAvion;
    private final Hotel FachadaHotel;

    public Fachada() {
        FachadaAvion = new Avion();
        FachadaHotel = new Hotel();
    }

    public void buscar(String fecha_de_Ida, String fecha_de_Vuelta, String ORIGEN, String DESTINO) {

        FachadaAvion.buscarAvion(fecha_de_Ida, fecha_de_Vuelta, ORIGEN, DESTINO);

        FachadaHotel.buscarHotel(fecha_de_Ida, fecha_de_Vuelta, ORIGEN, DESTINO);
    }
}