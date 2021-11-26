package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingDecendingInOneWithSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		for (int i = 0, j = n - 1; i < n / 2 + 1; i++, j--) {
			if (arr[i] == -1) {
				continue;
			}
			if (arr[j] == -1) {
				continue;
			}
			if (i != n / 2)
				System.out.print(arr[i] + " " + arr[j]);
			if(i!=n/2-1)
				System.out.print(" ");
			if (i == n / 2)
				System.out.print(arr[i]);
			arr[i] = -1;
		}
	}

}
