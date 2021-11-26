package hackerrank;
import java.util.*;

public class Java_String_Tokens_Alternative {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String str[]=s.split("[\\s+|\\,|\\?|\\!|\\.|\\_|\\'|\\@]+");
        int len=0;
        for(String string:str){
            if(!string.isEmpty())
            	len++;
        }
        System.out.println(len);
        for(String string:str){
            if(!string.isEmpty())
            System.out.println(string);
        }
        scan.close();
    }
}
// https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
