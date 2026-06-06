package Bits;
//Right Shift Operator (>>): Shifts the left operand’s bits to the right. If the left operand is positive, zeros are filled into the new leftmost bits; if negative, ones are filled in.


import java.util.Scanner;

class RightShift{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to right shift: ");
        int A = input.nextInt();
        System.out.print("Enter the number of times you want to right shift: ");
        int i = input.nextInt();
        int result= A>>i;
        System.out.print("The result is: " + result);
        input.close();
    }
}