package exercises;

public class CE20LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third) {

        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }

        int firstRightDigit = first % 10;
        int secondRightDigit = second % 10;
        int thirdRightDigit = third % 10;

        boolean firstSecond = firstRightDigit == secondRightDigit;
        boolean firstThird = firstRightDigit == thirdRightDigit;
        boolean secondThird = secondRightDigit == thirdRightDigit;

        return firstSecond || firstThird || secondThird;
    }

    public static boolean isValid(int number) {

        return (number >= 10) && (number <= 1000);
    }
}
