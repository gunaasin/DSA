import java.util.Scanner;

public class CountDigits {
    public static int count(int n){
     int count =0;
     while(n>0){
         n/=10;
         count++;
     }
     return  count;
    }


    public static  void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(count(n));
    }
}
