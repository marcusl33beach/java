/**
 * Java Class to show how to call a method with Parameters
 */
public class MethodParameters {
    /** Method to print out names */
    static void name(String fname) {
        System.out.println(fname + " Reference");
    }

    /** Main Method to rule them all */
    public static void main(String[] args) {
        name("Liam");
        name("Jenny");
        name("Anja");
    }
}
