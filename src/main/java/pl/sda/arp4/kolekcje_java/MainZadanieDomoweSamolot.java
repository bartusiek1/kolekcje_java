package pl.sda.arp4.kolekcje_java;

import java.util.Scanner;

public class MainZadanieDomoweSamolot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst");
        String tekst = scanner.nextLine();

        int dlugoscTekstu = tekst.length();
        // Jeśli nie wpisaliśmy 2/3 liter
        if (dlugoscTekstu > 3 || dlugoscTekstu < 2) {
            System.err.println("Błędna długość tekstu");
            return; // to sprawia że program się dalej nie wykonuje,
            // można to zrobić na wiele sposobów, tutaj nowy
        }

        char pierwszaLitera = tekst.charAt(0);
        // Jeśli litera jest spoza zakresu A-F
        if (pierwszaLitera < 'A' || pierwszaLitera > 'F') {
            System.err.println("Błędna litera");
            return; // to sprawia że program się dalej nie wykonuje,
            // można to zrobić na wiele sposobów, tutaj nowy
        }

        // jeśli kod dotarł tutaj, to znaczy że wpisaliśmy 2 lub 3 znaki i pierwszy jest z zakresu A-F
        String tekstPozaPierwszymZnakiem = tekst.substring(1); // to ucina pierwszy znak
        System.out.println("Wszystko poza pierwszym znakiem : " + tekstPozaPierwszymZnakiem);

        try {
            int liczbaWpisanaPoLiterze = Integer.parseInt(tekstPozaPierwszymZnakiem);

            System.out.println("Udało się sparsować liczbe: " + liczbaWpisanaPoLiterze);
        } catch (NumberFormatException nfe) {
            System.err.println("Nie udalo sie sparsować liczby, podana liczba jest niepoprawna");
        }
    }
}