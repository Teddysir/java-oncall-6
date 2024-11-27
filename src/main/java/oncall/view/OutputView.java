package oncall.view;

public class OutputView {

    public static void calendar30Message(int month, int numDay, String day, String staffName) {
        System.out.printf("%d월 %d일 %s %s\n", month, numDay, day, staffName);
    }

    public static void calendar31Message(int month, int numDay, String day, String staffName) {
        System.out.printf("%d월 %d일 %s %s\n", month, numDay, day, staffName);
    }

    public static void calendar28Message(int month, int numDay, String day, String staffName) {
        System.out.printf("%d월 %d일 %s %s\n", month, numDay, day, staffName);
    }

}
