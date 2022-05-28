package pl.sda.arp4.kolekcje_java;

import java.util.Scanner;

public class Main1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String slowo = scanner.next();

        if (slowo.length() == 1) {
            char znak = slowo.charAt(0);

            // 'A' = 71 w ascii
            // 'D' = 74 w ascii
            boolean czyDobryZnak = false;
            for (char i = 'A'; i < 'E'; i++) {
                if (znak == i) {
                    System.out.println("Dobra litera");
                    czyDobryZnak = true;
                }
            }

            if(!czyDobryZnak){
                System.out.println("Zły znak");
            }
        }
    }
}
