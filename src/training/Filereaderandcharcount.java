package training;

import java.io.File;
import java.util.Scanner;

public class Filereaderandcharcount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 File file=new File("C:\\Selenium training\\Fileread.txt");
 Scanner sc= new Scanner(file);
 while(sc.hasNextLine())
 System.out.println(sc.nextLine());
 
	}}
