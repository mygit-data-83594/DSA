import java.util.Scanner;

public class QuestionNo8 {

	public static int rankOfInteger(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//  to find rank of an element in a stream of integers. rank: rank of a given integer "x", in stream is "total
		 //no. of ele's less than or equal to x (including x).
		 //Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4
		int arr[]= {10, 20, 15, 3, 4, 4, 1};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number that you want to print :");
		int key=sc.nextInt();
		int x=rankOfInteger(arr,key);
		if(x==-1) {
			System.out.println("key is not found!!!");
		}
		else {
			System.out.println("Rank of "+key+" is :"+x);
		}
		
	}

}
