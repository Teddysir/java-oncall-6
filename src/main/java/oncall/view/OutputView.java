package oncall.view;

public class OutputView {

    public static void calendar30Message(int month, int numDay, String day, String staffName) {
        if (month == 6 && numDay == 6) {
            System.out.printf("%d월 %d일 %s(휴일) %s\n", month, numDay, day, staffName);
            return;
        }

        if (month == 8 && numDay == 15) {
            System.out.printf("%d월 %d일 %s(휴일) %s\n", month, numDay, day, staffName);
            return;

        }
        System.out.printf("%d월 %d일 %s %s\n", month, numDay, day, staffName);
    }

    public static void calendar31Message(int month, int numDay, String day, String staffName) {

        if (month == 1 && numDay == 1) {
            System.out.printf("%d월 %d일 %s(휴일) %s\n", month, numDay, day, staffName);
            return;
        }

        if (month == 3 && numDay == 1) {
            System.out.printf("%d월 %d일 %s(휴일) %s\n", month, numDay, day, staffName);
            return;
        }

        if (month == 5 && numDay == 5) {
            System.out.printf("%d월 %d일 %s(휴일) %s\n", month, numDay, day, staffName);
            return;
        }

        if (month == 10 && numDay == 3) {
            System.out.printf("%d월 %d일 %s(휴일) %s\n", month, numDay, day, staffName);
            return;
        }

        if (month == 10 && numDay == 9) {
            System.out.printf("%d월 %d일 %s(휴일) %s\n", month, numDay, day, staffName);
            return;
        }

        if (month == 12 && numDay == 15) {
            System.out.printf("%d월 %d일 %s(휴일) %s\n", month, numDay, day, staffName);
            return;
        }

        System.out.printf("%d월 %d일 %s %s\n", month, numDay, day, staffName);
    }

    public static void calendar28Message(int month, int numDay, String day, String staffName) {
        System.out.printf("%d월 %d일 %s %s\n", month, numDay, day, staffName);
    }

}
