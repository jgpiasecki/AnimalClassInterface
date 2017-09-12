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
public class Fish extends Animal {
    //creates a boolean to see if the fish is salt water
    Boolean isSaltWater;
    
    //gets the name super and tells the saltwater to equal the boolean
    public Fish (String name, Boolean isSaltWater)
    {
        super(name);
        this.isSaltWater = isSaltWater;
    }

    //gets the saltwater return
    public Boolean getIsSaltWater() {
        return isSaltWater;
    }
    //sets the saltwater return
    public void setIsSaltWater(Boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }

    //makes sure that a string is returned
    @Override
    public String toString() {
        return "Fish{" + "isSaltWater=" + isSaltWater + '}';
    }
    
    
}
