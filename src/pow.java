/*
    HoteaC 2021/11/19 leetcode<50>

    Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

    Example 1:
    Input: x = 2.00000, n = 10
    Output: 1024.00000

    Example 2:
    Input: x = 2.10000, n = 3
    Output: 9.26100

    Example 3:
    Input: x = 2.00000, n = -2
    Output: 0.25000
    Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */

import java.util.*;
public class pow {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please, enter a double and an integer for pow(a, n): ");
        double a = input.nextDouble();
        int b = input.nextInt();
        System.out.println("pow: "+pow01(a,b));
    }
    public static double pow01(double x, int n){
        double output = 1;
        if(n>=0){
            for(int i=0; i<n; i++){
                output *= x;
            }
            return output;
        }
        else{
            x = 1/x;
            n = -n;
            for(int i=0; i<n; i++){
                output *= x;
            }
            return output;
        }
    }


}
