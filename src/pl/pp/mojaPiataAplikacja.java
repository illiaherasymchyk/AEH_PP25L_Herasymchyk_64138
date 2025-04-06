package pl.pp;
import java.util.Scanner;

public class mojaPiataAplikacja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //symbol
        System.out.println("Podaj jakis symbol");
        String symbol = sc.nextLine();
        //number1
        System.out.println("Podaj liczbe (ile wierszy):");
        String liczbe1 = sc.nextLine();
        int rows = Integer.parseInt(liczbe1);
        //number2
        System.out.println("Podaj liczbe (ile kolumn):");
        String liczbe2 = sc.nextLine();
        int cols = Integer.parseInt(liczbe2);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        sc.close();
    }
}