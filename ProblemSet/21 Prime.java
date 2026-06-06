//Create a program to check whether a given number is prime.

import java.util.Scanner;

class Prime{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number for which want to calculate prime or not: ");
        int A=input.nextInt();
        boolean isPrime = isPrime(A);
        if (isPrime) {
            System.out.println("Your number is Prime");
        } else {
            System.out.println("Your number is not prime");
        }
        input.close();
    }
    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    } 
}