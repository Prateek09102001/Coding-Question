
import java.util.*;
public class Main
{
	public static void main(String[] args) {
// 	  Write a program to count occurrences of a character in given string
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   int[] freq  = new int[26];
	   for(char ch: s.toCharArray()){
	       freq[ch-'a']++;
	   }
	   
	   int n = s.length();
	   for(int i = 0; i < 26; i++){
	       if(freq[i] == 0) continue;
	       System.out.println((char)(i+'a')+" "+freq[i]);
	   }
	}
}
