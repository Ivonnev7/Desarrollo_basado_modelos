package Duck;
public class MuteQuack implements QuackBehavior {

    //Esta será la clase que implementará la interfaz "QuackBehavior"
    
    
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
