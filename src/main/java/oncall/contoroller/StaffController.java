package oncall.contoroller;

import camp.nextstep.edu.missionutils.Console;
import oncall.utils.ServiceValidation;
import oncall.utils.Splitter;
import oncall.view.InputView;

public class StaffController {

    public void start() {
        inputStartMonthAndDay();
    }

    private void inputStartMonthAndDay() {
        String rawMonthAndDay = InputView.inputMessageMonthAndDay();
        String[] splitRawMonthAndDay = Splitter.splitCommaDelimiter(rawMonthAndDay);

        int startMonth = ServiceValidation.checkedStartMonth(splitRawMonthAndDay[0].trim()); // ex) 12
        ServiceValidation.checkedStartDay(splitRawMonthAndDay[1].trim());
        String startDay = splitRawMonthAndDay[1].trim(); // ex) 월

    }

}
