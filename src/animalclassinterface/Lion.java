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
public class Lion extends Mammal implements ISwim, IWalk, IMakeSound{
    
    String name = "Lion";
    double bodyTemp = 102.5;
    
    public Lion(String name, double bodyTemp) {
        super(name, bodyTemp);
        
        this.name=name;
        this.bodyTemp=bodyTemp;
    }
    
    @Override
  public void swim()
  {
      System.out.println("The Lion swims.");
  }
  
    @Override
  public void walk()
  {
      System.out.println("The Lion walks.");
  }
    
    @Override
  public void makeSound()
  {
      System.out.println("The Lion roars.");
  }
}
