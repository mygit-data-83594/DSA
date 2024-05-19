import java.util.Arrays;

public class QuestionNo2 {
	public static void insertionSort(int arr[]) {
		System.out.println(arr.length-1);
		System.out.println(arr.length-2);
		for(int i=arr.length-2;i>=0;i--) {
			int temp=arr[i];
			int j=i+1;
			while(j<arr.length && temp<arr[j])
			{
				arr[j-1]=arr[j];
				j++;
			}
			arr[j-1]=temp;
		}

		
	}
	public static void main(String[] args) {
		//  Modify the insertion sort algorithm to sort the array in descending order
		int arr[]= {11,55,77,33,55,44,22};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
