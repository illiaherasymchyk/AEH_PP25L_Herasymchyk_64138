package pl.pp;

public class Person {
    public String forename;
    public String surname;
    public int age;
    public String adres;
    public int rok_urodzenia;

    public Person() { }

    public Person(String initForename, String initSurname, int initAge, String initAdres, int initRok_orodzenia) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        adres = initAdres;
        rok_urodzenia = initRok_orodzenia;
    }

    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". Mam " + age + " lat. Mieszkam w " + adres + ". Urodzil sie " + rok_urodzenia + ". " );
    }

    public int growOld(int years){
        age = age + years ;
        return age;
    }

    public int beYounger (){
        age = age - 1 ;
        return age;
    }

    public String getName(){
        return forename;
    }

    public void setName(String nameToSet){
        forename = nameToSet;
    }

    public String getAdres() {
        return adres;
    }

    public int getRok_urodzenia() {
        return getRok_urodzenia();
    }
}
