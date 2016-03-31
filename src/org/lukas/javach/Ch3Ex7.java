package org.lukas.javach;

import java.util.Random;

public class Ch3Ex7 {
	private static final String FIRST = "Orze³";
	private static final String SECOND = "Reszka";
	
	public static void main(String[] args){
		Random random = new Random();
		System.out.println(random.nextInt(2) == 0 ? FIRST : SECOND);
	}
}
