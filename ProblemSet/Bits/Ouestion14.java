package Bits;
//Write a program to check if a given number is even or odd using bitwise operators

import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number you want check for odd even: ");
        int A= input.nextInt();
        if ((A & 1)==0){
            System.out.print("The provided number is even");
        }
        else{
        System.out.print("The provided number is odd");
        }
        input.close();
    }
}