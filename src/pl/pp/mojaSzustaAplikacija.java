package pl.pp;

import java.util.Scanner;
public class mojaSzustaAplikacija {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj jakas liczbe:");
        int liczba = sc.nextInt();

        // Итеративный способ
        long startIter = System.nanoTime();
        long wynikIter = factorialIterative(liczba);
        long endIter = System.nanoTime();
        System.out.println("Silnia (iteracyjnie): " + wynikIter);
        System.out.println("Czas iteracji: " + (endIter - startIter) + " ms");

        // Рекурсивный способ
        long startRec = System.nanoTime();
        long wynikRec = factorialRecursive(liczba);
        long endRec = System.nanoTime();
        System.out.println("Silnia (rekurencyjnie): " + wynikRec);
        System.out.println("Czas rekursji: " + (endRec - startRec) + " ms");

        sc.close();
    }

    // Метод: факториал итеративно
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Метод: факториал рекурсивно
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}
