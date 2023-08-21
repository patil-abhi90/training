package training;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please insert value : ");
        int n =scan.nextInt();
        int temp = n;
        int p = 0;
 
        // Function to calculate the sum of individual digits
        while (n > 0) {
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
 
  
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                "No. It is not an Armstrong No.");
        }
    }
}