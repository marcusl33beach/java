/**
 * A few classes to show how to use Polymorphism
 */

// Create an animal sound
class Polymorphism {
    public void animalSound(){
        System.out.println("The Animal makes a sound");
    }
}

// Create an pig class to use the Polymorphism class animal sound
class Pig extends Polymorphism{
    public void animalSound(){
        System.out.println("The pig says: oink oink");
    }
}

// Create an dog class to use the Polymorphism class animal sound
class Dog extends Polymorphism{
    public void  animalSound(){
        System.out.println("The dog says: bow bow");
    }
}

// Create an fox class to use the Polymorphism class animal sound
class Fox extends Polymorphism{
    public void  animalSound(){
        System.out.println("What does the fox say?");
    }
}

//Main class
class MyMainClass{
    public static void main(String[] args){
        Polymorphism myAnimal = new Polymorphism();
        Polymorphism myPig = new Pig();
        Polymorphism myDog = new Dog();
        Polymorphism myFox = new Fox();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myFox.animalSound();
    }
}
