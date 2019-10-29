
public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String s = "unnathi is a good girl";
		
		String[] arr = s.split(" ");
		
		int l = arr.length;
		
		for(int i=l-1;i>=0;i--) {

			System.out.print(arr[i]+" ");
		}
		

	}

}
