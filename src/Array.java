/**
 * Class to show how to use an array
 */
public class Array {
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.print(cars[0] + " "); // Prints Opel and not Volvo
        System.out.print(cars.length + " "); // Print the number of cars 4

        // Loop though the array
        for (int i = 0; i < cars.length; i++){
            System.out.print(cars[i] + " ");
        }
    }
}
