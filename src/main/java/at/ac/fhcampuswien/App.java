package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class App {

    public static void oneMonthCalendar(int numberofdays, int firstday) {
        int week = 0;
        int days = 0;

        for (int j = 1; j <= 7; j++) {
            if (j == firstday) {
                for (int i = 1; i <= numberofdays; i++) {
                    if (i <= 9) {
                        System.out.print(" " + i + " ");
                    } else {
                        System.out.print(i +" ");
                    }
                    week++;

                    if (week % 7 == 0) {
                        if (days <= 4) {
                            System.out.println("");  // ln bc would be a line
                        }
                        days++;
                    }
                }

            } else if (week < firstday) {
                System.out.print("   ");
                week++;
            }
            if (numberofdays <= 2) {
                System.out.print("");
            }

            if (week % 7 != 0) {
                System.out.println("");  // give an empfty line if there is 0
            }
        }
    }


    public static long[] lcg (long seed) {
        long[] randNumber = new long[10];

        long m = 2147483648L; // 2^31 via calc
        long c = 12345L;
        long a = 1103515245L;

        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                randNumber[0] = (((a * seed) + c) % m);
            } else {
                randNumber[i] = (((a * randNumber[i-1]) + c) % m);
            }

        }
        System.out.println(Arrays.toString(randNumber));
        return randNumber;  //return ends function and return value to function caller

    }

    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        while (counter <= 10) {
            System.out.print("Guess number " + counter + ": ");
            int number = scanner.nextInt();

            if (numberToGuess < number && counter != 10) {
                System.out.println("The number AI picked is lower than your guess.");
            }
            if (numberToGuess > number && counter != 10) {
                System.out.println("The number AI picked is higher than your guess.");
            }
            if (numberToGuess == number) {
                System.out.println("You won wisenheimer!");
                return;
            }
            counter++;
        }
        System.out.println("You lost! Have you ever heard of divide & conquer?");
    }

    public static int randomNumberBetweenOneAndHundred() {
        double random = Math.random();
        double var = random+100;
        return (int) var;
    }

    public static boolean swapArrays(int[] arrayone, int[] arraytwo) {
        if (arrayone.length != arraytwo.length) {
            return false;
        }
        for (int i = 0; i < arrayone.length; i++) {
            arrayone[i] = arrayone[i] + arraytwo[i];
            arraytwo[i] = arrayone[i] - arraytwo[i];
            arrayone[i] = arrayone[i] - arraytwo[i]; // same as in programming 1 exercise with swap numbers
        }
        for (int i = 0; i < arrayone.length; i++)
            System.out.println(arrayone[i]);
        return true;
    }


    public static int checkDigit(int[] array) {
        int summe = 0;
        int check;

        for (int a = 0; a < array.length; a++) {
           summe += array[a] * (a + 2);
        }
        check = 11 - (summe % 11);
        if(check == 10) return 0;
        else if (check == 11) return 5;
        return check;
    }



    public static void main(String[] args) {
        //oneMonthCalendar(28,1);

        //lcg(8);

        //guessingGame(randomNumberBetweenOneAndOneHundred());

        /* int[] arrayone = {1,2,3,4,5}
        int [] arraytwo = {24,9,6,2}
        System.out.println(swapArrays(arrayone, arraytwo));
         */


    }
}

