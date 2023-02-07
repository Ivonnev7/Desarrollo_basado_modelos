//Agregamos clase para el tamaño "chico", siendo extensión de la clase Size
//En este caso el precio no variará, es decir se mantiene fijo el precio 

public class Small extends Size{

    Beverage beverage;
    public Small(Beverage beverage){

        this.beverage = beverage;
        beverage.size = "Small";

    }
    @Override
    public double cost() {
        return beverage.cost();
    }



    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + beverage.getSize();
    }
}
