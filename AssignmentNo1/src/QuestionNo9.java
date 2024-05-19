import java.util.Arrays;

public class QuestionNo9 {
	
	public static void selectionSort(int arr[]) {
		int pass=0,comp=0;
		for(int i=0;i<arr.length-1;i++) {
			pass++;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					comp++;
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Passes :"+pass);
		System.out.println("comparisions :"+comp);
	}
	public static void main(String[] args) {

		//Write a selection sort function to sort array and 
		//returns no of comparisions
		int arr[]= {88,33,11,99,44,22,99,77,33,55,66};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
