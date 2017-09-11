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
public class Eagle extends Bird implements IFly, ISwim, IWalk, IMakeSound{
    
    String name = "Eagle";
    double wingspan = 7.5;
    
    public Eagle(String name, double wingspan) {
        super(name, wingspan);
        
        this.name=name;
        this.wingspan=wingspan;
    }
    
    @Override
    public void fly()
    {
        System.out.println("The Eagle flys.");
    }
    @Override
  public void swim()
  {
      System.out.println("The Eagle swims.");
  }
  
    @Override
  public void walk()
  {
      System.out.println("The Eagle walks.");
  }
    
    @Override
  public void makeSound()
  {
      System.out.println("The Eagle screeches.");
  }
}
