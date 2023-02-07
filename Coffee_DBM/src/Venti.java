//Agregamos clase para tamaño grande, siendo extensión de la clase Size
//En este caso aumenta el 100% a su precio

public class Venti extends Size{
    Beverage beverage;
    public Venti(Beverage beverage){

        this.beverage = beverage;
        beverage.size = "Venti";

    }

    //Aumento del precio haciendo la multiplicación del precio, por 2

    @Override
    public double cost() {
        return (beverage.cost())*2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + beverage.getSize();
    }
}
