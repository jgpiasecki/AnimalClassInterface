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
public class Ostrich extends Bird implements IFly, ISwim, IWalk, IMakeSound {

    String name = "Ostrich";
    double wingspan = 6.6;
    
    public Ostrich(String name, double wingspan) {
        super(name, wingspan);
        
        this.name=name;
        this.wingspan=wingspan;
        
    }

    
    
    
}
