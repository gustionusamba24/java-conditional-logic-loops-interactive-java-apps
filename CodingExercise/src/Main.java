//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import exercises.CE15SumOddRange;

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
    }
}