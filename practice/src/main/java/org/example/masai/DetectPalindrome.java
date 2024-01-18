package org.example.masai;

/*
 * Date : 1st January 2024
 * Week : 1
 * Level: Easy
 * Link :
 * Reference : https://oj.masaischool.com/contest/4132/problem/1
 * Tag :  #easy #String #StringBuilder #Reverse
 * */

/**
 * The type Detect palindrome.
 */
public class DetectPalindrome {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // If number
        int n = 112211;
        int temp = n;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans = (ans * 10) + rem;
            n = n / 10;
        }
        if (ans == temp) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a Palindrome!");
        }

        //If both string & number
        String s = "ramukumar";
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i > 0; i--) {
            reversed.append(s.charAt(i));
        }
        if(s.contentEquals(reversed)){
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a Palindrome!");
        }

        //using inbuilt method
        String numStr = Integer.toString(n);

        if (numStr.contentEquals(new StringBuilder(numStr).reverse())) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a Palindrome!");
        }
    }
}
