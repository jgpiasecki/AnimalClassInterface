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
public class Mammal extends Animal{
    //creates a double called bodyTemp
    double bodyTemp;
    
    //gets the name super and sets the mammals bodyTemp equal to the double
    public Mammal(String name, double bodyTemp)
    {
        super(name);
        this.bodyTemp = bodyTemp;
    }
    
    //gets the bodyTemp
    public double getBodyTemp() {
        return bodyTemp;
    }
    
    //sets and returns the bodyTemp
    public void setBodyTemp(double bodyTemp) {
        this.bodyTemp = bodyTemp;
    }
    
    //makes sure the return is in string formate
    @Override
    public String toString() {
        return "Mammal{" + "bodyTemp=" + bodyTemp + '}';
    }
    
    
    
}
