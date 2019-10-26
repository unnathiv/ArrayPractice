
public class ReverseArrayAndString {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		
		String s = "unnathi";
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.print(a[i]);
					
		}
		
		char[] c =s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--) {
			
			System.out.print(c[i]);
			
		}
	}

}
