import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter number or any characters to exit: ");
            String nextInput = scanner.nextLine();
            try {
                double validNumber = Double.parseDouble(nextInput);
                if (loopCount == 0 || validNumber < min) {
                    min = validNumber;
                }
                if (loopCount == 0 || validNumber > max) {
                    max = validNumber;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("Min number: " + min + "\n" + "Max number: " + max);
        } else {
            System.out.println("No valid data entered");
        }
    }
}