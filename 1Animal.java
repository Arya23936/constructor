class Animal {
     String name;
 
     public Animal(String name) {
         this.name = name;
     }
 
     
     public void speak() {
         System.out.println(name + " makes a sound.");
     }
 }
 
 class Dog extends Animal {
     String breed;
 
     public Dog(String name, String breed) {
         super(name);
         this.breed = breed;
     }
 
     
     @Override
     public void speak() {
         System.out.println(name + " barks.");
     }
 }
 
 public class Main {
     public static void main(String[] args) {
         Dog dog = new Dog("Buddy", "Golden Retriever");
 
         System.out.println(dog.name);
         System.out.println(dog.breed); 
         dog.speak();  
 
         Animal animal = new Animal("Generic Animal");
         animal.speak();  
     }
 }
