//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;
        boolean isReady = false;
        do {
            if (j > 7) {
                break;
            }

            System.out.println(j);
            j++;
            isReady = j > 0;
        } while (isReady);
    }
}