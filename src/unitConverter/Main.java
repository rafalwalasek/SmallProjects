package unitConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userChoice;
        boolean shouldContinue = true;

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Lenght lenght = new Lenght();
        Mass mass = new Mass();

        while (shouldContinue) {
            menu.mainMenu();
            if (scanner.hasNextInt()) { //spr czy user podal cyfre

                userChoice = scanner.nextInt();
                scanner.nextLine(); //czyszczenie bufora
                switch (userChoice) {
                    case 0 -> {
                        System.out.println("Zamykanie programu...");
                        shouldContinue = false;
                    }
                    case 1 -> lenght.showLenghts();
                    case 2 -> mass.showMasses();
                    default -> System.out.println("Błąd: Nieznana opcja! Wybierz ponownie.");
                }

            } else {
                System.out.println("To nie jest cyfra! Spróbuj ponownie.");
                scanner.nextLine(); //czyszczenie blednego wejscia
            }
        }

        scanner.close();
    }
}