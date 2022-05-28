package pl.sda.arp4.kolekcje_java;

import java.util.Scanner;

public class Main1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String slowo = scanner.next();

        if (slowo.length() == 1) {
            char znak = slowo.charAt(0);

            if (znak == 'A' || znak == 'B' || znak == 'C' || znak == 'D') {
                System.out.println("Litera jest ok!");
            } else {
                System.out.println("Litera nie jest ok!");
            }
        }
    }
}

