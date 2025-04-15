package leetcode;

import java.util.ArrayDeque;
import java.util.Scanner;

public class CheckValidParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(checkIsValid(scan.next()));
    }

    private static boolean checkIsValid(String input) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<input.length();i++){
            char letter = input.charAt(i);
            if(letter=='{')
                stack.push('}');
            else if(letter == '[')
                stack.push(']');
            else if(letter=='(')
                stack.push(')');
            else if(stack.isEmpty() ||  letter!=stack.pop() )
                return false;
        }
        return true;
    }
}
