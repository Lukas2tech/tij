package org.lukas.javach;

import java.util.Calendar;

public class Ch3Ex4 {
	private static final float distance = 6000f; 	// distance in meters 
	private static final float time = 3600f;			// time of travel
	private static final float quanti = 1000f/3600f;
	
	public static void main(String[] args){
		Ch3Ex4 c = new Ch3Ex4();
		System.out.println(c.calculateSpeed() + "[km/h]");
	}
	
	public float calculateSpeed(){
		return distance/time/quanti;
	}
}
