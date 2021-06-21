package Practical_1;

import java.util.Random;

public class Random_Num {

	public static void main(String[] args) {
		Random num = new Random();
		int counter;
		int[] number = new int[500];
		number[0] = num.nextInt(1000);
		int largest = number[0];
		int smallest = number[0];
		for (counter = 1; counter < 500; counter++) {
			//System.out.println(number[counter]=num.nextInt(1000)); 
			number[counter] = num.nextInt(1000);
			largest = Math.max( largest , number[counter ] );
			smallest = Math.min(smallest, number[counter]);
			
		}
		System.out.println(smallest);
	}
}
