/**
 * Class to show an Enum class
 */
public class Enums{
    // Enum Class
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    // Main
    public static void main(String[] args) {
        // Call Enum variable
        Level myVar = Level.MEDIUM;
        // print
        System.out.println(myVar);
    }
} //Returns MEDIUM

