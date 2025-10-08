//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int primeNumberCount = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeNumberCount++;

                if (primeNumberCount == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        // A number is prime if it has no divisors other than 1 and itself.
        // We only need to test divisors up to sqrt(n) because if n = a*b and a <= b,
        // then a <= sqrt(n). Math.sqrt is used here to compute that upper bound,
        // which significantly reduces the number of checks for large n.
        if (wholeNumber <= 1) return false;     // 0, 1, and negatives are not prime
        if (wholeNumber == 2) return true;      // 2 is the only even prime
        if (wholeNumber % 2 == 0) return false; // even numbers > 2 are not prime

        int max = (int) Math.sqrt(wholeNumber);
        for (int i = 3; i <= max; i += 2) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}