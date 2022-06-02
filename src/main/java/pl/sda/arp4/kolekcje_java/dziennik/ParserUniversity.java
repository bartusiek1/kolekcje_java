package pl.sda.arp4.kolekcje_java.dziennik;

import java.util.Scanner;

public class ParserUniversity {

    private final Dziennik dziennik;
    private final Scanner scanner;

    public ParserUniversity(Dziennik dziennik, Scanner scanner) {
        this.dziennik = dziennik;
        this.scanner = scanner;
    }

    public void pracuj() {
        String komenda;
        do {
            System.out.println("Podaj komende:");
            komenda = scanner.next();

            switch (komenda) {
                case "dodaj":
                    obslugaKomendyDodaj();
                    break;
                case "wypisz":
                    dziennik.wypiszListeStudentow();
                    break;
                case "usun":
                    break;
            }

        } while (!komenda.equalsIgnoreCase("koniec"));
    }

    private void obslugaKomendyDodaj() {
        System.out.println("Podaj indeks:");
        String indeks = scanner.next();

        System.out.println("Podaj imie:");
        String imie = scanner.next();

        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.next();

        dziennik.dodajStudenta(indeks, imie, nazwisko);
    }
}
