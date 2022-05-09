package com.kenzie.app;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Do not directly modify this array!
        final int[] numbers = new int[]{469, 755, 244, 245, 758, 450, 302, 20, 712, 71, 456, 21, 398, 339, 882, 848, 179, 535, 940, 472};

        System.out.println("****Array Analyzer Program****");
        // write your code here
        int largest = 0;
        int smallest = numbers[0];
        int sum = 0;
        double average;
        int countEven = 0;
        int countOdd = 0;
        int countEight = 0;
        int[] evenArr, oddArr, divEight;

        // You can create variables to store each result, for example: int largestNumber = 0;
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            if (num % 8 == 0) {
                countEight++;
            }
            sum = sum + num;

        }
        average = (double) sum / numbers.length;
        evenArr = new int[countEven];
        oddArr = new int[countOdd];
        divEight = new int[countEight];
        countEven = countOdd = countEight = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenArr[countEven] = num;
                countEven++;
            } else {
                oddArr[countOdd] = num;
                countOdd++;
            }
            if (num % 8 == 0) {
                divEight[countEight] = num;
                countEight++;
            }
        }


        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Even Numbers: " + Arrays.toString(evenArr));
        System.out.println("Odd Numbers: " + Arrays.toString(oddArr));
        System.out.println("Numbers divisible by 8: " + Arrays.toString(divEight));

    }
}
