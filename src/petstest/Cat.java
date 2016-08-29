/*
 * File: Cat.java
 * Author: Brannon R. Brakefield
 * Date: 8/18/16
 * Course: CS 321
 * Instructor: Dr. Daniel Rochowiak
 * This is program is my own work. 
 */
package petstest;

/**
 * A simple class that represents a Cat object. 
 * @author Brannon R. Brakefield
 */
public class Cat extends Pet {
    
    /**
     * Constructor for pet cat that accepts a name.
     * @param name  the name of the cat.
     */
    public Cat(String name) {
        this.name = name;
    }
    
    /**
     * Makes cat meow. 
     */
    public void speak() {
        System.out.println("Meow!");
    }
}
