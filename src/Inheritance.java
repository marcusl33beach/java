/**
 * Showing how to use Inheritance
 */
public class Inheritance {
    protected String brans = "Ford";
    public void honk(){
        System.out.println("Beep Beep!");
    }
}

/**
 * Class that inherits from the Inheritance class
 */
class Car extends Inheritance {
    private String modelName = "Mustang";
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brans + " "+ myCar.modelName);
    }
}
