package pl.sda.arp4.kolekcje_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tyo generyczny to typ w którym mówimy jakiego rodzaju obiekty będzie przechowywać

        Map<String, Panstwo> mapa = new HashMap<>();
        //       ^     ^
        //   klucz   wartosc

        // umieszczenie elementu
        Panstwo polskaPanstwo = new Panstwo("Polska", "Warszawa", 3);
        mapa.put("Polska", polskaPanstwo);
        mapa.put("Niemcy", new Panstwo("Niemcy", "Berlin", 5));
        mapa.put("Czechy", new Panstwo("Czechy", "Praga", 1));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę kraju:");
        String nazwaKraju = scanner.next();

        // warunek wykonania kodu tylko jeśli mapa zaweira wartość wskazaną w skanerze
        if (mapa.containsKey(nazwaKraju)) {

            // pobieranie waretości z mapy
            Panstwo obiektPanstwo = mapa.get(nazwaKraju);
            System.out.println(obiektPanstwo);
            System.out.println("Liczba obywateli: " + obiektPanstwo.getLiczbaLudnosci());
        }else {
            System.err.println("Podany kraj nie istnieje");
        }
    }
}