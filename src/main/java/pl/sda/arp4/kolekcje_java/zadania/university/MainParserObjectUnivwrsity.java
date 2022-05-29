package pl.sda.arp4.kolekcje_java.zadania.university;

import java.util.Optional;
import java.util.Scanner;

public class MainParserObjectUnivwrsity {
    public static void main(String[] args) {
        University university = new University();

        Scanner scanner = new Scanner(System.in);

        Parser parser = new Parser(scanner, university);
        parser.obslugaKomend();
}
}
