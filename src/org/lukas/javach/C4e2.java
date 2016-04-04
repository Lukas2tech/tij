package org.lukas.javach;

import java.util.Random;

public class C4e2 {
	private static final int BOUND = 25;
	
	public static void main(String[] args){
		C4e2 c = new C4e2();
		int i = 0;
		while(true){
			int generated = c.generate();
			System.out.print(i+1 + ": Generated : "+ generated);
			int second = c.generate();
			if(generated <= second){
				System.out.println("  |  " + generated + " is smaller or equal to " + second);
			} else{
				System.out.println("  |  " + generated + " is larger then " + second);
			}
			i++;
		}
		
	}
	
	private int generate(){
		Random random = new Random();
		return random.nextInt(100);
	}
}
