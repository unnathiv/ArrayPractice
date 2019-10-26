
public class MoveAllZerosInArrayToEnd {

	public static void main(String[] args) {
		int[] a = {1,2,0,0,3,4,7,0};
		int count = 0;
		int n = a.length;
		for(int i=0;i<a.length;i++) 
			
			if(a[i]!=0)
			  a[count++] = a[i];
		while (count < n) 
            a[count++] = 0; 
		
		for(int i=0;i<a.length;i++) 
				
	   System.out.println(a[i]);	
		
	}

}
