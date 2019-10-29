
public class ReverseStringTwoMethods{

	public static void main(String[] args) {

		// ***This code complexity is O(n) - First way

		String s = "unnathi";
		if (s.length() == 1)
			System.out.println(s);
		String r = null;
		if (s.length() > 1) {
			StringBuilder sb = new StringBuilder();
			for (int i = s.length() - 1; i >= 0; i--) {

				r = (sb.append(s.charAt(i))).toString();

			}
			System.out.println(r);
		}

		// ***This code complexity is O(n) - Second method
		
		String s1 = "unnathi";
		char[] c = s1.toCharArray();

		int m = 0;
		int n = s1.length() - 1;
		char temp = 0;
		while (m <= n) {
			temp = c[m];

			c[m] = c[n];
			System.out.println(c[n]);
			c[n] = temp;

			System.out.println(c[n]);
			m++;
			n--;
		}
	}

}
