import java.util.Scanner;

public class nPrimeNumbers {

   public static boolean Prime(int n){
     if(n<=1){
         return false;
     }
     if(n==2 || n==3){
         return true;
     }
     if(n%2==0 || n%3==0){
         return false;
     }
     for(int i=5 ; i*i<=n ; i += 6){
         if(n%i==0 || n%(i+2)==0){
             return false;
         }
     }
     return true;
    }

    public static void findPrimes(int n){
        for(int i=2 ;i<=n ;i++){
            if(Prime(i)){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        findPrimes(n);
        scan.close();
    }
}
