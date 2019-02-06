/**
 * Class to Show how to us Return value in a method
 */
public class MethodReturn {
    /** Method to add two number and return the value */
    static int addingNumber(int x, int y) {
        return x + y;
    }

    /** One Main Method to run this program */
    public static void main(String[] args) {
        System.out.println(addingNumber(3, 5));
    }
} // Returns 8
