import java.util.HashSet;

public class ReArrangeAnArrayAsi {

	public static void main(String[] args) {
		int[] a = {-1,2,5,3,-1,4};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i =0;i<a.length;i++) {		
			hs.add(a[i]);	
		}
		
		for(int i =0;i<a.length;i++) {
			
			if(hs.contains(i))
				a[i] = i;
			else
				a[i] = -1;
		}
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Array elements:"+a[i]);
		}
	}

}
