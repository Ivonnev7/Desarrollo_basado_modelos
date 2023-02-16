package PizzasSucursal;

public class Main {
    public static void main(String[] args) {
        NYPizzaStore nystore = new NYPizzaStore();
        ChicagoPizzaStore chicagostore = new ChicagoPizzaStore();


        Pizza pizza = nystore.orderPizza("Queso");
        System.out.println("Orden de Ivonne: " + pizza.getnombre() + "\n");

        pizza = chicagostore.orderPizza("Pepperoni");
        System.out.println("Orden de Michelle: " + pizza.getnombre() + "\n");

        pizza = nystore.orderPizza("Hawaiana");
        System.out.println("Orden de Jorge: " + pizza.getnombre() + "\n");

        pizza = chicagostore.orderPizza("Veggie");
        System.out.println("Orden de Giselle: " + pizza.getnombre()+ "\n");

        pizza = nystore.orderPizza("Clam");
        System.out.println("Orden de Fabián: " + pizza.getnombre() + "\n");
        
    }
}
    
