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
    Boolean isSaltWater;
    public Fish (String name, Boolean isSaltWater)
    {
        super(name);
        this.isSaltWater = isSaltWater;
    }

    public Boolean getIsSaltWater() {
        return isSaltWater;
    }

    public void setIsSaltWater(Boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }
    
    
}
