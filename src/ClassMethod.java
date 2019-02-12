/**
 * Class to show static and public methods
 */
public class ClassMethod {
    // Static method
    static void staticMethod() {
       System.out.println("No need to create a object when calling a static method");
    }

    // Public method
    public void publicMethod() {
        System.out.println("You need to create an object to call a public method");
    }

    // Main method
    public static void main(String[] args) {
        staticMethod(); // Calling the static method

        ClassMethod obj = new ClassMethod(); // Making an object to be used below
        obj.publicMethod(); // Calling the public method with the object.
    }
}
