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
public class FlyingFish extends Fish implements ISwim, IMakeSound{
    
    String name = "FlyingFish";
    boolean isSaltwater = true;
    public FlyingFish(String name, Boolean isSaltWater) {
        super(name, isSaltWater);
        this.name = name;
        this.isSaltwater=isSaltWater;
    }
    
     @Override
  public void swim()
  {
      System.out.println("The FlyingFish swims.");
  }
    
  @Override
  public void makeSound()
  {
      System.out.println("The FlyingFish makes no sound.");
  }
}
