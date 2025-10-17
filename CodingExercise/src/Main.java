//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import exercises.CE15SumOddRange;
import exercises.CE17FirstLastDigitSum;
import exercises.CE18EvenDigitSum;
import exercises.CE21FactorPrinter;

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
    }
}