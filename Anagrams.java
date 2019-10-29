import java.util.HashMap;

public class Anagrams {

	public static void main(String[] args) {
		String s1 ="UnNathi34";
		String s2 = "nanuith";
		
		s1.toLowerCase();
		s2.toLowerCase();
		
		if(s1.length()!=s2.length())
			System.out.println("Not anagrams");
		
	//1st method - Checking two Strings length and comparing every character 	
		char[] c1 =s1.toCharArray();
		char[] c2 =s2.toCharArray();
		boolean Flag=true;
		for(int i=0;i<c1.length;i++) {
		for(int j=0;j<c2.length;j++) {
			
		if(c1[i] == c2[j]) {
				   Flag = true;
				   break;	
				}
		else 
			Flag = false;
		}}
		if(Flag)
			System.out.println("Anagram");
		else
			System.out.println("Not anagrams");
	
	}	
	
	//2nd method - Inserting into hash map and comparing the values of each character  
	
	HashMap<Character,Integer> hm = new HashMap<>();

	 for(int i=0;i<s1.length();i++) {
		char c = s1.charAt(i);
			
			if(!hm.containsKey(c)) {
				hm.put(c,1);		
			}
			else{
				Integer fre =hm.get(c);
				hm.put(c, fre++);	
			}
			
		}
		for(int j=0;j<s2.length();j++) {
			
			char c1 =s2.charAt(j);
			
			if(!hm.containsKey(c1))
				System.out.println("not anagram");
			
			Integer fre = hm.get(c1);
			
			if(fre == 0)
				System.out.println("Not anagram");
			
			else
				
				hm.put(c1, fre--);	
		}
		System.out.println("Anagrams");
		
	}

}
