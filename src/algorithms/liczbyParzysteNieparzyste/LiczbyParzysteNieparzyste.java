package algorithms.liczbyParzysteNieparzyste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LiczbyParzysteNieparzyste {
    private int poczatek;
    private int koniec;

    private final Scanner sc = new Scanner(System.in);

    public void liczbyParzysteNieparzyste() {
        try {
            System.out.print("Poczatek przedzialu: ");
            poczatek = sc.nextInt();
            System.out.print("Koniec przedzialu: ");
            koniec = sc.nextInt();

            if (poczatek > koniec) {
                int temp = poczatek;
                poczatek = koniec;
                koniec = temp;
            }

            System.out.println("Przedzial: <" + poczatek + ";" + koniec + ">\n");

            if (poczatek == koniec) {
                if (poczatek % 2 == 0) {
                    System.out.println("Liczba jest parzysta");
                } else {
                    System.out.println("Liczba jest nieparzysta");
                }
            } else {
                parzysteNieparzyste();
            }
        } catch (InputMismatchException e) {
            System.out.println("Blad: tylko liczby calkowite");
            sc.nextLine();
        }
    }
    private void parzysteNieparzyste() {
        System.out.print("Liczby parzyste: ");
        for (int i = poczatek; i <= koniec; i++) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Liczby nieparzyste: ");
        for (int i = poczatek; i <= koniec; i++) {
            if (i%2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
