package org.lukas.javach;

public class Ch3Ex3 {
	static void f(Number n){
		n.x = 0.7f;
	}
	
	public static void main(String[] args){
		Number n = new Number();
		n.x = 0.9f;
		System.out.println(n.x);
		f(n);
		System.out.println(n.x);
		
	}
}

class Number{
	float x;
}
