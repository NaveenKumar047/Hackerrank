package hackerrank;

import java.util.Scanner;

public class AscendingDecendingInOneWithoutSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count=0;
		while(count<=n) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == -1)
				continue;
			int max, min, least = i, most = i;
			max = min = arr[i];
			for (int j = 0; j < n; j++) {
				if (arr[j] == -1) {
					continue;
				}
				if (arr[j] < min) {
					least = j;
					min = arr[j];
				}
				if (arr[j] > max) {
					max = arr[j];
					most = j;
				}
			}
			arr[least] = arr[most] = -1;
			if(min!=max)
			System.out.print(min + " " + max);
			else
				System.out.println(min);
			if (i != n - 1)
				System.out.print(" ");
			count=count+2;
		}
		}
		sc.close();
	}
}
