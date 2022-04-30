/*
    HoteaC 2021/11/12 LeetCode<9>

    Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

    Example 1:
    Input: x = 121
    Output: true

    Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

    Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

    Example 4:
    Input: x = -101
    Output: false

 */
import java.util.Scanner;
public class palindromeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print(isPanlindrom(n));
    }
    public static boolean isPanlindrom(int n){
        if(n<0||(n%10==0 && n!=0)){
            return false;
        }
        else{
            int revers = 0;
            while(n>revers){
                int pop = n%10;
                revers = revers*10+pop;
                n = n/10;
            }
            return n==revers || n==revers/10;
        }
    }
    public static void divi(int n){
        if(n<0){
            System.out.print("XXX");
        }else{
            int a = n/10;
            System.out.print("nihao: "+a);
        }

    }
}
