//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        for (double i = 1.0; i <= 20.0; i++) {
            if (i % 2 == 0) {
                System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i)));
            }
        }

        for (double i = 7.5; i <= 10; i += 0.25) {
            if (i > 9.0) {
                break;
            }
            System.out.println("100 at " + i + "% interest = " + String.format("%.2f", calculateInterest(100.00, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}