/*
 * File: Dog.java
 * Author: Brannon R. Brakefield
 * Date: 8/18/16
 * Course: CS 321
 * Instructor: Dr. Daniel Rochowiak
 * This is program is my own work. 
 */
package petstest;

/**
 * A simple class that represents a dog.
 * @author Brannon R. Brakefield
 */
public class Dog extends Pet {
   
    /**
     * Constructor for pet dog that accepts a name.
     * @param name 
     */
    public Dog (String name) {
        this.name = name;
    }
    
    /**
     * Makes dog bark.
     */
    public void speak(){
        System.out.println("Bark!");
    }
}
