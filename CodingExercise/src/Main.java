//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import exercises.CE15SumOddRange;
import exercises.CE17FirstLastDigitSum;
import exercises.CE18EvenDigitSum;
import exercises.CE21FactorPrinter;
import exercises.CE22GreatestCommonDivisor;
import exercises.CE23PerfectNumber;
import exercises.CE24NumberToWords;
import exercises.CE25LargestPrime;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("CE15SumOddRange Class");
        System.out.println("Method: sumOdd(int start, int end)");
        System.out.println();

        System.out.println("sumOdd(1, 100) = " + CE15SumOddRange.sumOdd(1, 100));
        System.out.println("sumOdd(-1, 100) = " + CE15SumOddRange.sumOdd(-1, 100));
        System.out.println("sumOdd(100, 100) = " + CE15SumOddRange.sumOdd(100, 100));
        System.out.println("sumOdd(13, 13) = " + CE15SumOddRange.sumOdd(13, 13));
        System.out.println("sumOdd(100, -100) = " + CE15SumOddRange.sumOdd(100, -100));
        System.out.println("sumOdd(100, 1000) = " + CE15SumOddRange.sumOdd(100, 1000));

        System.out.println();
        System.out.println("CE17FirstLastDigitSum Class");
        System.out.println("Method: sumFirstAndLastDigit(int number)");
        System.out.println();

        System.out.println("sumFirstAndLastDigit(252) = " + CE17FirstLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257) = " + CE17FirstLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0) = " + CE17FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(5) = " + CE17FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println("sumFirstAndLastDigit(-10) = " + CE17FirstLastDigitSum.sumFirstAndLastDigit(-10));
        System.out.println("sumFirstAndLastDigit(2346) = " + CE17FirstLastDigitSum.sumFirstAndLastDigit(2346));

        System.out.println();
        System.out.println("CE18EvenDigitSum Class");
        System.out.println("Method: getEvenDigitSum(int number)");
        System.out.println();

        System.out.println("getEvenDigitSum(123456789) = " + CE18EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(252) = " + CE18EvenDigitSum.getEvenDigitSum(252));
        System.out.println("getEvenDigitSum(-22) = " + CE18EvenDigitSum.getEvenDigitSum(-22));

        System.out.println();
        System.out.println("CE21FactorPrinter Class");
        System.out.println("Method: printFactors(int number)");
        System.out.println();

        System.out.println("printFactors(6):");
        CE21FactorPrinter.printFactors(6);
        System.out.println();

        System.out.println("printFactors(32):");
        CE21FactorPrinter.printFactors(32);
        System.out.println();

        System.out.println("printFactors(10):");
        CE21FactorPrinter.printFactors(10);
        System.out.println();

        System.out.println("printFactors(-1):");
        CE21FactorPrinter.printFactors(-1);

        System.out.println();
        System.out.println("CE22GreatestCommonDivisor Class");
        System.out.println("Method: getGreatestCommonDivisor(int first, int second)");
        System.out.println();

        System.out.println("getGreatestCommonDivisor(25, 15) = " + CE22GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println("getGreatestCommonDivisor(12, 30) = " + CE22GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println("getGreatestCommonDivisor(9, 18) = " + CE22GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println("getGreatestCommonDivisor(81, 153) = " + CE22GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
        System.out.println("getGreatestCommonDivisor(13, 39) = " + CE22GreatestCommonDivisor.getGreatestCommonDivisor(13, 39));
        System.out.println("getGreatestCommonDivisor(17, 40) = " + CE22GreatestCommonDivisor.getGreatestCommonDivisor(17, 40));

        System.out.println();
        System.out.println("CE23PerfectNumber Class");
        System.out.println("Method: isPerfectNumber(int number)");
        System.out.println();

        System.out.println("isPerfectNumber(6) = " + CE23PerfectNumber.isPerfectNumber(6));
        System.out.println("isPerfectNumber(28) = " + CE23PerfectNumber.isPerfectNumber(28));
        System.out.println("isPerfectNumber(5) = " + CE23PerfectNumber.isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1) = " + CE23PerfectNumber.isPerfectNumber(-1));

        System.out.println();
        System.out.println("CE24NumberToWords Class");
        System.out.println("Method: reverse(int number)");
        System.out.println();

        System.out.println("reverse(-121) = " + CE24NumberToWords.reverse(-121));
        System.out.println("reverse(1212) = " + CE24NumberToWords.reverse(1212));
        System.out.println("reverse(1234) = " + CE24NumberToWords.reverse(1234));
        System.out.println("reverse(100) = " + CE24NumberToWords.reverse(100));

        System.out.println();
        System.out.println("Method: getDigitCount(int number)");
        System.out.println();

        System.out.println("getDigitCount(0) = " + CE24NumberToWords.getDigitCount(0));
        System.out.println("getDigitCount(123) = " + CE24NumberToWords.getDigitCount(123));
        System.out.println("getDigitCount(-12) = " + CE24NumberToWords.getDigitCount(-12));
        System.out.println("getDigitCount(5200) = " + CE24NumberToWords.getDigitCount(5200));

        System.out.println();
        System.out.println("Method: numberToWords(int number)");
        System.out.println();

        System.out.println("numberToWords(123):");
        CE24NumberToWords.numberToWords(123);
        System.out.println();

        System.out.println("numberToWords(1010):");
        CE24NumberToWords.numberToWords(1010);
        System.out.println();

        System.out.println("numberToWords(1000):");
        CE24NumberToWords.numberToWords(1000);
        System.out.println();

        System.out.println("numberToWords(-12):");
        CE24NumberToWords.numberToWords(-12);

        System.out.println();
        System.out.println("CE25LargestPrime Class");
        System.out.println("Method: getLargestPrime(int number)");
        System.out.println();

        System.out.println("getLargestPrime(21) = " + CE25LargestPrime.getLargestPrime(21));
        System.out.println("getLargestPrime(217) = " + CE25LargestPrime.getLargestPrime(217));
        System.out.println("getLargestPrime(0) = " + CE25LargestPrime.getLargestPrime(0));
        System.out.println("getLargestPrime(45) = " + CE25LargestPrime.getLargestPrime(45));
        System.out.println("getLargestPrime(-1) = " + CE25LargestPrime.getLargestPrime(-1));
        System.out.println("getLargestPrime(17) = " + CE25LargestPrime.getLargestPrime(17));
        System.out.println("getLargestPrime(19) = " + CE25LargestPrime.getLargestPrime(19));
    }
}