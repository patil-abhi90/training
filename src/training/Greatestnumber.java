package training;

import java.util.Scanner;

public class Greatestnumber {

	static int Biggestnumber(int x, int y, int z)
	{
	 if(x>y && x>z)
	  return x;
	  else if(y>=x && y>z)
	   return y;
	 else
		 return z;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest;
Scanner sc= new Scanner(System.in);
System.out.println("Enter number x: ");
int x=sc.nextInt();
System.out.println("Enter number y: ");
int y=sc.nextInt();
System.out.println("Enter number z: ");
int z=sc.nextInt();

largest = Biggestnumber(x,y,z);
System.out.println("Largest of three number is " +largest);
	}

}
