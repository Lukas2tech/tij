package org.lukas.javach;

public class Ch3Ex6 {

	public static void main(String[] args){
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		spot.says = "Hau";
		scruffy.says = "Wrr";
		spot.name = "spot";
		scruffy.name = "scruffy";
		
		System.out.println(spot.name + spot.says);
		System.out.println(scruffy.name + scruffy.says);
		
		Dog d = spot;
		System.out.println(spot == scruffy);
		System.out.println(spot == d);
		System.out.println(d == scruffy);
		System.out.println(spot.equals(scruffy));
		System.out.println(d.equals(spot));
		System.out.println(d.equals(scruffy));
	}
}

class Dog{
	String name;
	String says = "Daj g³os";
			
}