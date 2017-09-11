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
    int bodyTemp;
    public Mammal(String name, int bodyTemp)
    {
        super(name);
        this.bodyTemp = bodyTemp;
    }

    public int getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(int bodyTemp) {
        this.bodyTemp = bodyTemp;
    }
    
}
