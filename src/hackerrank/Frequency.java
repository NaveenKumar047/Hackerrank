package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Frequency {
	public static void freq(ArrayList<Integer> arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (!arr.isEmpty()) {
			if (!map.containsKey(arr.get(0)))
				map.put(arr.get(0), 1);
			else
				map.put(arr.get(0), map.get(arr.get(0)) + 1);
			arr.remove(0);
		}

		System.out.println(map);
		while (!map.isEmpty()) {
			int maxValue = (Collections.max(map.values()));
			ArrayList<Integer> ref=new ArrayList<>();
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() == maxValue) {
					for (int i = 1; i <= maxValue; i++) {
						System.out.print(entry.getKey());
						if (i != maxValue) {
							System.out.print(" ");
						}
					}
					
					System.out.print(" ");
				ref.add(entry.getKey());
				}
			}
			for(Integer num:ref) {
				map.remove(num);
			}	
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		freq(arr);
		sc.close();
	}

}
