import java.util.Scanner;

public class QuestionNo5 {

	public static int searchForDescending(int arr[], int key) {

		int left = 0, right = arr.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				left = mid + 1;

			} else if (arr[mid] < key) {
				right = mid - 1;

			}

		}
		return -1;
	}

	public static void main(String[] args) {
		// Implement binary search algorithm if array is sorted in descending order.
		int arr[] = { 99, 88, 77, 66, 55, 44, 33, 22, 11 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a elemet you want to search :");
		int key = sc.nextInt();
		int x = searchForDescending(arr, key);
		if (x == -1) {
			System.out.println("key is not Found!!!!");
		} else {
			System.out.println("key is Found At index :" + x);
		}
	}
}
