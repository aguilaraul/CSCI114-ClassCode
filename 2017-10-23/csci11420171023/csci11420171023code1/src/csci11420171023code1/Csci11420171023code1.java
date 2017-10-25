package csci11420171023code1;

import java.util.ArrayList;

class Pet {
    String animal;
    String owner;
    String favoriteFood;
    boolean hasTail;
    String furColor;
    boolean hasFleas;
    int numberOfLegs;
    double weight;
    String wierdFeature;
    String feature1;
    String feature2;
    public String makeSound()
    {  
        if (animal.equalsIgnoreCase("dog"))
            return "bark";
        else if (animal.equalsIgnoreCase("cat"))
            return "meaou";
        else
            return "some sound...";
    }
    public Pet()
    {
       animal="";
       owner=""; 
       hasTail = true;
    }
    public Pet(String a, String o)
    {
       animal=a;
       owner=o; 
       hasTail = true;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public boolean isHasFleas() {
        return hasFleas;
    }

    public void setHasFleas(boolean hasFleas) {
        this.hasFleas = hasFleas;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWierdFeature() {
        return wierdFeature;
    }

    public void setWierdFeature(String wierdFeature) {
        this.wierdFeature = wierdFeature;
    }

    public String getFeature1() {
        return feature1;
    }

    public void setFeature1(String feature1) {
        this.feature1 = feature1;
    }

    public String getFeature2() {
        return feature2;
    }

    public void setFeature2(String feature2) {
        this.feature2 = feature2;
    }

    @Override
    public String toString() {
        return "Pet{" + "animal=" + animal + ", owner=" + owner + ", favoriteFood=" + favoriteFood + ", hasTail=" + hasTail + ", furColor=" + furColor + ", hasFleas=" + hasFleas + ", numberOfLegs=" + numberOfLegs + ", weight=" + weight + ", wierdFeature=" + wierdFeature + ", feature1=" + feature1 + ", feature2=" + feature2 + '}';
    }

    
    
}

public class Csci11420171023code1 {
    public static void main(String[] args) {
        
        Pet cat = new Pet("Cat", "Mr. Bob");
        Pet dog = new Pet("Dog", "Ms. Mary");
        cat.setWeight(10.0);
        dog.setWeight(30.0);
        cat.setFavoriteFood("fish");
        dog.setFavoriteFood("beef");
        
        System.out.println(cat);
        System.out.println(dog);
        
        //Pets of Mr. Hearst 
        ArrayList<Pet> hearstPets = new ArrayList();
        for ( int i = 0; i < 500; i++) {
            Pet onePet = new Pet("", "Mr. Hearst");
            hearstPets.add(onePet);
        }
        
        Pet hundredth = hearstPets.get(100);
        hundredth.animal="Zebra";
        hundredth.setFurColor("B&W");
        hundredth.setFavoriteFood("grass");
        
        int counter = 0; 
        //enhanced loop
        for ( Pet item: hearstPets){
            
            System.out.println("counter=" + counter + "=> " + item);
            counter++;
        }
           
    }
    
}