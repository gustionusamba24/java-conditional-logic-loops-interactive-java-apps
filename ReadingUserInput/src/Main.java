import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int currentYear = 2025;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (Exception e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("What is your name? ");
        System.out.println("Hi " + name + " Thank you for confirming your name");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int yourAge = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + yourAge + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + " Thank you for confirming your name");

        System.out.println("What year were you born? ");
        String dateOfBirth = scanner.nextLine();
        int yourAge = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + yourAge + " years old";
    }
}