package oncall.model;

import oncall.utils.ServiceValidation;
import oncall.utils.Splitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Staff {

    private final List<String> weekdayStaffs = new ArrayList<>();
    private final List<String> holidayStaffs = new ArrayList<>();


    public void addedWeekdayStaffs(String rawWeekdayStaffs) {
        ServiceValidation.checkedRawInput(rawWeekdayStaffs);

        List<String> inputWeekdayStaffs = Splitter.getSplitStaffsComma(rawWeekdayStaffs.trim()); // ex) [성훈, 수아, 동균, 효성]

        ServiceValidation.checkedDuplicateNickname(rawWeekdayStaffs, inputWeekdayStaffs);
        ServiceValidation.checkedNicknameLength(inputWeekdayStaffs);
        ServiceValidation.checkedMinimumStaffs(inputWeekdayStaffs);
        ServiceValidation.checkedMaximumStaffs(inputWeekdayStaffs);

        weekdayStaffs.addAll(inputWeekdayStaffs);
    }

    public void addedHolidayStaffs(String rawHolidayStaffs) {
        ServiceValidation.checkedRawInput(rawHolidayStaffs);

        List<String> inputHolidayStaffs = Splitter.getSplitStaffsComma(rawHolidayStaffs.trim()); // ex) [성훈, 수아, 동균, 효성]

        ServiceValidation.checkedDuplicateNickname(rawHolidayStaffs, inputHolidayStaffs);
        ServiceValidation.checkedNicknameLength(inputHolidayStaffs);
        ServiceValidation.checkedMinimumStaffs(inputHolidayStaffs);
        ServiceValidation.checkedMaximumStaffs(inputHolidayStaffs);

        holidayStaffs.addAll(inputHolidayStaffs);
    }

    public List<String> getWeekdayStaffs() {
        return Collections.unmodifiableList(new ArrayList<>(weekdayStaffs));
    }

    public List<String> getHolidayStaffs() {
        return Collections.unmodifiableList(new ArrayList<>(holidayStaffs));
    }


}
