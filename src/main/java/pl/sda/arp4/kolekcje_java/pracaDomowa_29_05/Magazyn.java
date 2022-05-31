package pl.sda.arp4.kolekcje_java.pracaDomowa_29_05;

// Stwórz klasę Magazyn:
//
//    dodajProdukt (po dodaniu stan magazynowy (ilość) ma być 0) (parametry: nazwa, jednostka)
//    wypiszWszystkieProdukty
//    usunProdukt (po nazwie)
//    zwrocProdukt(parametry: nazwa)
//    zwiekszStanMagazynowy (parametry: nazwa, ilość)
//    zmniejszStanMagazynowy (parametry: nazwa, ilość)
//    zwrocListeProduktowKtorychIloscJestMniejszaNiz (parametr: ilosc)


import pl.sda.arp4.kolekcje_java.dziennik.Student;

import java.util.*;

public class Magazyn {

    private Map<String, Product> mapaProduktow = new HashMap<>();


    public void dodajProdukt (String nazwa, String jednostka) {
        if (mapaProduktow.containsKey(nazwa)) {
            System.err.println("Podany produkt już istnieje");
        } else {
            mapaProduktow.put(nazwa, new Product(nazwa, jednostka));
        }
    }
    public void wypiszWszystkieProdukty() {
        System.out.println("Lista produktów:");
        for (Product product : mapaProduktow.values()) {
            System.out.println(product);
        }
    }

    public void usunProdukt (String nazwa) {
        if (mapaProduktow.containsKey(nazwa)) {
            mapaProduktow.remove(nazwa);
            System.out.println("Produkt został usunięty");
        } else {
            System.err.println("Wskazany produkt nie istnieje");
        }
    }

    public Optional<Product> zwrocProdukt (String nazwa) {
        if (mapaProduktow.containsKey(nazwa)) {
            System.out.println("Znaleziono produkt: " + nazwa);
            return Optional.of(mapaProduktow.get(nazwa));
        } else {
            System.out.println("Produkt o podanej nazwie nie istnieje");
            return Optional.empty();
        }
    }

    public void zwiekszStanMagazynowy (String nazwa, Double ilosc) {
        if (!mapaProduktow.containsKey(nazwa)) {
            System.err.println("Wskazany produkt nie istnieje");
        } else {
            Product product = mapaProduktow.get(nazwa);
            product.setIlosc(ilosc);
        }
    }
}
