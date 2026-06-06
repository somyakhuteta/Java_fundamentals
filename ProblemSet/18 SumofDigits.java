//Create a program that computes the sum of the digits of an integer.

import java.util.Scanner;

class SumofDigits{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number you want to sum the digits of: ");
        int num= input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits of " + num + " is: " + sum);
        input.close();
    }
    public static int sumOfDigits(int num){
        int Sum=0;
        while(num>0){
            Sum+=num%10;
            num/=10;
        }
        return Sum;
    }
}
