package org.lukas.javach;

public class Ch3Ex8 {
	
	public static void main(String[] args){
		Long a = new Long(0xffff);
		Long b = new Long(077777777);
		System.out.println(a.toBinaryString(100));
		System.out.println(b.toBinaryString(100));
	}
}
