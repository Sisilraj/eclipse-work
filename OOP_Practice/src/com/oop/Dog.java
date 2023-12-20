package com.oop;

public class Dog {
	
	//Write a Java program to create a class called "Dog" with a name and breed attribute. 
	//Create two instances of the "Dog" class, set their attributes using the constructor 
	//and modify the attributes using the setter methods and print the updated values.
	
	private String name;
	private String breed;
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Kevin","German shapein");
		Dog dog2 = new Dog("Tiger","Puppy");
		
		System.out.println(dog1.name+" is "+dog1.breed);
		System.out.println(dog2.name+" is "+dog2.breed);
		
		System.out.println("==========Upadated value==========");
		dog1.setName("Kevin");
		dog1.setBreed("Puppy");
		System.out.println(dog1.getName()+" is "+dog1.getBreed());
		
		dog2.setName("Tiger");
		dog2.setBreed("German shapein");
		System.out.println(dog2.getName()+" is "+dog2.getBreed());
	}

}
