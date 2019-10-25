
public class ArrayRotationByTwo {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		
		int[] temp = new int[7];
		
		for(int i=0; i<2;i++)
		{
			temp[i] = a[i];
			System.out.println("Element in the temp array: "+temp[i]);
		}
		
		for(int i=0;i<a.length-2;i++) {
			
			a[i] = a[i+2];
			
			System.out.println("Elements after moving two positions : "+a[i]);
				
		}
//		int count=0;
//		for(int i=a.length-1;i>4;i--) {
//		
//			  a[i] = temp[count];
//			  count++;
//			  System.out.println("Elements rplacing from temp array: "+a[i]);
//		  
//		}
		
		int count=0;
		for(int i=a.length-2;i<a.length;i++) {
		
			  a[i] = temp[count];
			  count++;
			  System.out.println("Elements rplacing from temp array: "+a[i]);
		  
		}
		
		for(int i=0; i<a.length;i++) {
			System.out.println("Final array: "+a[i]);
		}
	}

}
