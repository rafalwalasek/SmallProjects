package unitConverter;

import java.util.Scanner;

public class Mass {
    private boolean shouldContinue = true;
    private int userChoice;

    private Scanner scanner = new Scanner(System.in);
    private Menu menu = new Menu();

    void showMasses() {

        while (shouldContinue) {
            menu.lenghtMenu();
            if (scanner.hasNextInt()) {

                userChoice = scanner.nextInt();
                scanner.nextLine();
                switch (userChoice) {
                    case 0 -> {
                        System.out.println("Wyjscie do menu glownego...");
                        shouldContinue = false;
                    }
                    default -> System.out.println("Błąd: Nieznana opcja! Wybierz ponownie.");
                }

            } else {
                System.out.println("To nie jest cyfra! Spróbuj ponownie.");
                scanner.nextLine(); //czyszczenie blednego wejscia
            }
        }
        shouldContinue = true;

    }
}
