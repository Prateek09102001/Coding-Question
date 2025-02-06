
import java.util.*;
public class Main
{
	public static void main(String[] args) {
//Write a program to count the total number of words in a string.
	   Scanner sc = new Scanner(System.in);
	   String s = sc.nextLine();
	   
	   String ss = s.trim();
	   String[] arr = ss.split(" ");
	   int n = arr.length;
	   System.out.print(n);
	}
}
