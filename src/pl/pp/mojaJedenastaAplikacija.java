package pl.pp;

import java.util.*;

class Student {
    private String index;
    private String imie;
    private String nazwisko;
    private List<Integer> oceny;

    public Student(String index, String imie, String nazwisko, List<Integer> oceny) {
        this.index = index;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }

    public String getIndex() {
        return index;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public List<Integer> getOceny() {
        return oceny;
    }

    public double getSrednia() {
        if (oceny == null || oceny.isEmpty()) return 0.0;
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return (double) suma / oceny.size();
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " (" + index + ") - Average: " + String.format("%.2f", getSrednia());
    }
}

public class mojaJedenastaAplikacja {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // 1. Student z najwyższą średnią
        Student najlepszy = Collections.max(students, Comparator.comparingDouble(Student::getSrednia));
        System.out.println("Student z najwyższą średnią: " + najlepszy);

        // 2. Posortowani według nazwisk
        students.sort(Comparator.comparing(Student::getNazwisko));

        System.out.println("Studenci posortowani według nazwisk:");
        for (Student s : students) {
            System.out.println(s);
        }

        // 3. Średnia wszystkich
        double suma = 0;
        for (Student s : students) {
            suma += s.getSrednia();
        }
        double sredniaGrupy = suma / students.size();
        System.out.println("Średnia wszystkich studentów: " + String.format("%.2f", sredniaGrupy));
    }
}
