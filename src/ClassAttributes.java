/**
 * Class to show how to call attributes
 */
public class ClassAttributes {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args){
        ClassAttributes myObj = new ClassAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
