package pl.sda.arp4.kolekcje_java.pracaDomowa_29_05;

/**
 *
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn();

        magazyn.dodajProdukt("baleron", "kg");
        magazyn.dodajProdukt("nutella", "szt");
        magazyn.dodajProdukt("majonez", "szt");
        magazyn.dodajProdukt("ziemniaki", "kg");

        magazyn.wypiszWszystkieProdukty();




    }
}
