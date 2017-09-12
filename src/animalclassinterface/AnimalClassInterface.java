/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalclassinterface;

import java.util.ArrayList;

/**
 *
 * @author jpiasecki
 */
public class AnimalClassInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ostrich Tyler = new Ostrich("Tyler",6.6);
        Penguin Caleb = new Penguin("Caleb",2.5);
        Eagle John = new Eagle("John",7.5);
        Dolphin AG = new Dolphin("AG",98.6);
        Lion Aiden = new Lion("Aiden",102.5);
        Bat Parker = new Bat("Parker",105.8);
        Shark Israel = new Shark("Israel",true);
        Bass Blake = new Bass("Blake",true);
        FlyingFish Timmy = new FlyingFish("Timmy",true);
        
        ArrayList<Animal> animals = new ArrayList<>();
        
        animals.add(Tyler);
        animals.add(Caleb);
        animals.add(John);
        animals.add(AG);
        animals.add(Aiden);
        animals.add(Parker);
        animals.add(Israel);
        animals.add(Blake);
        animals.add(Timmy);
        
        for(Animal myAnimal: animals)
        {
            System.out.println(myAnimal.name); 
        }
        
        System.out.println("--------------------------------------------------");
        
        ArrayList<Bird> birds = new ArrayList<>();
        
        birds.add(Tyler);
        birds.add(Caleb);
        birds.add(John);
        
        for(Bird myBird: birds)
        {
            System.out.println(myBird.name + " has a wingspan of "+myBird.wingspan+"feet long.");
            
        }
        
        System.out.println("--------------------------------------------------");
        
        ArrayList<Mammal> mammals = new ArrayList<>();
        
        mammals.add(AG);
        mammals.add(Aiden);
        mammals.add(Parker);
        
        for(Mammal myMammal: mammals)
        {
            System.out.println(myMammal.name+" has a body tmperature of "+ myMammal.bodyTemp +"°F."); 
        }
        
        System.out.println("--------------------------------------------------");
        
        ArrayList<Fish> fishes = new ArrayList<>();
        
        fishes.add(Israel);
        fishes.add(Blake);
        fishes.add(Timmy);
        
        for(Fish myFish: fishes)
        {
            System.out.println(myFish.name + " is a saltwater fish.");
        }
        
        System.out.println("--------------------------------------------------");
        
        ArrayList<ISwim> swimmers = new ArrayList<>();
        
        swimmers.add(AG);
        swimmers.add(Caleb);
        swimmers.add(Tyler);
        swimmers.add(John);
        swimmers.add(Aiden);
        swimmers.add(Parker);
        swimmers.add(Israel);
        swimmers.add(Blake);
        swimmers.add(Timmy);
        
        for(ISwim swimmer: swimmers)
        {
            swimmer.swim();
            
        }
        
        System.out.println("--------------------------------------------------");
        
        ArrayList<IFly> flyers = new ArrayList<>();

        flyers.add(John);
        flyers.add(Parker);
       
        for(IFly flyer: flyers)
        {
            flyer.fly();
            
        }
        
        System.out.println("--------------------------------------------------");
        
        ArrayList<IWalk> walkers = new ArrayList<>();
        
        walkers.add(Tyler);
        walkers.add(Caleb);
        walkers.add(John);
        walkers.add(Aiden);
        walkers.add(Parker);
        
        for(IWalk walker: walkers)
        {
            walker.walk();
        }
        
        System.out.println("--------------------------------------------------");
        
        ArrayList<IMakeSound> soundMakers = new ArrayList<>();
        
        soundMakers.add(Tyler);
        soundMakers.add(Caleb);
        soundMakers.add(John);
        soundMakers.add(AG);
        soundMakers.add(Aiden);
        soundMakers.add(Parker);
        
        for(IMakeSound soundMaker: soundMakers)
        {
            soundMaker.makeSound();
        }
        
        System.out.println("--------------------------------------------------");
        
        
        
        
        
        
    }
    
}
