package JM2;

import java.util.Arrays;

public class RomNumCalc {

    public static void Calculator(String str) {
        String[] arr = str.split(" ");
        String num1 = arr[0];
        String operation = arr[1];
        String num2 = arr[2];
        if (operation.equals("+")) {
            int result = (Arrays.asList(RomNumLT.LT).indexOf(num1))
                    + (Arrays.asList(RomNumLT.LT).indexOf(num2));
            System.out.println("\nOutput:\n" + RomNumLT.LT[result]);
        }
        if (operation.equals("-")) {
            int result = (Arrays.asList(RomNumLT.LT).indexOf(num1))
                    - (Arrays.asList(RomNumLT.LT).indexOf(num2));
            System.out.println("\nOutput:\n" + RomNumLT.LT[result]);
        }
        if (operation.equals("*")) {
            int result = (Arrays.asList(RomNumLT.LT).indexOf(num1))
                    * (Arrays.asList(RomNumLT.LT).indexOf(num2));
            System.out.println("\nOutput:\n" + RomNumLT.LT[result]);
        }
        if (operation.equals("/")) {
            int result = (Arrays.asList(RomNumLT.LT).indexOf(num1))
                    / (Arrays.asList(RomNumLT.LT).indexOf(num2));
            System.out.println("\nOutput:\n" + RomNumLT.LT[result]);
        }
    }
}