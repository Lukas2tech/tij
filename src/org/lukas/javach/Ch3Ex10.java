package org.lukas.javach;

public class Ch3Ex10 {
	private static final int FIRST = 0b010;
	private static final int SECOND = 0b101;
	
	public static void main(String[] args){
		System.out.println(Integer.toBinaryString(FIRST & SECOND));
		System.out.println(Integer.toBinaryString(FIRST | SECOND));
		System.out.println(Integer.toBinaryString(FIRST ^ SECOND));
		System.out.println(Integer.toBinaryString(~FIRST));		
	}
}
