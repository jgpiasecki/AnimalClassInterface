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
public class Penguin extends Bird implements ISwim, IWalk, IMakeSound{
    String name = "Penguin";
    double wingspan = 2.5;
    
    public Penguin(String name, double wingspan) {
        super(name, wingspan);
        
        this.name=name;
        this.wingspan=wingspan;
        
    }

 
  
    @Override
  public void swim()
  {
      System.out.println("The Penguin swims.");
  }
  
    @Override
  public void walk()
  {
      System.out.println("The Penguin walks");
  }
    
    @Override
  public void makeSound()
  {
      System.out.println("The Penguin squawks.");
  }
}
