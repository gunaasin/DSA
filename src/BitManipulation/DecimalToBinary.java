package BitManipulation;

import java.util.Scanner;

public class DecimalToBinary {

    static String convertDecimalToBinary(int n) {
        String binary = "";
        while(n>=1){
            int x = n % 2;
            n =  n / 2;
            binary =x + binary;
        }
        return binary;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String value = convertDecimalToBinary(n);
        System.out.println(value);
        System.out.println(convertBinaryToDecimal(value));
    }


    static int convertBinaryToDecimal(String value){
        int res = 0;
        int powerOf2 = 1;

        for(int i=value.length()-1;i>=0;i--){
            if(value.charAt(i)=='1')
                res = res + powerOf2;
            powerOf2 = powerOf2 * 2;
        }
        return res;
    }
}
