import java.util.Scanner;

public class QuestionNo6 {
	public static int nthoccurance(int arr[],int key,int x) {
		int c=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				c++;
				if(c==x) {
				return i;
				}
			}
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		 //Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is not found, return -1
		Scanner sc=new Scanner(System.in);
		int arr[]= {88,66,11,99,88,11,33,77,66,22,77,99,22,77,66,44,77};
		System.out.println("Enter A key you want to search :");
		int key=sc.nextInt();
		System.out.println("enter the occurance that you want :");
		int x=sc.nextInt();
		int y=nthoccurance(arr, key, x);
		if(y==-1) {
			System.out.println("key is not foud!!");
		}else {
			System.out.println(x+" occurance of the key found at index :"+y);
		}
	}
}
