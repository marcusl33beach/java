/**
 * Java Class to show Try Catch Exception
 */
public class Exception {
    public static void main(String[] args){
        // Try some code
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        // Catch the error and run some code
        } catch (java.lang.Exception e) {
            System.out.println("We got and error captain!");
        }
    }
}
