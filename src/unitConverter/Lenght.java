package unitConverter;

import java.util.Scanner;

public class Lenght {
    private boolean shouldContinue = true;
    private int userChoice;
    private double millimeter;
    private double meter;
    private double centimeter;
    private double decimeter;
    private double kilomiter;
    private double mile;
    private double inch;
    private double foot;
    private double yard;
    private double nauticalMile;

    private Scanner scanner = new Scanner(System.in);
    private Menu menu = new Menu();

    void showLenghts() {

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
                    case 1 -> {
                        System.out.println("Milimetry -> Metry");
                        System.out.print("Podaj milimetry: ");
                        millimeter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(millimeter + "mm = " + millimetersToMeters(millimeter) + "m");
                    }
                    case 2 -> {
                        System.out.println("Metry -> Milimetry");
                        System.out.print("Podaj metry: ");
                        meter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(meter + "m = " + metersToMillimetres(meter) + "mm");
                    }
                    case 3 -> {
                        System.out.println("Centymetry -> Metry");
                        System.out.print("Podaj centymetry: ");
                        centimeter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(centimeter + "cm = " + centimetersToMeters(centimeter) + "m");
                    }
                    case 4 -> {
                        System.out.println("Metry -> Centymetry");
                        System.out.print("Podaj metry: ");
                        meter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(meter + "m = " + metersToCentimeters(meter) + "cm");
                    }
                    case 5 -> {
                        System.out.println("Decymetry -> Metry");
                        System.out.print("Podaj decymetry: ");
                        decimeter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(decimeter + "dm = " + decimetersToMeters(decimeter) + "m");
                    }
                    case 6 -> {
                        System.out.println("Metry -> Decymetry");
                        System.out.print("Podaj metry: ");
                        meter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(meter + "m = " + metersToDecimeters(meter) + "dm");
                    }
                    case 7 -> {
                        System.out.println("Metry -> Kilometry");
                        System.out.print("Podaj metry: ");
                        meter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(meter + "m = " + metersToKilometers(meter) + "km");
                    }
                    case 8 -> {
                        System.out.println("Kilometry -> Metry");
                        System.out.print("Podaj kilometry: ");
                        kilomiter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(kilomiter + "km = " + kilometersToMeters(kilomiter) + "m");
                    }
                    case 9 -> {
                        System.out.println("Kilometry -> Mile");
                        System.out.print("Podaj kilometry: ");
                        kilomiter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(kilomiter + "km = " + kilometersToMiles(kilomiter) + "mi");
                    }
                    case 10 -> {
                        System.out.println("Mile -> Kilometry");
                        System.out.print("Podaj mile: ");
                        mile = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(mile + "mi = " + milesToKilometers(mile) + "km");
                    }
                    case 11 -> {
                        System.out.println("Cale -> Centymetry");
                        System.out.print("Podaj cale: ");
                        inch = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(inch + "in = " + inchesToCentimeters(inch) + "cm");
                    }
                    case 12 -> {
                        System.out.println("Centymetry -> Cale");
                        System.out.print("Podaj centymetry: ");
                        centimeter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(centimeter + "cm = " + centimetersToInches(centimeter) + "in");
                    }
                    case 13 -> {
                        System.out.println("Stopy -> Centymetry");
                        System.out.print("Podaj stopy: ");
                        foot = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(foot + "ft = " + footsToCentimeters(foot) + "cm");
                    }
                    case 14 -> {
                        System.out.println("Centymetry -> Stopy");
                        System.out.print("Podaj centymetry: ");
                        centimeter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(centimeter + "cm = " + centimetersToFoots(centimeter) + "ft");
                    }
                    case 15 -> {
                        System.out.println("Yardy -> Metry");
                        System.out.print("Podaj yardy: ");
                        yard = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(yard + "yd = " + yardsToMeters(yard) + "m");
                    }
                    case 16 -> {
                        System.out.println("Metry -> Yardy");
                        System.out.print("Podaj metry: ");
                        meter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(meter + "m = " + metersToYards(meter) + "yd");
                    }
                    case 17 -> {
                        System.out.println("Mile morskie -> Metry");
                        System.out.print("Podaj mile morskie: ");
                        nauticalMile = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(nauticalMile + "nmi = " + nauticalMilesToMeters(nauticalMile) + "m");
                    }
                    case 18 -> {
                        System.out.println("Metry -> Mile morskie");
                        System.out.print("Podaj metry: ");
                        meter = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(meter + "m = " + metersToNauticalMiles(meter) + "nmi");
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

    private double millimetersToMeters(double millimetre) {
        return millimetre * 0.001;
    }
    private double metersToMillimetres(double meter) {
        return meter * 1000;
    }
    private double centimetersToMeters(double centimeter) {
        return centimeter * 0.01;
    }
    private double metersToCentimeters(double meter) {
        return meter * 100;
    }
    private double decimetersToMeters(double decimeter) {
        return decimeter * 0.1;
    }
    private double metersToDecimeters(double meter) {
        return meter * 10;
    }
    private double metersToKilometers(double meter) {
        return meter * 0.001;
    }
    private double kilometersToMeters(double kilometer) {
        return kilometer * 1000;
    }
    private double kilometersToMiles(double kilometer) {
        return kilometer * 0.6214;
    }
    private double milesToKilometers(double mile) {
        return mile * 1.609;
    }
    private double inchesToCentimeters(double inch) {
        return inch * 2.54;
    }
    private double centimetersToInches(double centimeter) {
        return centimeter * 0.3937;
    }
    private double footsToCentimeters(double foot) {
        return foot * 30.48;
    }
    private double centimetersToFoots(double centimeter) {
        return centimeter * 0.0328;
    }
    private double yardsToMeters(double yard) {
        return yard * 0.9144;
    }
    private double metersToYards(double meter) {
        return meter * 1.094;
    }
    private double nauticalMilesToMeters(double nauticalMile) {
        return nauticalMile * 1852;
    }
    private double metersToNauticalMiles(double meter) {
        return meter * 0.00054;
    }
}