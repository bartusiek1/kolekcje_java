package pl.sda.arp4.kolekcje_java;

public class Main3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String slowo = scanner.next();

        if (slowo.length() == 2) {
            char znak = slowo.charAt(0);

            if (znak >= 'A' && znak <= 'F') {
                System.out.println("Litera jest ok!");

                char znakDrugi = slowo.charAt(1);
                if(Character.isDigit(znakDrugi)){
                    System.out.println("Znak drugi jest cyfrą!");
                }else{
                    System.out.println("Znak drugi nie jest cyfrą!");
                }
            } else {
                System.out.println("Litera nie jest ok!");
            }
        }
    }
}

