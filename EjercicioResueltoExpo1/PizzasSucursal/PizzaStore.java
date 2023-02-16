package PizzasSucursal;

public abstract class PizzaStore {

    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        
        Pizza pizza = createPizza(type);
        pizza.preparar();
        pizza.hornear();
        pizza.cortar();
        pizza.cajas();
        pizza.toString();
        return pizza;
    }
    
}
