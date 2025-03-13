package pl.pp;
import java.util.Scanner;
public class mojaDrugaAplikacija {
 public static void main(String[] args) {

     //to jest komentarz liniowy

     double x = 10; // Utworzenie zmiennej typu double i przypisanie jej wartości 10
     double y = 2;

     Scanner scanner = new Scanner(System.in);

     var result = x + y;
     System.out.println("x + y = " + result);

     result = x - y;
     System.out.println("x - y = " + result);

     result = x * y;
     System.out.println("x * y = " + result);

     result = x / y;
     System.out.println("x / y = " + result);

     result = x % y;
     System.out.println("x % y = " + result);

     System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");
     double first = scanner.nextDouble(); // Prośba o wpisanie wartości typu double
     double second = scanner.nextDouble();

     System.out.println("x + y = " + (first + second));

     System.out.println("Prosze podaj swoje imie");
     String imie = scanner.nextLine();

     System.out.println("Prosze podaj swoje nazwisko");
     String surname = scanner.nextLine();

     scanner.close();

     System.out.println("Witaj " + imie + " " + surname );
 }
}
