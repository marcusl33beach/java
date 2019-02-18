/**
 * Show how to use an interface
 */

// Interface
interface Interface {
    public void animalSound();
    public void sleep();
}

// Car class to implement the interface
class Cat implements Interface {
    public void animalSound(){
        System.out.println("Cat says: meow!!");
    }
    public void sleep(){
        System.out.println("Zzz!");
    }
}

// One main class
class interfaceMainClass {
    public static void main(String[] args){
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.sleep();
    }
}