package org.example.masai;

/*
 * Date : 26th December 2023
 * Level: Easy
 * Link :
 * Reference : https://oj.masaischool.com/contest/4049/problem/10
 * Tag : #PrimeNumber #Whileloop #Tricky
 * */
public class PrimeNumber {
    public static void main(String[] args) {
        int number = 44;
        if(number < 4){
            System.out.println("Prime Number!");
            return;
        }
        for (int i = 4; i < number / 2; i++) {
            if(number%i == 0){
                System.out.println("Not a Prime Number!");
                return;
            }
        }
        System.out.println("Prime Number!");
    }

    // efficient way
    boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return (c * c) > n;
    }
}
