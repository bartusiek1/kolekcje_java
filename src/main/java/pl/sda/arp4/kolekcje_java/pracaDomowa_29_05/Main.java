package pl.sda.arp4.kolekcje_java.pracaDomowa_29_05;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn();

        magazyn.dodajProdukt("jajka", Jednostka.SZTUKA);
        magazyn.dodajProdukt("mleko", Jednostka.LITR);
        magazyn.dodajProdukt("ser", Jednostka.GRAM);
        magazyn.wypiszWszystkieProdukty();

        magazyn.zwiekszStanMagazynowy("jabłka", 20.0);
        magazyn.zwiekszStanMagazynowy("jajka", 20.0);
        magazyn.wypiszWszystkieProdukty();
        magazyn.zwiekszStanMagazynowy("jajka", 20.0);
        magazyn.wypiszWszystkieProdukty();
        magazyn.zwiekszStanMagazynowy("ser", 2230.0);
        magazyn.wypiszWszystkieProdukty();
        magazyn.zmniejszStanMagazynowy("ser", 1002103.0);
        magazyn.wypiszWszystkieProdukty();

        Optional<StanMagazynowyProduktu> optionalStanMagazynowyProduktu = magazyn.zwrocProdukt("ser");
        if (optionalStanMagazynowyProduktu.isPresent()) {
            StanMagazynowyProduktu stanMagazynowyProduktu = optionalStanMagazynowyProduktu.get();

            System.out.println("Stan magazynowy produktu ser to: " + stanMagazynowyProduktu.getIlosc());
        } else {
            System.out.println("Nie znaleziono produktu");
        }

        List<StanMagazynowyProduktu> listaZakupowa = magazyn.zwrocListeProduktowKtorychIloscJestMniejszaNiz(300);
        System.out.println("Lista zakupowa:");
        for (StanMagazynowyProduktu stanMagazynowyProduktu : listaZakupowa) {
            System.out.println(stanMagazynowyProduktu);
        }
        System.out.println("Ilosc produktow na liscie zakupowej to: " + listaZakupowa.size());
    }
}