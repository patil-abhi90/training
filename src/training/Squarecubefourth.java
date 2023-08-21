package training;

import java.util.Scanner;

public class Squarecubefourth {

	public static void main(String[] args) {
		 
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Please provide value: ");
		        double val = scan.nextDouble();

		        System.out.printf("Square: %12.2f\n", val * val);
		        System.out.printf("Cube: %14.2f\n", val * val * val);
		        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
	
		}

	}


