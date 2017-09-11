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
public class Bat extends Mammal implements IFly, ISwim, IWalk, IMakeSound{
    
 
    public Bat(String name, double bodyTemp) {
        super(name, bodyTemp);

    }
    
     @Override
    public void fly()
    {
        System.out.println("The Bat flys.");
    }
    
    @Override
  public void swim()
  {
      System.out.println("The Bat swims.");
  }
  
    @Override
  public void walk()
  {
      System.out.println("The Bat walks.");
  }
    
    @Override
  public void makeSound()
  {
      System.out.println("The Bat squeaks.");
  }
}
