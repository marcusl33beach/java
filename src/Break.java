/**
 * Class to count to 3 stop before 4
 */
public class Break {
    public static void main(String[] args){
        // For loop
        for (int i = 0; i < 10; i++){
            // If with break to make the loop stop at 3
            if (i == 4){
                break;
            }
            System.out.print(i); // Print out tht numbers
        }
    }
}
