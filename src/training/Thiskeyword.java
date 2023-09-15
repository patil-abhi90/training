package training;

public class Thiskeyword {
int x=10;
 
public Thiskeyword()
{
	System.out.println("Inside constructor");
	}

public Thiskeyword(int x)
{
	//display above constructor is called
	this();
	//assign variable
	this.x=x;
}
void display()
{
	//method to invoke show	
	this.show();
	//value of instance variable is displayed
	System.out.println("value of x: " +this.x);
}
void show()
{ System.out.println("Inside show method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Thiskeyword obj=new Thiskeyword(100);
     obj.display();
	}

}
