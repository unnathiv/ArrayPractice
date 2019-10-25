
public class MinElemntInSortedRotatedArray {

	public static void main(String[] args) {
	
		
	// {5, 6, 1, 2, 3, 4}
	// {1, 2, 3, 4}
	// {2, 1}
	// In any test case for the above input this program will works and return 1 as the minimum element
		int[] a = {3,4,6,1,2};
		int i=0;
		int l = a.length-1;
		
			while(a[i] > a[l])	
				i++;
			
				System.out.println(a[i]);
	}

}
