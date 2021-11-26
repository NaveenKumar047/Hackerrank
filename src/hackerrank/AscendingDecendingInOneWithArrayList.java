package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class AscendingDecendingInOneWithArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the number of entries");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " numbers");
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);
		//using remove for deleting elements
		while (!arr.isEmpty()) {
			if (arr.size() != 1) {
				System.out.print(arr.get(0) + " " + arr.get(arr.size() - 1));
				arr.remove(0);
				arr.remove(arr.size() - 1);
			} 
			else {
				System.out.println(arr.get(0));
				arr.remove(0);
			}
			if(!arr.isEmpty()) {
				System.out.print(" ");
			}
		}
		
		/*// using set logic without removing elements
		 * for (int i = 0, j = n - 1; i < n / 2 + 1; i++, j--) { if (arr.get(i) == -1) {
		 * continue; } if (arr.get(j) == -1) { continue; } if (i != n / 2)
		 * System.out.print(arr.get(i) + " " + arr.get(j)); if(i!=n/2-1)
		 * System.out.print(" "); if (i == n / 2) System.out.print(arr.get(j));
		 * arr.set(i,-1); }
		 */
		sc.close();
	}

}
