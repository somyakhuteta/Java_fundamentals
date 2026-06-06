//Create a program to find the sum and average of all elements in an array.

import java.util.Scanner;

class ArraySumAverage{
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and Average");
        int[] numArray = ArrayUtility.inputArray();
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numArray = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = sc.nextInt();
        }*/
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers is: " + avg);
    }
    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}