package training;
import java.util.*;
public class Converttime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Input seconds: ");
		    	int seconds = scan.nextInt();
	        int S = seconds % 60;
	        int H = seconds / 60;
	        int M = H % 60;
	        H = H / 60;
	        System.out.print( H + ":" + M + ":" + S);
			System.out.print("\n");
	}

}
