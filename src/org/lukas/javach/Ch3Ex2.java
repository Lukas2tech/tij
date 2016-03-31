package org.lukas.javach;

public class Ch3Ex2 {
	private Float f = 0.9f;
	private Float f2 = f;

	public static void main(String[] args) {
		Ch3Ex2 c = new Ch3Ex2();
		System.out.println(c.f);
		System.out.println(c.f2);
		Float f4 = c.f2;
		System.out.println(f4);

	}

}
