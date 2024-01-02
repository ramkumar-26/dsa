package org.example.masai;

/**
 * The type Substring under condition.
 */
/*
 * Date : 2nd January 2024
 * Week : 1
 * Level: Easy
 * Link :
 * Reference : https://oj.masaischool.com/contest/4132/problem/2
 * Tag :  #easy #String
 * */
public class SubstringUnderCondition {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String s = "ramukumar";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
