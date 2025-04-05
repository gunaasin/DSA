package Mathametics;

import java.util.Scanner;

public class CountNumberOfDigit {

    static int countTheNumber(int n){
        int res = 0;

        while(true){
           if(n==0) return res;
           n =  n/10;  // --> n/=10
           res++;
        }
    }


    public static void main(String[] args) {
//  count the number of digit  12345 --> 5 it means length of the given number

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println(countTheNumber(scan.nextInt()));

    }
}
