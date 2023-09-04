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
      int[] freq = new int[line.length()];  
      int stringsize = line.length();
     int i, j, max;
	 char maxChar=line.charAt(0);
	 char string[]=line.toCharArray();
	 for(i = 0; i < string.length; i++) {  
         freq[i] = 1;  
         for(j = i+1; j < string.length; j++) {  
             if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                 freq[i]++;  
              string[j]='0';
              
			 }
          }
        }
	 max=freq[0];
	 for(i = 0; i <freq.length; i++) {  
		  if(max < freq[i]) {  
              max = freq[i];  
              maxChar = string[i];  
	 }
      }
	 System.out.println("Maximum occurring character: " + maxChar);  
    }
	}
   }

