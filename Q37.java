import java.util.*;
public class Q37
{
	public static void main(String[] args) {
	   // Write a program to remove all repeated characters from a given string. 
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   int[] freq  = new int[26];
	   for(char ch: s.toCharArray()){
	       freq[ch-'a']++;
	   }
	   
	   int n = s.length();
	   String ans = "";
	   for(int i = 0; i < n; i++){
	       char ch = s.charAt(i);
	       int val = ch - 'a';
	       if(freq[val] > 1) continue;
	       ans += ch;
	   }
	   
		System.out.println(ans);
	}
}