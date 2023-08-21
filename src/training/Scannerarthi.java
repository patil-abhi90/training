package training;
import java.util.*;

public class Scannerarthi {
 
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Insert 1st string: ");
		int firstint=scan.nextInt();
		System.out.println("Insert 2nd String: ");
		int secondint=scan.nextInt();
		
		System.out.printf("Sum of two number : %d%n", firstint + secondint);
		System.out.printf("Difference of two number : %d%n", firstint - secondint);
		System.out.printf("Product of two number : %d%n", firstint * secondint);
		System.out.printf("Average of two number : %.2f%n", (double) (firstint + secondint) / 2);
		System.out.printf("Distance of two number : %d%n", Math.abs (firstint - secondint));
		System.out.printf("Max integer : %d%n", Math.max(firstint, secondint));
		System.out.printf("Min integer : %d%n", Math.min(firstint, secondint));

	}
}
