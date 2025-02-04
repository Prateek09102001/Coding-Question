import java.util.Scanner;

import Practice.check;

public class Q13 {
    // Write a program to check whether a number is palindrome or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = String.valueOf(n);
        int len = s.length();
        int lp = 0;
        int rp = len - 1;
        boolean flag = true;

        while (lp < rp) {
            if (s.charAt(lp) != s.charAt(rp)) flag = false;
            lp++;
            rp--;
        }

        System.out.println(flag);
    }

}
