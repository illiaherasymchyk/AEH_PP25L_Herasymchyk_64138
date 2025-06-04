package pl.pp;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class mojaTrzynastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path sciezkaWejsciowa;
        Path sciezkaWyjsciowa;

        while (true) {
            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            String wejscie = scanner.nextLine();
            sciezkaWejsciowa = Paths.get(wejscie);

            if (Files.exists(sciezkaWejsciowa)) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Spróbuj ponownie.");
            }
        }

        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        String wyjscie = scanner.nextLine();
        sciezkaWyjsciowa = Paths.get(wyjscie);

        try {
            String zawartosc = Files.readString(sciezkaWejsciowa);
            String[] slowa = zawartosc.split("\\W+");
            int liczbaSlow = slowa.length;

            Map<String, Integer> wystapienia = new TreeMap<>();
            for (String slowo : slowa) {
                if (!slowo.isBlank()) {
                    slowo = slowo.toLowerCase();
                    wystapienia.put(slowo, wystapienia.getOrDefault(slowo, 0) + 1);
                }
            }

            System.out.println("Liczba słów: " + liczbaSlow);
            System.out.println("Wystąpienia słów:");
            for (Map.Entry<String, Integer> entry : wystapienia.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            try (BufferedWriter writer = Files.newBufferedWriter(sciezkaWyjsciowa)) {
                writer.write("Plik: " + sciezkaWejsciowa.getFileName());
                writer.newLine();
                writer.write("Liczba słów: " + liczbaSlow);
                writer.newLine();
                writer.write("Wystąpienia słów:");
                writer.newLine();
                for (Map.Entry<String, Integer> entry : wystapienia.entrySet()) {
                    writer.write(entry.getKey() + ": " + entry.getValue());
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }
}
