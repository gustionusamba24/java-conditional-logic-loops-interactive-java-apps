//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int i = 4;
        int countOfEvenNumberFound = 0;
        int countOfOddNumberFound = 0;

        while (i <= 20) {
            i++;

            if (!isEvenNumber(i)) {
                countOfOddNumberFound++;
                continue;
            }
            System.out.println("Even number: " + i);
            countOfEvenNumberFound++;
            if (countOfEvenNumberFound >= 5) {
                break;
            }
        }

        System.out.println("Total of even number: " + countOfEvenNumberFound);
        System.out.println("Total of odd number: " + countOfOddNumberFound);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}