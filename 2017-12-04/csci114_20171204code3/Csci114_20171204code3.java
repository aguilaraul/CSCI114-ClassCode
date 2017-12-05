/**
 * @author raul aguilar
 */
package csci114_20171204code3;

import java.util.Scanner;
interface Audible {
    public void makeSound();
    public void makeSoundWhileSleep();
}
interface Movable {
    public void move();
}

class Animal {
    double weight;
    String color;
    public Animal() {
        ;
    }
}
class Cat extends Animal implements Audible, Movable{
    double height;
    @Override
    public void makeSound() {
        System.out.println("Meoww");
    }
    @Override
    public void makeSoundWhileSleep() {
        System.out.println("..zzzz..");
    }
    @Override
    public void move() {
        System.out.println("Sat back down");
    }
}
class PetDog extends Animal implements Audible, Movable {
    double height;
    String name;
    public PetDog(String n) {
        this.name = n;
    }
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    @Override
    public void makeSoundWhileSleep() {
        System.out.println("..zzzz..");
    }
    @Override
    public void move() {
        System.out.println(name + " sprints towards you.");
    }
}
class Bird extends Animal implements Movable {
    boolean canFly;
    String name;
    public Bird(boolean cf) {
        canFly = cf;
    }
    @Override
    public void move() {
        System.out.println("Fly high!");
    }
}
class Fish extends Animal {
    boolean canSwim = true;
}

public class Csci114_20171204code3 {
    
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.height = 24.3;
        PetDog doggie = new PetDog("Doggie");
        doggie.weight = 12;
        doggie.color = "brown";
        Bird feather = new Bird(true);
        System.out.println(feather.canFly);
        feather.name = "Birdo";
        System.out.println("Can " + feather.name + " fly?");
        Scanner in = new Scanner(System.in);
        String an = in.nextLine();
        if(an.equalsIgnoreCase("yes")) {
            feather.canFly = true;
        } else {
            feather.canFly = false;
        }
        if(feather.canFly == true) {
            System.out.println(an + "? Well " + feather.name + " flew away.");
        } else {
            System.out.println(an + "? Well " + feather.name + " is still there.");
        }
        Fish mrGold = new Fish();
        if (mrGold.canSwim == true) {
            System.out.println("Hey! Look at MrFish");
        }
        myCat.makeSound();
        doggie.makeSound();
        doggie.move();
        myCat.move();
    }
    
}
