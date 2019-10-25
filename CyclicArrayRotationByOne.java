
public class CyclicArrayRotationByOne {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7};
		int temp ;
		int l = a.length;
		temp = a[6];
		
		for(int i=a.length-1;i>0;i--)	
		  a[i] = a[i-1];
		  a[0] = temp;
		for(int i=0;i<l;i++) 
			System.out.println(a[i]);
		
	}

}
