import java.util.Scanner;

public class SievePrimeNumbers {

    static void sievePrimeFinder(int n){
        boolean[] primeMarker = new boolean[n+1];
        for(int i=2 ; i*i<=n ; i++){
            if(!primeMarker[i]){ // if the primeMarker is false then mark all the diviser of number
                for(int j=i*i ; j<=n ; j+=i){
                    primeMarker[j]=true;
                }
            }
        }


        StringBuilder primes = new StringBuilder();
        for(int i =2;i<=n;i++){
            if(!primeMarker[i]){
                primes.append(i).append(" ");
            }
        }

        System.out.print(primes.toString().trim());
    }

    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sievePrimeFinder(n);
    }
}
