package oncall;

import oncall.contoroller.StaffController;

public class Application {
    public static void main(String[] args) {

        final StaffController staffController = new StaffController();
        staffController.start();
    }
}
