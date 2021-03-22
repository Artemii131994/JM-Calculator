package JM2;

public class ArabNumCalc {

    public static void Calculator(String str) {
        String[] arr = str.split(" ");
        int num1 = Integer.parseInt(arr[0]);
        String operation = arr[1];
        int num2 = Integer.parseInt(arr[2]);
        if (operation.equals("+")) {
            int result = num1 + num2;
            System.out.println("\nOutput:\n" + result);
        }
        if (operation.equals("-")) {
            int result = num1 - num2;
            System.out.println("\nOutput:\n" + result);
        }
        if (operation.equals("*")) {
            int result = num1 * num2;
            System.out.println("\nOutput:\n" + result);
        }
        if (operation.equals("/")) {
            int result = num1 / num2;
            System.out.println("\nOutput:\n" + result);
        }
    }
}