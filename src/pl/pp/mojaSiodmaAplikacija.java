package pl.pp;

public class mojaSiodmaAplikacija {
    public static void main(String[] args) {

        Person person1 = new Person("Mateusz", "Karmazyn", 24, "Warszawa", 1997);


        person1.growOld(10);


        person1.hiToAll();
    }
}