package pl.sda.arp4.kolekcje_java.zadania;

import java.util.Scanner;

public class Main2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String slowo = scanner.next();
        char[] znaki = slowo.toCharArray();

        if (znaki.length == 2) {
            char znak = znaki[0];

            if (znak >= 'A' && znak <= 'D') {
                System.out.println("Litera jest ok!");
            } else {
                System.out.println("Litera nie jest ok!");
            }
        }
    }
}
