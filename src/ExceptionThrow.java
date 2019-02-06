/**
 * Java Class to show throw exception with a StarTrek twist
 */
public class ExceptionThrow {
    static void warpLevel(int lvl){
        if (lvl > 9){
            throw new ArithmeticException("I am giving it all she's got captain !!!");
        }
        else {
            System.out.println("Warp " + lvl + "Engaged!");
        }
    }

    public static void main(String[] args){
        warpLevel(15); // Set warp to 15. You know we can't get to that speed.
    }
} // Returns custom error
