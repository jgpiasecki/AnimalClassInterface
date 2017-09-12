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
public class Animal {
    //creates a string called name
    String name;
    
    //uses the string equal to the animals name
    public Animal(String name)
    {
        this.name = name ;   
    }
    
    //gets the animals name
    public String getName() {
        return name;
    }
    
    //sets the animals name
    public void setName(String name) {
        this.name = name;
    }
    
    //makes sure that the return is in string from
    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }

    
    
    
    
    
}
