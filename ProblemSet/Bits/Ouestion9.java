package Bits;
//Performs on two integers. Each bit of the output is 0 if the corresponding bits of both operands are 0, otherwise 1


import java.util.Scanner;

class BitwiseOr{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int A= input.nextInt();
        System.out.print("Enter Number 2: ");
        int B= input.nextInt();
        int result= A | B;
        System.out.println("Result is: " + result);
        input.close(); 
    }
}