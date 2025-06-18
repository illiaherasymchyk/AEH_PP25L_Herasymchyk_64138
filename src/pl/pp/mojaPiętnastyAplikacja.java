package pl.pp;

public class mojaPiętnastyAplikacja {

    interface Gatunek {
        String getNazwaGatunku();
    }

    static class Fantastyka implements Gatunek {
        public String getNazwaGatunku() {
            return "Fantastyka";
        }
    }

    static class Kryminał implements Gatunek {
        public String getNazwaGatunku() {
            return "Kryminał";
        }
    }

    static class Romanse implements Gatunek {
        public String getNazwaGatunku() {
            return "Romanse";
        }
    }

    static abstract class Ksiazka {
        protected String tytul;
        protected String autor;
        protected String isbn;
        protected int rokWydania;
        protected boolean wypozyczona;

        public Ksiazka(String tytul, String autor, String isbn, int rokWydania) {
            this.tytul = tytul;
            this.autor = autor;
            this.isbn = isbn;
            this.rokWydania = rokWydania;
            this.wypozyczona = false;
        }

        public void wypozycz() {
            if (!wypozyczona) {
                wypozyczona = true;
                System.out.println("Wypożyczono książkę: " + tytul);
            } else {
                System.out.println("Książka \"" + tytul + "\" jest już wypożyczona.");
            }
        }

        public void zwroc() {
            if (wypozyczona) {
                wypozyczona = false;
                System.out.println("Zwrócono książkę: " + tytul);
            } else {
                System.out.println("Książka \"" + tytul + "\" nie była wypożyczona.");
            }
        }
    }

    static class Powiesc extends Ksiazka {
        private int liczbaStron;

        public Powiesc(String tytul, String autor, String isbn, int rokWydania, int liczbaStron) {
            super(tytul, autor, isbn, rokWydania);
            this.liczbaStron = liczbaStron;
        }
    }

    static class Biografia extends Ksiazka {
        private String postac;

        public Biografia(String tytul, String autor, String isbn, int rokWydania, String postac) {
            super(tytul, autor, isbn, rokWydania);
            this.postac = postac;
        }
    }

    static class Przewodnik extends Ksiazka {
        private String temat;

        public Przewodnik(String tytul, String autor, String isbn, int rokWydania, String temat) {
            super(tytul, autor, isbn, rokWydania);
            this.temat = temat;
        }
    }

    public static void main(String[] args) {
        Gatunek fantasy = new Fantastyka();
        Gatunek crime = new Kryminał();
        Gatunek love = new Romanse();

        Powiesc ks1 = new Powiesc("Wiedźmin", "A. Sapkowski", "978-83-123", 1994, 320);
        Biografia ks2 = new Biografia("Steve Jobs", "Walter Isaacson", "978-83-234", 2011, "Steve Jobs");
        Przewodnik ks3 = new Przewodnik("Jak programować w Javie", "J. Nowak", "978-83-456", 2020, "Programowanie");

        System.out.println("Gatunek: " + fantasy.getNazwaGatunku());
        ks1.wypozycz();
        ks1.wypozycz();
        ks1.zwroc();
        ks1.zwroc();

        System.out.println("\nGatunek: " + crime.getNazwaGatunku());
        ks2.wypozycz();

        System.out.println("\nGatunek: " + love.getNazwaGatunku());
        ks3.wypozycz();
        ks3.zwroc();
    }
}
