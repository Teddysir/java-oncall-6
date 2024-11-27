package oncall.view;

import oncall.utils.ServiceValidation;

public class InputView {

    public static int inputMonth(String rawMonth) {
        int startMonth = ServiceValidation.checkedStartMonth(rawMonth);
        return startMonth;
    }
}
