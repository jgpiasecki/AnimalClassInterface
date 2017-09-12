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
        //creates new animals
        Ostrich Tyler = new Ostrich("Tyler",6.6);
        Penguin Caleb = new Penguin("Caleb",2.5);
        Eagle John = new Eagle("John",7.5);
        Dolphin AG = new Dolphin("AG",98.6);
        Lion Aiden = new Lion("Aiden",102.5);
        Bat Parker = new Bat("Parker",105.8);
        Shark Israel = new Shark("Israel",true);
        Bass Blake = new Bass("Blake",true);
        FlyingFish Timmy = new FlyingFish("Timmy",true);
        
        //creates a list for the animals
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
        
        //prints out the name of the animals
        for(Animal myAnimal: animals)
        {
            System.out.println(myAnimal.name); 
        }
        
        System.out.println("--------------------------------------------------");
        
        //creates a list for the birds
        ArrayList<Bird> birds = new ArrayList<>();
        
        birds.add(Tyler);
        birds.add(Caleb);
        birds.add(John);
        
        //prints out the name of each bird and their wingspan
        for(Bird myBird: birds)
        {
            System.out.println(myBird.name + " has a wingspan of "+myBird.wingspan+"feet long.");
            
        }
        
        System.out.println("--------------------------------------------------");
        
        //creates a list fo the mammals
        ArrayList<Mammal> mammals = new ArrayList<>();
        
        mammals.add(AG);
        mammals.add(Aiden);
        mammals.add(Parker);
        
        //prints out the name of each mammal and their bodytemps
        for(Mammal myMammal: mammals)
        {
            System.out.println(myMammal.name+" has a body tmperature of "+ myMammal.bodyTemp +"°F."); 
        }
        
        System.out.println("--------------------------------------------------");
        
        //creates a list for the fish
        ArrayList<Fish> fishes = new ArrayList<>();
        
        fishes.add(Israel);
        fishes.add(Blake);
        fishes.add(Timmy);
        
        //prints out the name and tells us that the fish is a saltwater fish
        for(Fish myFish: fishes)
        {
            System.out.println(myFish.name + " is a saltwater fish.");
        }
        
        System.out.println("--------------------------------------------------");
        
        //creates a list for things that can swim
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
        
        //prints out the swimmers
        for(ISwim swimmer: swimmers)
        {
            swimmer.swim();
            
        }
        
        System.out.println("--------------------------------------------------");
        
        //creates a list for things that can fly
        ArrayList<IFly> flyers = new ArrayList<>();

        flyers.add(John);
        flyers.add(Parker);
       
        //prints out the flyers
        for(IFly flyer: flyers)
        {
            flyer.fly();
            
        }
        
        System.out.println("--------------------------------------------------");
        
        //creates a list for things that can walk
        ArrayList<IWalk> walkers = new ArrayList<>();
        
        walkers.add(Tyler);
        walkers.add(Caleb);
        walkers.add(John);
        walkers.add(Aiden);
        walkers.add(Parker);
        
        //prints out the walkers
        for(IWalk walker: walkers)
        {
            walker.walk();
        }
        
        System.out.println("--------------------------------------------------");
        
        //creates a list for the things that can make a sound
        ArrayList<IMakeSound> soundMakers = new ArrayList<>();
        
        soundMakers.add(Tyler);
        soundMakers.add(Caleb);
        soundMakers.add(John);
        soundMakers.add(AG);
        soundMakers.add(Aiden);
        soundMakers.add(Parker);
        
        //prints out the soundMakers
        for(IMakeSound soundMaker: soundMakers)
        {
            soundMaker.makeSound();
        }
        
        System.out.println("--------------------------------------------------");
        
        
        
        
        
        
    }
    
}
