package Mathametics;


import java.util.Scanner;

public class findLCMUsingEculidAlg {
    static int findLCM(int a , int b){
        return (a * b) / GCD(a,b);
    }

    static int GCD(int a , int b){
        while(a!=0 && b!=0){
            if(a>b) a%=b;
            else b%=a;
        }
        return a!=0 ? a : b;
    }
    public static void main(String[] args) {
//       To find the LCM we have one formula

//        LCM = (a * b) / GCD(a , b);

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(findLCM(a,b));

    }
}
