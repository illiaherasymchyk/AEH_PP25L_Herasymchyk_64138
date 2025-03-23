package pl.pp;
import java.util.Scanner;

public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double dni;

        System.out.println("Podaj proszę napisać ile dni pozostało do twoich urodzin:");

        dni = scanner.nextDouble();

        while (dni > 0) {
            int tygodnie = (int) dni / 7;
            int resztaDni = (int) dni % 7;

            System.out.println((int) dni + " dni to " + tygodnie + " tygodnie i " + resztaDni + " dni.");

            System.out.println("Podaj kolejną liczbę dni (lub wpisz 0 lub wartość ujemną, by zakończyć):");
            dni = scanner.nextDouble();
        }

        System.out.println("Program zakończony. Dziękujemy!");
        main2(args);
    }

    public static void main2(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double temperature;

        System.out.println("Podaj prosze temperature w skali Farenheit:");
        temperature = scanner.nextDouble();
        while (temperature >= -1) {

            int temperatureCelcius = (int) (temperature * 1.8 + 32);
            int temperatureKelwin = (int) (temperatureCelcius + 273.16);

            System.out.println((int) temperature + " temperature w skali Farenheit " + temperatureCelcius + " temperature w skali Celcius " + temperatureKelwin + " temperatura w skali Kelwin");            System.out.println("Podaj temperature (lub wpisz -1 lub wartość ujemną, by zakończyć):");
            temperature = scanner.nextDouble();
            }
        scanner.close();
    }
}