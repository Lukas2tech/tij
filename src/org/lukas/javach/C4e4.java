package org.lukas.javach;

public class C4e4 {
	private static final int NUMBERS_COUNT = 20;
	
	public static void main(String[] args){
		int[] primeNumbers = new int[NUMBERS_COUNT];
		primeNumbers[0] = 1;
		for(int i = 0; i < primeNumbers.length-1; i++){
			C4e4 c = new C4e4();
			primeNumbers[i+1] = c.findPrime(primeNumbers[i]);
		}
		
		for(int i : primeNumbers){
			System.out.println(i);
		}
		
	}
	
	public int findPrime(int last){
		for(int i = last+1;;i++){
			for(int j = 2;;j++){
				if((i%j == 0) && (i != j)) break;
				if(i == j) {
					return i;
				}
			}
		}
	}
}
