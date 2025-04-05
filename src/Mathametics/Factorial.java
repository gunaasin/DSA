package Mathametics;

import java.util.Scanner;

public class Factorial {


//    Iteration method
    static int findFactorialUsingIteration(int n){
        int res = 1;
        for(int i=1;i<=n;i++){
            res*= i;
        }
        return res;
    }

//    Recursion method

    static int res = 1;
    static int occ;
    static int findFactorialUsingRecursion(int n){
        occ = n;
        return  res ;
    }


    public static void main(String[] args) {
//        Factorial nothing but the multiplication of number till (n)
//            3! = 1 * 2 * 3 --> = 6
//            5! = 1 * 2 * 3 --> = 120
//            0! = 1

//        There are two ways to find out the factorial number
//          --> Iteration
//          --> Recursion

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();

        System.out.println(findFactorialUsingIteration(n));
    }
}
