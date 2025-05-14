package pl.pp;

public class mojaDzewiantaAplikacja {

    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn(1, 5000, "Jan Kowalski", "jan@example.com", "+48 000 000 000");

        magazyn.dodajTowar(3000);
        magazyn.usunTowar(1000);
        magazyn.dodajTowar(2500);
        magazyn.sprawdzZajetosc();
        magazyn.aktualizujKontakt("owner@magazyn.pl", "+48 123 456 789");
        magazyn.dodajTowar(1000);
    }

    static class Magazyn {
        private int numerMagazynu;
        private int przestrzenMagazynowa;
        private String wlasciciel;
        private String email;
        private String telefon;
        private int zajetaPrzestrzen;

        public Magazyn(int numerMagazynu, int przestrzenMagazynowa, String wlasciciel, String email, String telefon) {
            this.numerMagazynu = numerMagazynu;
            this.przestrzenMagazynowa = przestrzenMagazynowa;
            this.wlasciciel = wlasciciel;
            this.email = email;
            this.telefon = telefon;
            this.zajetaPrzestrzen = 0;
        }

        public void dodajTowar(int ilosc) {
            if (zajetaPrzestrzen + ilosc <= przestrzenMagazynowa) {
                zajetaPrzestrzen += ilosc;
                System.out.println("Dodano " + ilosc + " jednostek towaru. Pozostała przestrzeń magazynowa: " +
                        (przestrzenMagazynowa - zajetaPrzestrzen) + " jednostek.");
            } else {
                System.out.println("Za mało miejsca w magazynie. Pozostała przestrzeń magazynowa: " +
                        (przestrzenMagazynowa - zajetaPrzestrzen) + " jednostek.");
            }
        }

        public void usunTowar(int ilosc) {
            if (ilosc <= zajetaPrzestrzen) {
                zajetaPrzestrzen -= ilosc;
                System.out.println("Usunięto " + ilosc + " jednostek towaru. Pozostała przestrzeń magazynowa: " +
                        (przestrzenMagazynowa - zajetaPrzestrzen) + " jednostek.");
            } else {
                System.out.println("Nie można usunąć więcej towaru, niż jest w magazynie.");
            }
        }

        public void sprawdzZajetosc() {
            System.out.println("Zajęta przestrzeń magazynowa: " + zajetaPrzestrzen + " jednostek.");
            System.out.println("Dostępna przestrzeń magazynowa: " + (przestrzenMagazynowa - zajetaPrzestrzen) + " jednostek.");
        }

        public void aktualizujKontakt(String nowyEmail, String nowyTelefon) {
            this.email = nowyEmail;
            this.telefon = nowyTelefon;
            System.out.println("Zaktualizowano dane kontaktowe właściciela.");
            System.out.println("Nowy email: " + email);
            System.out.println("Nowy numer telefonu: " + telefon);
        }
    }
}
