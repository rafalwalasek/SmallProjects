package unitConverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConverterService {
    private boolean shouldContinue;

    private final Scanner sc;
    private final Menu menu;

    public ConverterService() {
        this.sc = new Scanner(System.in);
        this.menu = new Menu();
        this.shouldContinue = true;
    }

    public void unitConverter() {
        while (shouldContinue) {
            menu.mainMenu();

            try {
                int userChoice = sc.nextInt();
                sc.nextLine();
                switch (userChoice) {
                    case 0 -> {
                        System.out.println("Wyjscie z aplikacji");
                        shouldContinue = false;
                    }
                    case 1 -> {
                        menu.lenghtMenu();

                    }
                    default -> System.out.println("Błąd: Nieznana opcja! Wybierz ponownie.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Blad: tylko liczby calkowite");
                sc.nextLine();
            }
        }

        sc.close();
    }
}