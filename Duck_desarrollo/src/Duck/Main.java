// PROGRAMA: DUCK
//ALUMNA: IVONNE VARGAS GARCÍA
//MATRÍCULA: 201957846
//FECHA: 18/01/2023
//SIMULACIÓN DE UN PATO QUE PUEDE NADAR Y VOLAR

package Duck;

//Nuestra clase main que contiene el método main, además de que performa la simulación de Duck


public class Main {

    //Método main
    
    public static void main(String[] args) {

        //Creamos un objeto de la clase MallarDuck y pasamos los objetos FlyWithWings y Quack como argumentos
        

        Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());

        //Mandamos a llamar al método showDuck
        

        mallard.showDuck();

        //Creamos un objeto de la clase RedheadDuck y pasamos los objetos de FlyWithWings y Quack como argumentos
        

        Duck redhead = new RedheadDuck(new FlyWithWings(), new Quack());

        //Mandamos a llamar a showDuck
       

        redhead.showDuck();

        //Creamos un objeto de la calse RubberDuck y pasamos los objetos de FlyNoWay y Squeak como argumentos
        

        Duck rubber = new RubberDuck(new FlyNoWay(), new Squeak());

        //Mandamos a llamar a showDuck
       

        rubber.showDuck();

        //Creamos un objeto de la clase DecoyDuck y pasamos los objetos de FlyNoWay y MuteQuack como argumentos
        

        Duck decoy = new DecoyDuck(new FlyNoWay(), new MuteQuack());


        //Mandamos a llamar a showDuck
        
        
        decoy.showDuck();
    }
}