package pl.pp;

public class Konto {

    private String numerKonta;
    private double saldo;
    private String wlasciciel;
    private String email;
    private String telefon;

    // Konstruktor
    public Konto(String numerKonta, double saldo, String wlasciciel, String email, String telefon) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
        this.wlasciciel = wlasciciel;
        this.email = email;
        this.telefon = telefon;
    }

    // Getter i Setter
    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    // Metoda do wypłaty środków
    public void wyplata(double kwota) {
        if (kwota <= saldo) {
            saldo -= kwota;
            System.out.println("Pobrano PLN " + kwota + " z konta, Pozostałe saldo = PLN " + saldo);
        } else {
            System.out.println("Brak środków. Masz PLN " + saldo + " na koncie.");
        }
    }

    // Metoda do wpłaty środków
    public void wplata(double kwota) {
        saldo += kwota;
        System.out.println("Wpłata PLN " + kwota + " została wykonana. Nowe saldo PLN " + saldo);
    }
}
    public int getRok_urodzenia() {
        return getRok_urodzenia();
    }
}
