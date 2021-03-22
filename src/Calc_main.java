package JM2;

import java.util.Scanner;

public class Calc_main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input:");
            String sc = scanner.nextLine();
            if (sc.matches(".*\\d+.*")) {
                ArabNumCalc.Calculator(sc);;
            } else {
                RomNumCalc.Calculator(sc);
            }
            scanner.close();
        } catch (Exception ex) {
            System.out.println("\nError:");
            ex.printStackTrace();
        }
    }
}