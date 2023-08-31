package training;

public class Maxoccurchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "abcabcabcaabc";
		int stringsize = st1.length();
		char c = 'j';
		
		String duplicateChar = "";
		for(int i = 0 ; i < stringsize ; i++) {
			int count = 0;
			for(int j = 0 ; j < stringsize ; j++) {
				if(st1.charAt(j) == st1.charAt(i)) {
					count++;
				}
			}
	       if(count > 1) {
				if(duplicateChar.contains(String.valueOf(st1.charAt(i)))) {
					
				}else {
					System.out.println("maximum character found " + st1.charAt(i)  +  " with " + count + " Occurrences" );
					duplicateChar = duplicateChar + String.valueOf(st1.charAt(i)); // duplicateChar = "isa";
				
				}
			}
		}

		
	}
	}


