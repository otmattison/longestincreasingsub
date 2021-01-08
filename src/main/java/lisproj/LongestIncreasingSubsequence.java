package lisproj;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 11, 20, 50, 23, 45, 17, 44, 60 };
		int length = arr.length;
		int maxlength, i, j = 0;

		for (int temp : arr) {
			System.out.print(temp + " ");
		}
		System.out.println("\n" + "length of the longest increasing sequience is : " + lisLength(arr, length));
	}

	public static int lisLength(int[] arr, int length) {

		int lis[] = new int[length];
		// int temp;
		int maxlength = 0;
		// print..

		//
		for (int i = 0; i < length; i++) {
			lis[i] = 1;
		}
		//iterates through find longest increasing subsequence
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;

				}
			}
		}
		//get count for max subsequence
		for (int i = 0; i < length; i++) {
			if (lis[i] > maxlength) {
				maxlength = lis[i];

			}

		}
		return maxlength;

	}
}
