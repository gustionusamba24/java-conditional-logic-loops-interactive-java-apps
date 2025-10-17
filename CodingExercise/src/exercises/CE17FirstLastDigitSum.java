package exercises;

public class CE17FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        // 2346
        int lastDigit = number % 10; // 6
        while (number >= 10) {
            number /= 10; // 234
        }

        int firstDigit = number;
        return firstDigit + lastDigit;

    }
}
