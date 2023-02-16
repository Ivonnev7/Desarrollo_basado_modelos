package PizzasSucursal;

public class NYPizzaStore extends PizzaStore{

        Pizza createPizza(String item) {


            if (item.equals("Queso")) {
                return new NYStyleCheesePizza();
            } else if (item.equals("Veggie")) {
                return new NYStyleVeggiePizza();
            } else if (item.equals("Clam")) {
                return new NYStyleClamPizza();
            } else if (item.equals("Pepperoni")) {
                return new NYStylePepperoniPizza();
            } else if (item.equals("Hawaiana")){
                return new NYStyleHawaianaPizza();
            }else return null;
        }
        
    }