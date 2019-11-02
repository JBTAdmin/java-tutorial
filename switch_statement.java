
public class switch_statement {

    public static void main(String[] args) {
        boolean isWeekend = false;
        int weekday = 5;
        switch (weekday) {
            /*
             * Two cases can be combined in different ways.
             * either by writing case 1,7
             * or
             * case 1:
             * case 2:
             * Both are valid. Though i prefer first option. :)
             */
            case 1, 7:
                isWeekend = true;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                isWeekend = false;
        }
        System.out.println("Is it Weekend ? " + isWeekend);
    }
}