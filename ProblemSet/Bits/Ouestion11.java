package Bits;
//NOT Operator (~): Performs a bitwise complement. It inverts the bits of its operand (0 becomes 1, and 1 becomes 0)

import java.util.Scanner;

class BitwiseNot{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int A= input.nextInt();
        int result= ~A;
        System.out.println("Result is: " + result);
        input.close(); 
    }
}