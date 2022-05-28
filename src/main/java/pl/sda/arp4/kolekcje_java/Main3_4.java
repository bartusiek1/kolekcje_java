package pl.sda.arp4.kolekcje_java;

public class Main3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String slowo = scanner.next();

        if (slowo.length() == 2) {
            char znak = slowo.charAt(0);

            if (znak >= 'A' && znak <= 'F') {
                System.out.println("Litera jest ok!");

                // A3
                // AJaLubiePlacki
                // AJ
                // wytnij pierwszą literę,
                // ze zmiennej 'slowo' wez wszystkie litery zaczynając od indeksu 1
                String wszystkoPozaPierwszymZnakiem = slowo.substring(1);
                try {
                    // scanner -> slowo -> slowo.equals('dodaj')
                    int liczba = Integer.valueOf(wszystkoPozaPierwszymZnakiem);
                    System.out.println("Znak drugi jest cyfrą!");
                } catch (NumberFormatException nfe) {
                    System.out.println("Znak drugi nie jest cyfrą!");
                }
            } else {
                System.out.println("Litera nie jest ok!");
            }
        }
    }
}

