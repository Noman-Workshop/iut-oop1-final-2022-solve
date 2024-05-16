package org.example.ques1;

class Animal {
	
	public void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	
	public void bark() {
		System.out.println("Dog is barking");
	}
}

public class Casting {
	
	public static void main(String[] args) {
		Dog myDog = new Dog();
		Animal myAnimal = myDog; // Upcasting (implicit)
		myAnimal.eat(); // Valid because myAnimal is actually a Dog and it can eat
		
		Animal myAnimal1 = new Dog();
		Dog myDog1 = (Dog) myAnimal1; // Downcasting (explicit) - Valid because myAnimal1 is actually a Dog
		myDog1.bark();
		
		Animal myAnimal2 = new Animal();
		Dog myDog2 = (Dog) myAnimal2; // Downcasting (explicit) - ClassCastException because myAnimal2 is not a Dog
		myDog2.bark(); // so it cannot bark
	}
}
