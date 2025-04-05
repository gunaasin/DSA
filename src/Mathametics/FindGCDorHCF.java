package Mathametics;

import java.util.Scanner;

public class FindGCDorHCF {

    static int findTheGCDorHCF(int a , int b){  // Bruteforce method

        int min = 0;
        if(a<b) min = a;
        else min = b;

        for(int i = min ; i>=0 ; i--)
            if(a%i==0 &&  b%i==0 ) return  i;

        return 1;
    }

    static int euclidGCD(int a,int b){  // euclid's GCD
       while(a!=b){
           if(a>b) a =a- b;
           else b =b- a;
       }
       return a;
    }

    static int optimizedEuclidGCDAlgo(int a ,int b){
        while(a!=0 && b!=0){
            if(a>b) a = a%b;
            else b = b%a;
        }
        return a!=0 ? a : b;
    }

    public static void main(String[] args) {

        // perfectly devide the both number

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();


//        System.out.println(findTheGCDorHCF(a, b));

//        System.out.println(euclidGCD(a,b));

        System.out.println(optimizedEuclidGCDAlgo(a,b));
    }


}
