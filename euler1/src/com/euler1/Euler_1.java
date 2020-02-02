package com.euler1;

public class Euler_1 {

	public static void main(String[] args) {
        MultiplesOf3And5 multiples = new MultiplesOf3And5();


        int result = multiples.GetMultiples();
        String strResult = String.valueOf(result);
	        System.out.println("The sum of multiples of 3 or 5 up to 1000 are: " + strResult);
	}

}
