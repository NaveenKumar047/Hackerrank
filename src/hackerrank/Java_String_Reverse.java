package hackerrank;
import java.util.*;

public class Java_String_Reverse {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        sc.close();
	        /* Enter your code here. Print output to STDOUT. */
	        StringBuffer s=new StringBuffer(A);
	        if(A.equals(s.reverse().toString()))
	        System.out.println("Yes");
	        else 
	        System.out.println("No");
	    }
}
