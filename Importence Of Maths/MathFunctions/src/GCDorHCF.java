import java.util.Scanner;

public class GCDorHCF {
    public static  int findGCD(int a , int b){   // Bruteforce
        int min = a<b ? a : b ;
        for(int i=min;i>=1; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }

    public static int euclidsGCD(int a , int b){  // Euclid's alg
        while(a!=b){
            if(a<b){
                b = b-a;
            }
            else{
                a = a-b;
            }
        }
        return a;
    }
    public static int OptimizedEyclids(int a, int b){  //  Optimised Euclid's alg
        while(a!=0 && b!=0){
            if(a<b){
                b = b%a;
            }else{
                a = a%b;
            }
        }
        return  a<b ? b : a;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(findGCD(a, b));
        System.out.println(euclidsGCD(a,b));
        System.out.println(OptimizedEyclids(a,b));
    }
}