
public class AnagramsASCIISolution {

	public static boolean checkAnagrams(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			System.out.println("Not anagrams");
			return false;
		}

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		int asciiValue = 128;

		int[] count1 = new int[asciiValue];
		// Arrays.fill(count1,0);
		//int[] count2 = new int[asciiValue];

		for (int i = 0; i < s1.length(); i++) {
			count1[c1[i]]++;
			count1[c2[i]]--;
		}

		for (int i = 0; i < s1.length(); i++) {
			if (count1[i] != 0) {
				
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		
		String s1 = "unnatih";
		String s2 = "athinun";
		checkAnagrams(s1, s2);
        System.out.println(checkAnagrams(s1, s2));
	}

}
