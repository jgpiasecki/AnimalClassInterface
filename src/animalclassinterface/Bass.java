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
public class Bass extends Fish implements ISwim, IMakeSound{
    
    String name = "Bass";
    boolean isSaltwater = true;
    public Bass(String name, Boolean isSaltWater) {
        super(name, isSaltWater);
        this.name = name;
        this.isSaltwater=isSaltWater;
    }
    
     @Override
  public void swim()
  {
      System.out.println("The Bass swims.");
  }
    
  @Override
  public void makeSound()
  {
      System.out.println("The Bass makes no sound.");
  }
}