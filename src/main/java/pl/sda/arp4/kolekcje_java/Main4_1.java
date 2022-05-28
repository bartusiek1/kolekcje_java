package pl.sda.arp4.kolekcje_java;

public class Main4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String slowo = scanner.next();

        // 2,3 znaki
//        if (slowo.length() == 2 && slowo.length() == 3) {
        if (slowo.length() > 1 && slowo.length() < 4) {
            char znak = slowo.charAt(0);

            if (znak >= 'A' && znak <= 'F') {
                System.out.println("Litera jest ok!");

                // A38
                // A3
                //
                // AJaLubiePlacki
                // AJ1
                // wytnij pierwszą literę,
                // ze zmiennej 'slowo' wez wszystkie litery zaczynając od indeksu 1
                String wszystkoPozaPierwszymZnakiem = slowo.substring(1);
                try {
                    int liczba = Integer.parseInt(wszystkoPozaPierwszymZnakiem);
                    System.out.println("Wszystko poza pierwszym znakiem jest cyfrą!");
                } catch (NumberFormatException nfe) {
                    System.out.println("Wszystko poza pierwszym znakiem nie jest cyfrą!");
                }
            } else {
                System.out.println("Litera nie jest ok!");
            }
        }
    }
}
