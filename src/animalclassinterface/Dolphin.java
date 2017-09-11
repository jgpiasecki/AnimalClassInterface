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
public class Dolphin extends Mammal implements ISwim, IMakeSound{
    String name = "Dolphin";
    double bodyTemp = 98.6;
    
    public Dolphin(String name, double bodyTemp) {
        super(name, bodyTemp);
        this.name=name;
        this.bodyTemp=bodyTemp;
    }
    
    
    
      @Override
  public void swim()
  {
      System.out.println("The Dolphin swims.");
  }
  
  @Override
  public void makeSound()
  {
      System.out.println("The Dolphin squeaks.");
  }
}
