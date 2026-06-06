//Develop a program that prints the multiplication table for a given number.

import java.util.Scanner;

class Table{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number you want get the table of: ");
        int A=input.nextInt();
        int i=0;
        while(i<=10){
            System.out.println(A*i);
            i++;
        }
        input.close();
    }
}