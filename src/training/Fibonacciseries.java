package training;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n1=0, n2=1,n3,i,count=10;
		 System.out.println("Fibonacci Series till " + count + " terms:");
		 System.out.print(n1+"," +n2);
		 for(i=1;i<count; ++i)
		 {
			 n3=n1+n2;
			 System.out.print(","+n3);
			 n1=n2;
			 n2=n3;
		 }
	}

}
