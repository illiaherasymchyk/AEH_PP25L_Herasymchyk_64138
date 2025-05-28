package pl.pp;
import java.io.*;
import java.nio.file.*;
import java.util.*;


public class mojaDwunatsaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ścieżkę do pliku tekstowego wejściowego: ");
        String sciezkaWejsciowa = scanner.nextLine();

        System.out.print("Podaj ścieżkę do pliku tekstowego wyjściowego: ");
        String sciezkaWyjsciowa = scanner.nextLine();

        try {
            Path pathToFile = Paths.get(sciezkaWejsciowa); // исправлено
            List<String> linie = Files.readAllLines(pathToFile); // читаем файл

            int liczbaLinii = linie.size();
            System.out.println("Liczba linii w pliku: " + liczbaLinii);

            String nazwaPliku = pathToFile.getFileName().toString();
            String wynik = "Nazwa pliku: " + nazwaPliku + "\nLiczba linii: " + liczbaLinii;

            Files.write(Paths.get(sciezkaWyjsciowa), wynik.getBytes()); // сохраняем результат
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas przetwarzania plików: " + e.getMessage());
        }
    }
}
