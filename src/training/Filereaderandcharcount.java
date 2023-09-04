package training;

import java.io.File;
import java.util.Scanner;

public class Filereaderandcharcount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      File file=new File("C:\\Selenium training\\Fileread.txt");
      Scanner sc= new Scanner(file);
      while(sc.hasNextLine()) {
      String line= sc.nextLine();
      int stringsize = line.length();
	  char c = 'j';
	  String duplicateChar = "";
	  for(int i = 0 ; i < stringsize ; i++) {
		int count = 0;
		for(int j = 0 ; j < stringsize ; j++) {
			if(line.charAt(j) == line.charAt(i)) {
				count++;
			}
		}
       if(count > 1) {
			if(duplicateChar.contains(String.valueOf(line.charAt(i)))) {
				
			}else {
				System.out.println("maximum character found " + line.charAt(i)  +  " with " + count + " Occurrences" );
				duplicateChar = duplicateChar + String.valueOf(line.charAt(i)); 
			 }
          }
        }
      }
    }
   }

