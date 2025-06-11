package pl.pp;
public class mojaCzternastaAplikacja {

    interface TypPaliwa {
        String getTypPaliwa();
    }

    static class Diesel implements TypPaliwa {
        public String getTypPaliwa() {
            return "Diesel";
        }
    }

    static class Benzyna implements TypPaliwa {
        public String getTypPaliwa() {
            return "Benzyna";
        }
    }

    static class Elektryk implements TypPaliwa {
        public String getTypPaliwa() {
            return "Elektryczny";
        }
    }

    static abstract class Pojazd {
        protected String nrRejestracyjny;
        protected String numerVin;
        protected String kolor;
        protected double cena;
        protected double spalanie;
        protected double poziomPaliwa;
        protected double przebieg;

        public Pojazd(String nrRejestracyjny, String numerVin, String kolor,
                      double cena, double spalanie, double poziomPaliwa, double przebieg) {
            this.nrRejestracyjny = nrRejestracyjny;
            this.numerVin = numerVin;
            this.kolor = kolor;
            this.cena = cena;
            this.spalanie = spalanie;
            this.poziomPaliwa = poziomPaliwa;
            this.przebieg = przebieg;
        }

        public void prowadz(double kilometry) {
            double potrzebnePaliwo = (kilometry * spalanie) / 100;
            if (potrzebnePaliwo <= poziomPaliwa) {
                przebieg += kilometry;
                poziomPaliwa -= potrzebnePaliwo;
                System.out.println("Pojazd przejechał " + kilometry + " km.");
            } else {
                System.out.println("Za mało paliwa na " + kilometry + " km. Zatankuj pojazd.");
            }
        }

        public void zatankuj(double litry) {
            poziomPaliwa += litry;
            System.out.println("Zatankowano " + litry + " litrów paliwa.");
        }
    }

    static class Osobowe extends Pojazd {
        private int liczbaDrzwi;

        public Osobowe(String nrRejestracyjny, String numerVin, String kolor,
                       double cena, double spalanie, double poziomPaliwa,
                       double przebieg, int liczbaDrzwi) {
            super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
            this.liczbaDrzwi = liczbaDrzwi;
        }
    }

    static class Ciezarowka extends Pojazd {
        private double ladownosc;

        public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor,
                          double cena, double spalanie, double poziomPaliwa,
                          double przebieg, double ladownosc) {
            super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
            this.ladownosc = ladownosc;
        }
    }

    static class Motocykl extends Pojazd {
        private boolean posiadaDostawe;

        public Motocykl(String nrRejestracyjny, String numerVin, String kolor,
                        double cena, double spalanie, double poziomPaliwa,
                        double przebieg, boolean posiadaDostawe) {
            super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
            this.posiadaDostawe = posiadaDostawe;
        }
    }

    static class SprzetBudowlany extends Pojazd {
        private int przepracowaneGodziny;

        public SprzetBudowlany(String nrRejestracyjny, String numerVin, String kolor,
                               double cena, double spalanie, double poziomPaliwa,
                               double przebieg, int przepracowaneGodziny) {
            super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
            this.przepracowaneGodziny = przepracowaneGodziny;
        }
    }

    public static void main(String[] args) {
        // Typy paliwa
        TypPaliwa diesel = new Diesel();
        TypPaliwa benzyna = new Benzyna();
        TypPaliwa elektryk = new Elektryk();

        Osobowe auto = new Osobowe("WW11111", "VIN001", "Czerwony", 40000, 7.0, 30, 10000, 5);
        Ciezarowka tir = new Ciezarowka("WW22222", "VIN002", "Biały", 150000, 15.0, 200, 20000, 10000);
        Motocykl moto = new Motocykl("WW33333", "VIN003", "Czarny", 15000, 3.5, 10, 5000, true);
        SprzetBudowlany koparka = new SprzetBudowlany("WW44444", "VIN004", "Żółty", 300000, 12.0, 80, 15000, 2000);
        
        System.out.println("Typ paliwa dla samochodu osobowego: " + benzyna.getTypPaliwa());
        auto.prowadz(100);
        auto.zatankuj(20);
        auto.prowadz(200);

        System.out.println("\nTyp paliwa dla ciężarówki: " + diesel.getTypPaliwa());
        tir.prowadz(300);

        System.out.println("\nTyp paliwa dla motocykla: " + benzyna.getTypPaliwa());
        moto.prowadz(50);

        System.out.println("\nTyp paliwa dla sprzętu budowlanego: " + diesel.getTypPaliwa());
        koparka.prowadz(60);
    }
}
