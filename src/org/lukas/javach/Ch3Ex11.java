package org.lukas.javach;

public class Ch3Ex11 {
	private static final int FIRST = 0xFFFFFFFF;
	private static final int SECOND = 0b101;
	
	public static void main(String[] args){
		int first = FIRST;
		first<<=1;
		for(int i=0; i<32; i++){
			System.out.println(Integer.toBinaryString(first>>>=1));
		}
		Ch3Ex11 ch = new Ch3Ex11();
		ch.charToBinaryString('a');
		ch.charToBinaryString('b');
		ch.charToBinaryString('5');
		ch.charToBinaryString('?');
		
		int x=0,y=1,z=2;
		String s = "x, y, z";
		System.out.println(s);
	}
	
	public void charToBinaryString(char c){
		System.out.println(c + " >> " + Integer.toBinaryString(c));
		
	}
}
