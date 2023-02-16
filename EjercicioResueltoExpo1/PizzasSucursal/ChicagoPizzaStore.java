package PizzasSucursal;

public class ChicagoPizzaStore extends PizzaStore{
    
	Pizza createPizza(String item) {

        	if (item.equals("Queso")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("Veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("Clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("Pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
            }else if (item.equals("Hawaiana")){
                    return new ChicagoStyleHawaianaPizza();
        	} else return null;
	}
}
