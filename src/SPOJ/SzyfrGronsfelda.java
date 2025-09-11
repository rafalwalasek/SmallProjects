package SPOJ;

import java.util.Scanner;

public class SzyfrGronsfelda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int k = sc.nextInt();
        String text = sc.nextLine();

        String upText = text.toUpperCase().replaceAll("\\s", "");
        System.out.println(upText);

        char[] chars = upText.toCharArray();

        if ("SZYFRUJ".equals(word)) {
            for (int i = 0; i < upText.length(); i++) {
                chars[i] = (char) ('A' + ((chars[i] - 'A' + k) % 26));
                System.out.print(chars[i]);
            }
        } else if ("DESZYFRUJ".equals(word)) {
            for (int i = 0; i < upText.length(); i++) {
                chars[i] = (char) ('A' + ((chars[i] + 'A' - k) % 26));
                System.out.print(chars[i]);
            }
        } else {
            System.out.println("Niepoprawne dane...");
        }

    }
}
