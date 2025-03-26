package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę dwie liczby:");

        while (true) {
            System.out.println("Enter lower and upper limit:");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            if (number1 == number2) {
                System.out.println("Done");
                break;
            }

            if (number1 > number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            int suma = 0;
            for (int i = number1; i <= number2; i++) {
                suma += i * i;
            }

            System.out.printf("The sums of the squares from %d to %d is %d\n", number1, number2, suma);
            System.out.println("Podaj dwie identyczne liczby, by zakończyć):");

            main2(scanner);
        }

        scanner.close();
    }

    public static void main2(Scanner scanner) {
        System.out.println("\nNapisz jaką akcję chcesz wykonać:");
        System.out.println("1 - Dodawanie");
        System.out.println("2 - Odejmowanie");
        System.out.println("3 - Mnożenie");
        System.out.println("4 - Dzielenie");
        System.out.println("5 - Wyjście");

        int opcje = scanner.nextInt();

        if (opcje == 5) {
            System.out.println("Wyjście");
            return; // завершаем метод, не продолжаем дальше
        }

        System.out.println("Proszę podaj dwie liczby:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        switch (opcje) {
            case 1:
                System.out.println("Wynik: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Wynik: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Wynik: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Wynik: " + (num1 / num2));
                } else {
                    System.out.println("Nie można dzielić przez 0");
                }
                break;
            default:
                System.out.println("Niepoprawna opcja, wyjście.");
        }
    }
}
