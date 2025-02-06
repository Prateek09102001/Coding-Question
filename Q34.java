
import java.util.*;
public class Main
{
	public static void main(String[] args) {
//Write a program to reverse order of words in a given string
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   
	   int n = s.length();
	   String rs = "";
	   
	   for(int i = n-1; i >= 0; i--){
	    char ch  = s.charAt(i);
	    rs += ch;
	   }
	   System.out.println(rs);
	}
}
