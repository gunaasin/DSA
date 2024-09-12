import java.util.Scanner;

public class FirstNFactorial {

    public static int findFactorial(int n){
        int res = 1;
        for(int i=1;i<=n;i++){
            res *= i;
        }
        return res;
    }


    public static  void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(findFactorial(n));
    }
}
