//Create a program to swap two numbers.

import java.util.Scanner;

class Swap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int A=input.nextInt();
        System.out.println("Enter number 2: ");
        int B= input.nextInt();
        int C=A;
        A=B;
        B=C;
        System.out.println("1="+ A+ ",2="+ B);
        input.close();

    }
}
