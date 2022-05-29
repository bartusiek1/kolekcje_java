package pl.sda.arp4.kolekcje_java.zadanieDomowe28_05;

import pl.sda.arp4.kolekcje_java.Panstwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainProduktMapa {
    public static void main(String[] args) {
        Map<String, Produkt> mapaProduktow = new HashMap<>();
        mapaProduktow.put("maslo", new Produkt("maslo", 2.30, 5, "123123"));
        mapaProduktow.put("chlebek", new Produkt("chlebek", 5.30, 10, "123124"));
        mapaProduktow.put("ser", new Produkt("ser", 8.10, 12, "123125"));

        Scanner scanner = new Scanner(System.in);

        String komenda;

        do {
            System.out.println("Podaj komende: (dodaj/usun/znajdz/wypisz)");
            komenda = scanner.next();

            if (komenda.equals("wypisz")) {
                System.out.println(mapaProduktow);
            } else if (komenda.equals("znajdz")) {
                System.out.println("Podaj nazwe:");
                String nazwa = scanner.next();

                if (mapaProduktow.containsKey(nazwa)) {
                    Produkt produkt = mapaProduktow.get(nazwa);
                    System.out.println("Mamy prodykt: " + produkt);
                    System.out.println("Stan magazynowy: " + produkt.getilosc());
                } else {
                    System.err.println("Nie znaleziono produktu");
                }
            } else if (komenda.equals("dodaj")) {
                System.out.println("Podaj nazwe:");
                String nazwa = scanner.next();

                if (mapaProduktow.containsKey(nazwa)) {
                    System.err.println("Produkt o podanej nazwie już istnieje");
                    // jeśli posiadamy produkt o takiej nazwie
                    // nie chcemy kontynuować i chcemy poprosić użytkownika ponownie
                    continue;
                }

                System.out.println("Podaj cene:");
                double cena = scanner.nextDouble();

                System.out.println("Podaj ilosc:");
                int ilosc = scanner.nextInt();

                System.out.println("Podaj kod:");
                String kod = scanner.next();

                Produkt p = new Produkt(nazwa, cena, ilosc, kod);
                mapaProduktow.put(nazwa, p);
            } else if (komenda.equals("usun")) {
                System.out.println("Podaj nazwe:");
                String nazwa = scanner.next();

                if (mapaProduktow.containsKey(nazwa)) {
                    mapaProduktow.remove(nazwa);
                    System.out.println("Usunięto produkt");
                } else {
                    System.err.println("Nie znaleziono produktu");
                }
            }
        } while (!komenda.equalsIgnoreCase("koniec"));

        /// tutaj po break
    }
}
