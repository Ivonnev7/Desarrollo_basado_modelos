public abstract class Beverage {

    String description = "Unknow Bevarage";
    String size = "Unknow size";

    public String getDescription(){

        return description;
    };

    public String getSize(){
        return size;
    }

    public  abstract double cost();

}
