/**
 * Show how to use a final modifier
 */
public class ModifiersFinal {
    final int x = 10;

    public static void main(String[] args){
        ModifiersFinal myObj = new ModifiersFinal(); // Create an object
        // You can only call a final
        // You can not assign a value to a final
        System.out.println(myObj.x); // Call the final
    }
} // Prints the number 10
