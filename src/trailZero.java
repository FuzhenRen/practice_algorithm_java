/*
    HoteaC 2021/11/19 leetcode <172>

    Given an integer n, return the number of trailing zeroes in n!.
    Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

    Example 1:
    Input: n = 3
    Output: 0
    Explanation: 3! = 6, no trailing zero.

    Example 2:
    Input: n = 5
    Output: 1
    Explanation: 5! = 120, one trailing zero.

    Example 3:
    Input: n = 0
    Output: 0
 */
import java.util.Scanner;
public class trailZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter an integer to count trailing zeros: ");
        int n = input.nextInt();
        System.out.print("Result: ");
        System.out.print(n+"! = "+factorial(n)+", ");
        System.out.print(trailZero(n)+" trailing zero.");
    }
    public static long factorial(long n){
        long output;
        if(n==0||n==1){return 1;}
        output = (n * factorial(n-1));
        return output;
    }

    public static int trailZero(int q){
        long temp = factorial(q);
        int counter = 0;
        while(temp>=0){
            if(temp%10 == 0){
                counter++;
                temp = temp/10;
            }
            else{break;}
        }
        return counter;
    }
}
