import java.util.Scanner;

public class QuestionNo_3 {

	public static int linearSearch(int arr[],int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==key) 
				return i;
		}
		return -1;
	}
	public static int binarySearch(int arr[],int key) {
		int left=0,right=arr.length;
		int mid=(left+right)/2;
		
		while(!(left>right)) {
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]>key) {
				right=mid-1;
				mid=(left+right)/2;
			}
			else {
				left=mid+1;
				mid=(left+right)/2;
			}
		}
		return -1;	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {22,11,33,66,44,88,66,77};
		
		System.out.println("Enter A key :");
		int key=sc.nextInt();
		
		//int num=linearSearch(arr, key);
		int num=binarySearch(arr, key);
		if(num==-1) {
			System.out.println("key is not found");
		}
		else {
			System.out.println("key is found at Index :"+num);
		}
		
	}
}
