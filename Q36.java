
import java.util.*;
public class Q36
{
	public static void main(String[] args) {
// 	  Write a program to find the highest frequency character in a string.
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   int[] freq  = new int[26];
	   for(char ch: s.toCharArray()){
	       freq[ch-'a']++;
	   }
	   
	   int n = s.length();
	   int idx = -1;
	   int maxFreq  = Integer.MIN_VALUE;
	   for(int i = 0; i < n; i++){
	       if(freq[i] == 0) continue;
	       if(freq[i] > maxFreq){
	           maxFreq  = freq[i];
	           idx = i;
	       }
	   }
	   
		System.out.println((char)(idx+'a'));
	}
}
