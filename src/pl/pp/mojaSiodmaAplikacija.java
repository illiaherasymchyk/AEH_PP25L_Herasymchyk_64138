package pl.pp;

public class mojaOsmaAplikacja {
    public static void main(String[] args) {
        Konto konto1 = new Konto(
                "1234567890",
                1000.0,
                "Jan Kowalski",
                "jan@example.com",
                "123456789"
        );
        System.out.println();
        // Przykładowe operacje
        konto1.wyplata(900.0);
        konto1.wplata(250.0);
        konto1.wyplata(50.0);
        konto1.wyplata(500.0);
    }
}
