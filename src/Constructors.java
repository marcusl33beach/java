/**
 * show how to use a conreuctor
 */
public class Constructors {
    int modelYear; // Create a class attribute
    String modelName; // Create a class attribute

    public Constructors(int year, String name) {
        modelYear = year; // Set the initial value for the class attribute modelYear
        modelName = name; // Set the initial value for the class attribute modelName
    }

    public static void main(String[] args) {
        Constructors Car = new Constructors(1975, "Mustang"); // Create an object of class
        System.out.println(Car.modelYear + " " + Car.modelName); // Print it all out
    }
}
