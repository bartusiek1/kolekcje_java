package pl.sda.arp4.kolekcje_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

    /**
     * Stwórz klasę ListaZadanDoZrealizowania i w niej:
     * i. pole z listą zadań do zrealizowania
     * ii. następujące metody:
     * 1. dodaj zadanie
     * 2. znajdź i wypisz zadanie (po jego PEŁNEJ nazwie)
     * 3. znajdź i wypisz zadanie (po szukanej frazie która może być częścią
     * nazwy)
     * 4. zwróć zadanie (po jego PEŁNEJ nazwie)
     * 5. zwróć zadanie (po szukanej frazie która może być częścią nazwy)
     * 6. usuń zadanie
     */
    public class ListaZadanDoZrealzowania {
        private List<Zadanie> lista = new ArrayList<>();

        public void dodajZadanie(Zadanie noweZadanieDoDodania) {
            lista.add(noweZadanieDoDodania);
        }

        public void znajdzIWypiszZadanie(String pelnaNazwa) {
            for (Zadanie zadanie : lista) {
                if (zadanie.getNazwa().equals(pelnaNazwa)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                }
            }
        }

        public Optional<Zadanie> znajdzIZwrocZadanie(String pelnaNazwa) {
            for (Zadanie zadanie : lista) {
//            if (pelnaNazwa.equals(zadanie.getNazwa())) {
                if (zadanie.getNazwa().equals(pelnaNazwa)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                    return Optional.of(zadanie);
                }
            }
            return Optional.empty();
        }

        public Zadanie znajdzIZwrocZadanieNull(String pelnaNazwa) {
            for (Zadanie zadanie : lista) {
                if (zadanie.getNazwa().equals(pelnaNazwa)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                    return zadanie;
                }
            }
            return null;
        }

        public Zadanie znajdzIZwrocZadanieWyjatek(String pelnaNazwa) {
            for (Zadanie zadanie : lista) {
                if (zadanie.getNazwa().equals(pelnaNazwa)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                    return zadanie;
                }
            }
            throw new NieZnalezionoException("Nie znaleziono zadania po pelnej nazwie: " + pelnaNazwa);
        }

        public void znajdzIWypiszZadaniePoSzukanejFrazie(String szukanaFraza) {
            for (Zadanie zadanie : lista) {
                if (zadanie.getNazwa().contains(szukanaFraza)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                }
            }
        }

        public Optional<Zadanie> znajdzIZwrocZadaniePoSzukanejFrazie(String szukanaFraza) {
            for (Zadanie zadanie : lista) {
                if (zadanie.getNazwa().contains(szukanaFraza)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                    return Optional.of(zadanie);
                }
            }
            return Optional.empty();
        }

        public Zadanie znajdzIZwrocZadaniePoSzukanejFrazieWyjatek(String szukanaFraza) throws NieZnalezionoJawnyException {
            for (Zadanie zadanie : lista) {
                if (zadanie.getNazwa().contains(szukanaFraza)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                    return zadanie;
                }
            }
            throw new NieZnalezionoJawnyException("Nie znaleziono zadania po szukanej frazie: " + szukanaFraza);
        }

        /**
         * Założenie jest że istnieje tylko jeden obiekt z taką nazwą
         *
         * @param pelnaNazwa
         */
        public void usunZadanie(String pelnaNazwa) {
            // foreach
            // szukamy B
            // A C D E
            //  ^
            // Concurrent  Modification Exception
            // Współbieżne modyfikowanie kolekcji
            for (Zadanie zadanie : lista) {
                if (zadanie.getNazwa().equals(pelnaNazwa)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                    lista.remove(zadanie);
                    return;
                }
            }
        }

        /**
         * Usuwa wszystkie zadania których nazwa pasuje do parametru
         *
         * @param pelnaNazwa
         */
        public void usunZadania1(String pelnaNazwa) {
            // Szukamy B
            // A C D E W
            //         ^
            // i = 4
            for (int i = 0; i < lista.size(); i++) {
                Zadanie zadanie = lista.get(i);

                if (zadanie.getNazwa().equals(pelnaNazwa)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                    lista.remove(zadanie);
                    i--;
                }
            }
        }

        /**
         * Usuwa wszystkie zadania których nazwa pasuje do parametru
         *
         * @param pelnaNazwa
         */
        public void usunZadania2(String pelnaNazwa) {
            //  A C D E W
            //          ^
            Iterator<Zadanie> iterator = lista.iterator();
            while (iterator.hasNext()) {
                Zadanie zadanie = iterator.next();

                if (zadanie.getNazwa().equals(pelnaNazwa)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                    iterator.remove();
                }
            }
        }

        public void usunZadanie2(String pelnaNazwa) {
            Optional<Zadanie> znalezioneZadanie = znajdzIZwrocZadanie(pelnaNazwa);
            if (znalezioneZadanie.isPresent()) {
                Zadanie zadanie = znalezioneZadanie.get();

                System.out.println("Znaleziono zadanie: " + zadanie);
                lista.remove(zadanie);
            }
        }

        public void oznaczZadanieZaZrealizowane(String pelnaNazwa) {
            for (Zadanie zadanie : lista) {
                if (zadanie.getNazwa().equals(pelnaNazwa)) {
                    System.out.println("Znaleziono zadanie: " + zadanie);
                    zadanie.setWykonane(true);
                }
            }
        }

        public void oznaczZadanieZaZrealizowane2(String pelnaNazwa) {
            Optional<Zadanie> znalezioneZadanie = znajdzIZwrocZadanie(pelnaNazwa);
            if (znalezioneZadanie.isPresent()) {
                Zadanie zadanie = znalezioneZadanie.get();

                System.out.println("Znaleziono zadanie: " + zadanie);
                zadanie.setWykonane(true);
            }
        }

        public void wypiszZadaniaNiezrealizowane() {
            for (Zadanie zadanie : lista) {
                if (!zadanie.isWykonane()) {
                    System.out.println("Niezrealizowane: " + zadanie);
                }
            }
        }

        public void wypiszZadaniaZrealizowane() {
            for (Zadanie zadanie : lista) {
                if (zadanie.isWykonane()) {
                    System.out.println("Zrealizowane: " + zadanie);
                }
            }
        }

        public List<Zadanie> zwrocListeZadanNiezrealizowanych() {
//        iv. ***** zwróć listę zadań które nie są zrealizowane
            List<Zadanie> listaZadanNie = new ArrayList<>();

            for (Zadanie zadanie : lista) {
                if (!zadanie.isWykonane()) {
                    listaZadanNie.add(zadanie);
                }
            }
            return listaZadanNie;
        }
    }

