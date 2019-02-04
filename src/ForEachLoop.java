/**
 * Class to show for each loop.
 */
public class ForEachLoop {
    public static void main(String[] args){
        String[] names = {"Mike", "Butch", "Kuda", "Marc"};
        for (String name : names){
            System.out.print(name + " ");
        }
    } // Should print all the name with a space
}
