package training;
import java.util.*;

public class Printdaysofweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day");
		int i = sc.nextInt();
		int day=i;
		printDay(day);
	}
	static void printDay(int day) {
		if(day==1) {
			System.out.println("Sunday");
		} else if(day==2) {
			System.out.println("Monday");
		}else if(day==3) {
			System.out.println("Tuesday");
		}else if(day==4) {
			System.out.println("Wednesday");
		}else if(day==5) {
			System.out.println("Thursday");
		}else if(day==6) {
			System.out.println("Friday");
		}else if(day==7) {
			System.out.println("Saturday");
		}
		else  {
			System.out.println("Wrong day");
		}// else close
	}
	}

