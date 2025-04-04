package unitConverter;

import java.util.Scanner;

public class Mass {
    private boolean shouldContinue = true;
    private int userChoice;
    private double kilogram;
    private double gram;
    private double funt;
    private double ounce;
    private double milligram;
    private double tonne;

    private Scanner scanner = new Scanner(System.in);
    private Menu menu = new Menu();

    void showMasses() {

        while (shouldContinue) {
            menu.massMenu();
            if (scanner.hasNextInt()) {

                userChoice = scanner.nextInt();
                scanner.nextLine();
                switch (userChoice) {
                    case 0 -> {
                        System.out.println("Wyjscie do menu glownego...");
                        shouldContinue = false;
                    }
                    case 1 -> {
                        System.out.println("Kilogramy -> Gramy");
                        System.out.print("Podaj kilogramy: ");
                        kilogram = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(kilogram + "kg = " + kilogramToGram(kilogram) + "g");
                    }
                    case 2 -> {
                        System.out.println("Gramy -> Kilogramy");
                        System.out.print("Podaj gramy: ");
                        gram = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(gram + "g = " + gramToKilogram(gram) + "kg");
                    }
                    case 3 -> {
                        System.out.println("Kilogramy -> Funty");
                        System.out.print("Podaj kilogramy: ");
                        kilogram = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(kilogram + "kg = " + kilogramToFunt(kilogram) + "lb");
                    }
                    case 4 -> {
                        System.out.println("Funty -> Kilogramy");
                        System.out.print("Podaj funty: ");
                        funt = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(funt + "lb = " + funtToKilogram(funt) + "kg");
                    }
                    case 5 -> {
                        System.out.println("Kilogramy -> Uncje");
                        System.out.print("Podaj kilogramy: ");
                        kilogram = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(kilogram + "kg = " + kilogramToOunce(kilogram) + "oz");
                    }
                    case 6 -> {
                        System.out.println("Uncje -> Kilogramy");
                        System.out.print("Podaj uncje: ");
                        ounce = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(ounce + "oz = " + ounceToKilogram(ounce) + "kg");
                    }
                    case 7 -> {
                        System.out.println("Gramy -> Miligramy");
                        System.out.print("Podaj gramy: ");
                        gram = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(gram + "g = " + gramToMilligram(gram) + "mg");
                    }
                    case 8 -> {
                        System.out.println("Miligramy -> Gramy");
                        System.out.print("Podaj miligramy: ");
                        milligram = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(milligram + "mg = " + milligramToGram(milligram) + "g");
                    }
                    case 9 -> {
                        System.out.println("Tony -> Kilogramy");
                        System.out.print("Podaj tony: ");
                        tonne = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(tonne + "t = " + tonneToKilogram(tonne) + "kg");
                    }
                    case 10 -> {
                        System.out.println("Kilogramy -> Tony");
                        System.out.print("Podaj kilogramy: ");
                        kilogram = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(kilogram + "kg = " + kilogramToTonne(kilogram) + "t");
                    }
                    case 11 -> {
                        System.out.println("Funty -> Uncje");
                        System.out.print("Podaj funty: ");
                        funt = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(funt + "lb = " + funtToOunce(funt) + "oz");
                    }
                    case 12 -> {
                        System.out.println("Uncje -> Funty");
                        System.out.print("Podaj uncje: ");
                        ounce = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(ounce + "oz = " + ounceToFunt(ounce) + "lb");
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

    private double kilogramToGram(double kilogram) {
        return kilogram * 1000;
    }
    private double gramToKilogram(double gram) {
        return gram * 0.001;
    }
    private double kilogramToFunt(double kilogram) {
        return kilogram * 2.20462;
    }
    private double funtToKilogram(double funt) {
        return funt * 0.453592;
    }
    private double kilogramToOunce(double kilogram) {
        return kilogram * 35.274;
    }
    private double ounceToKilogram(double ounce) {
        return ounce * 0.0283495;
    }
    private double gramToMilligram(double gram) {
        return gram * 1000;
    }
    private double milligramToGram(double milligram) {
        return milligram * 0.001;
    }
    private double tonneToKilogram(double tonne) {
        return tonne * 1000;
    }
    private double kilogramToTonne(double kilogram) {
        return kilogram * 0.001;
    }
    private double funtToOunce(double funt) {
        return funt * 16;
    }
    private double ounceToFunt(double ounce) {
        return ounce * 0.0625;
    }
}
