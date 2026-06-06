package Bits;
//Left Shift Operator (<<): Shifts the left operand’s bits to the left by the number of positions specified by the right operand, filling the new rightmost bits with zeros.

import java.util.Scanner;

class LeftShift{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to left shift: ");
        int A = input.nextInt();
        System.out.print("Enter the number of times you want to left shift: ");
        int i = input.nextInt();
        int result= A<<i;
        System.out.print("The result is: " + result);
        input.close();
    }
}