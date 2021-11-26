package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
//		sb.delete(0, 1);
//		sb.insert(0,(char)(s.charAt(0)+1));
//		System.out.println(sb);
		HashMap<Integer, Integer> character=new HashMap<Integer, Integer>();
//		character.put((int) sb.charAt(0), 1);
//		System.out.println(character.replace((int) sb.charAt(0),character.get((int) sb.charAt(0))+1));
//		System.out.println(character);
		for (int j = 0; j < sb.length(); j++) {
			if (Character.compare((char)sb.charAt(j), ' ') == 0)
				continue;
			if (character.containsKey((int)sb.charAt(j))) {
				//System.out.println('1'+" "+sb.charAt(j));
				char temp=sb.charAt(j);
				sb.insert(j,(char)(temp+character.get((int)temp)));
				//character.replace((int)sb.charAt(j),2);
				character.replace((int)temp, character.get((int) temp)+1);
				sb.deleteCharAt(j+1);
				//System.out.println(character);
			}
			else {
				//System.out.println('2'+" "+sb.charAt(j));
				character.put((int)sb.charAt(j), 1);
				//System.out.println(character);
			}
		}
//		for (int i = 0; i < s.length() - 1; i++) {
//			if (Character.compare((char)sb.charAt(i), ' ') == 0)
//				break;
//			for (int j = i + 1; j < s.length(); j++) {
//				if (Character.compare((char)s.charAt(i), (char)s.charAt(j)) == 0) {
//					sb.delete(j, j+1);
//					sb.insert(j,(char)(s.charAt(j)+1));
//					break;
//				}
//			}
//		}
		System.out.println();
		System.out.println(sb);
		System.out.println(character);
		sc.close();
	}

}
