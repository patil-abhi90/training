package training;

import java.util.Scanner;

public class Temperatureconvert {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Fahrenheit, Celsius; 
		Scanner scan=new Scanner(System.in);
		System.out.println("Input ");
		int firstint=scan.nextInt();
		//Celsius to Farenheit
		Fahrenheit =(float) ((firstint* 1.8)+32);  
		System.out.println("Temperature in Fahrenheit " +firstint + " Celsius = " +Fahrenheit+ " Farenheit");  
		// Celsius to kelvin
		Celsius= (float)(firstint + 273);
		System.out.println("Temperature in kelvin "+firstint + " Celsius = " +Celsius + " Kelvin");  
	}

}
