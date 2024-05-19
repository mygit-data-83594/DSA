import java.util.Scanner;

public class QuestionNo2 {
	
	public static int lastOccurance(int arr[],int key) {
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]==key) {
				return i;
			}
		}
	return -1;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int arr[]= {11,66,88,77,33,89,33,88,55};
		System.out.println("Enter a key You want to search: ");
		int key=sc.nextInt();
		
		int num=lastOccurance(arr, key);
		if(num==-1) {
			System.out.println("Element is not found!!!");
		}
		else {
			System.out.println("last occurance of the element at index :"+num);
		}
		
	}
}
