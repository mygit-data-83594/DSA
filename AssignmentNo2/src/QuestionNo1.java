import java.util.Arrays;

public class QuestionNo1 {

	public static void insertionSort(int arr[]) {
		int com=0,pass=0;
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			pass++;
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				com++;
				arr[j+1]=arr[j];
				j--;
				//System.out.println(j);
			
			}
			arr[j+1]=temp;
			}
		System.out.println("Number of Passes :"+pass);
		System.out.println("Number of Comparisons :"+com);
		}
	
	public static void main(String[] args) {
		// Write a insertion sort function to sort array and 
		//returns no of comparisions
		int arr[]= {77,55,33,99,44,11,44,88,66,22};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
