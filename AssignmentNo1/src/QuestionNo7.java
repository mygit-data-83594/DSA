import java.util.Arrays;

public class QuestionNo7 {
	
	public static int nonrepeted(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int count=0;
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					count++;
					if(count>=1) {
						continue;
					}
				}
			}
			if(count==0) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//  find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3
		int arr[]= {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int x=nonrepeted(arr);
		System.out.println(arr[x]);
		
		
	}

}
