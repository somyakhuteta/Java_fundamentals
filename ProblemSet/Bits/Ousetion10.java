package Bits;
//XOR Operator (^): Performs on two integers. Each bit of the output is 1 if the corresponding bits of the operands are different.

import java.util.Scanner;

class BitwiseXor{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int A= input.nextInt();
        System.out.print("Enter Number 2: ");
        int B= input.nextInt();
        int result= A ^ B;
        System.out.println("Result is: " + result);
        input.close(); 
    }
}
