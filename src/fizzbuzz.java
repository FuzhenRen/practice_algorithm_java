/*
    HoteaC 2021/11/11 LeetCode<412>

    Given an integer n, return a string array answer (1-indexed) where:

    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i if non of the above conditions are true.

    Example 1:
    Input: n = 3
    Output: ["1","2","Fizz"]

    Example 2:
    Input: n = 5
    Output: ["1","2","Fizz","4","Buzz"]

    Example 3:
    Input: n = 15
    Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */
import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args){
        System.out.println("Please, enter an integer to start FizzBuzz: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        fizzbuzz(n);
        //System.out.print(fizzbuzz(input).length);
        for(int i = 0; i < n; i++){
            System.out.print(fizzbuzz(n)[i]+", ");
        }
    }
    public static String[] fizzbuzz(int n) {
        String answer[] = new String[n];
        for(int i = 0; i < n; i++){
            int content = i+1;
            if(content%3 == 0){
                answer[i] = "Fizz";
            }
            else if(content%5 == 0){
                answer[i] = "Buzz";
            }
            else{
                answer[i] = String.valueOf(content);
            }
        }
        return answer;
    }
}
