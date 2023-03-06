//Desarrollo de la aplicaión o Main
public class Main {

    public static void main(String [] args){

        Fachada cliente1 = new Fachada();
        cliente1.buscar("7-06-2023","29-06-2023","CDMX","Cancún");

        Fachada cliente2 = new Fachada();
        cliente2.buscar("15-05-2023","15-07-2023","CDMX","Nueva York");

        Fachada cliente3 = new Fachada();
        cliente3.buscar("8-03-2023", "20-04-2023", "CDMX", "Italia");

        Fachada cliente4 = new Fachada();
        cliente4.buscar("02-10-2023", "20-02-2023", "Puebla", "Cancún");
    }

}