package oncall.contoroller;

import camp.nextstep.edu.missionutils.Console;
import oncall.utils.ServiceValidation;
import oncall.utils.Splitter;

public class StaffController {

    public void start() {
        inputStartMonthAndDay();
    }

    private void inputStartMonthAndDay() {
        String rawMonthAndDay = Console.readLine();
        String[] splitRawMonthAndDay = Splitter.splitCommaDelimiter(rawMonthAndDay);

        int startMonth = ServiceValidation.checkedStartMonth(splitRawMonthAndDay[0].trim()); // ex) 12
        ServiceValidation.checkedStartDay(splitRawMonthAndDay[1].trim());
        String startDay = splitRawMonthAndDay[1].trim(); // ex) 월

        System.out.println(startMonth);
        System.out.println(startDay);
    }

}
