import java.util.Scanner;

public class TailingZero {

    public  static int Tailing(int n ){
        int res =0;
        int powerOf5 =5; // evry time to upDate the powerof5 it means 5power1 ,2 ,3 ....
        while(n >= powerOf5){
            res = res +( n/powerOf5);
            powerOf5 = powerOf5*5;
        }
        return res;
    }
    public static  void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(Tailing(n));
    }
}
