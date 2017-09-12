/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalclassinterface;

/**
 *
 * @author jpiasecki
 */
public class Bird extends Animal{
    //creates a double for the birds wingSpan
    double wingspan;
    
    //gets the name super and tells the wingspan to equal the double
    public Bird(String name, double wingspan)
    {
        super(name);
        this.wingspan = wingspan;
    }
    
    //gets the wingspan
    public double getWingspan() {
        return wingspan;
    }

    //sets the wingspan
    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    //makes sure that a string is returned
    @Override
    public String toString() {
        return "Bird{" + "wingspan=" + wingspan + '}';
    }
    
    
}
