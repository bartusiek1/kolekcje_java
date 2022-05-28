package pl.sda.arp4.kolekcje_java;

public class WeryfikatorNumeruMiejsca {

        private int iloscZnakow;
        private char iloscRzedow;

        public WeryfikatorNumeruMiejsca(int iloscZnakow, char iloscRzedow) {
            this.iloscZnakow = iloscZnakow;
            this.iloscRzedow = iloscRzedow;
        }

        public boolean sprawdzCzyWprowadzoneSlowoJestNumeremMiejsca(String slowo) {
            // 4 'F'
            // F121
            //  121
            if (slowo.length() > 1 && slowo.length() <= iloscZnakow) {
                char znak = slowo.charAt(0);

                if (znak >= 'A' && znak <= iloscRzedow) {
                    System.out.println("Litera jest ok!");

                    String wszystkoPozaPierwszymZnakiem = slowo.substring(1);
                    try {
                        int liczba = Integer.parseInt(wszystkoPozaPierwszymZnakiem);
                        System.out.println("Wszystko poza pierwszym znakiem jest cyfrą!");

                        return true; // nie został rzucony wyjątek, wszystkie if'y zostały spełnione
                    } catch (NumberFormatException nfe) {
                        System.out.println("Wszystko poza pierwszym znakiem nie jest cyfrą!");
                    }
                } else {
                    System.out.println("Litera nie jest ok!");
                }
            }
            return false;
        }
    }
}
