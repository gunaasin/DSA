import java.util.Scanner;

public class LCM{

    public static int findLCM(int a, int b){
        return (a*b)/GCD(a,b);
    }

    public static int GCD(int a, int b){
        while(a!=0 && b!=0) {
            if (a < b) {
                b = b % a;
            } else {
                a = a % b;
            }
        }
        return  a<b ? b : a;
    }





    public static void main(String[] ar){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    System.out.println(findLcm(a , b ));
}

    public static int findLcm(int a , int b){
        int res = Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }
}