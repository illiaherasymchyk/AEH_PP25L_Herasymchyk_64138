package pl.pp;
import java.util.Scanner;
public class mojaDrugaAplikacija {
 public static void main(String[] args) {

     //to jest komentarz liniowy

     double x = 10; // Utworzenie zmiennej typu double i przypisanie jej wartości 10

     Scanner scanner = new Scanner(System.in);

     var result = x + x;
     System.out.println("x + x = " + result);

     result = 2 * x;
     System.out.println("2 * x = " + result);

     result = x * x;
     System.out.println("x^2 = " + result);


     System.out.println("Prosze podaj swoje imie");
     String imie = scanner.nextLine();

     System.out.println("Prosze podaj swoje nazwisko");
     String surname = scanner.nextLine();

     System.out.println("Wpisz ille masz lat:");
     double first = scanner.nextDouble();

     System.out.println("Oto jak długo żyłeś w sekundach " + (first * 365 * 24 * 60 * 60));

     scanner.close();

     System.out.println("Witaj " + imie + " " + surname + ", masz " + first + " lat, co daje około " + (first * 365 * 24 * 60 * 60) + " sekund życia.");
 }
}
