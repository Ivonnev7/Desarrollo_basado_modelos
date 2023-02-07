//Tarea TAMAÑOS DE CAFÉ
//ALUMNA: IVONNE VARGAS GARCÍA
//MATERIA: DESARROLLO BASADO EN MODELOS



public class Main {

    public static void main(String[] args) throws Exception {

        
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Expresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();  
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Small(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        Beverage beverage4 = new Decaf();
        beverage4 = new Mocha(beverage4);
        beverage4 = new Mocha(beverage4);
        beverage4 = new Milk(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new Small(beverage4);
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());

        Beverage beverage5 = new Expresso();
        beverage5 = new Whip(beverage5);
        beverage5 = new Milk(beverage5);
        beverage5 = new Milk(beverage5);
        beverage5 = new Medium(beverage5);
        System.out.println(beverage5.getDescription() + " $" + beverage5.cost());

        Beverage beverage6 = new DarkRoast();
        beverage6 = new Mocha(beverage6);
        beverage6 = new Mocha(beverage6);
        beverage6 = new Whip(beverage6);
        beverage6 = new Venti(beverage6);
        System.out.println(beverage6.getDescription() + " $" + beverage6.cost());


        Beverage beverage7 = new HouseBlend();
        System.out.println(beverage7.getDescription() + " $" + beverage7.cost());
    }



}
