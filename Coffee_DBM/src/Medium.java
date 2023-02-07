//Agregamos clase para el tamaño mediano, siendo extensión de la clase Size
//En este caso el precio subirá un 50%


public class Medium extends Size{

    Beverage beverage;

    public Medium(Beverage beverage){

        this.beverage = beverage;
        beverage.size = "Medium";

    }
    //Aquí se hace el aumento del costo multiplicándolo por 0.5

    @Override
    public double cost() {
        return (beverage.cost()) + (beverage.cost()) * 0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + beverage.getSize();
    }
}
