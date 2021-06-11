/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex28;
import java.util.Scanner;

public class App 
{
    public static int findSum(int n) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            sum += input.nextInt();
        }
        return sum;
    }
    public static void main( String[] args )
    {
        System.out.print("The total is " + findSum(5));
    }
}
