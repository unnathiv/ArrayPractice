
public class FirstLetterOfWordInString {

	public static  StringBuilder firstLetter(String s) {
		
		String[] s1 = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s1.length; i++) {
			
			char[] c = s1[i].toCharArray();
					
			sb.append(c[0]);	
		}
		return sb;
	}
	
	public static void main(String[] args) {
		String s = "Trying to implement";
		
		System.out.println("Printing first letters of the string: "+firstLetter(s));

	}

}
