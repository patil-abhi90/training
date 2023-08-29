package training;

public class Permuteofstring {
	
	static void printPermutn(String str, String ans)
	{
	if(str.length()==0) {
		System.out.println(ans + "");
		return;
			}
	for (int i=0; i<str.length();i++)
	{
		char ch=str.charAt(i);
		String ro=str.substring(0,i) + str.substring(i+1);
		printPermutn(ro,ans + ch);
		
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="123";
printPermutn(s,"");
	}

}
