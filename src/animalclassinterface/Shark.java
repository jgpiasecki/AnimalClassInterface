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
public class Shark extends Fish implements ISwim, IMakeSound{

    String name = "Shark";
    boolean isSaltwater = true;
    public Shark(String name, Boolean isSaltWater) {
        super(name, isSaltWater);
        this.name = name;
        this.isSaltwater=isSaltWater;
    }
    
     @Override
  public void swim()
  {
      System.out.println("The Shark swims.");
  }
    
  @Override
  public void makeSound()
  {
      System.out.println("The Shark makes no sound.");
  }
    
    
}
