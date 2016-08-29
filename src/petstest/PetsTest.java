/*
 * File: PetsTest.java
 * Author: Brannon R. Brakefield
 * Date: 8/18/16
 * Course: CS 321
 * Instructor: Dr. Daniel Rochowiak
 * This is program is my own work. 
 */
package petstest;

/**
 * A simple class that tests the speak method for both the Cat and Dog class.
 * @author Brannon R. Brakefield
 */
public class PetsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instantiate a dog and cat object.
        Dog lucy = new Dog("Lucy");
        Cat annie = new Cat("Annie");
        
        // Say pet names. 
        System.out.println("The dog's name is " + lucy.name);
        System.out.println("The cat's name is " + annie.name);
        System.out.println();
        
        // Make pets speak.
        System.out.println(lucy.name + " the Dog says... ");
        lucy.speak();
        System.out.println(annie.name + " the Cat says... ");
        annie.speak();
        
    }
}
