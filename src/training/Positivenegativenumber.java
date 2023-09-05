package training;

import java.util.Scanner;

public class Positivenegativenumber {
	
  public static void main(String[] args)
  {
	Scanner sc=new  Scanner(System.in);
    System.out.println("insert number :");
    int i = sc.nextInt();
    int z=i;
    if(z>0)
    {
    	System.out.println(z+ " is positive");
    }
    else if(z<0)
    {
    	System.out.println(z+ " is negative");
    }
    else {
    	 
        System.out.println(z + " is zero.");
  }
  }
 }