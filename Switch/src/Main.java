//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 3;
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Was a 3, or a 4, or a 5");
//                System.out.println("Actual value was " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1, 2, 3, 4, or 5");
//        }

        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actual value was " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "AUGUSTS";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
         return switch (month) {
             case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st"; }
             case "APRIL", "MAY", "JUNE" -> "2nd";
             case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
             case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
             default -> {
                 yield month + " is not a valid month!";
             }
         };
    }
}