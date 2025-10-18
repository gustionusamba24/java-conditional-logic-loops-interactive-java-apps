package exercises;

public class CE25LargestPrime {

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int largestPrime = -1;

        // Divide by 2 as many times as possible
        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        // Check odd factors starting from 3
        for (int i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        // If number is still greater than 2, then it's a prime number itself
        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }
}
