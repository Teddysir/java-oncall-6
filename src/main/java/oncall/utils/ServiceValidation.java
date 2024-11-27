package oncall.utils;

import oncall.constants.ErrorMessageType;

import java.util.*;
import java.util.stream.Collectors;

public class ServiceValidation {

    public static void checkedDuplicateNickname(String rawInput, List<String> staffs) {
        Set<String> unDuplicatedStaffs = Arrays.stream(rawInput.split(","))
                .collect(Collectors.toSet());
        if(unDuplicatedStaffs.size() != staffs.size()) {
            throw new IllegalArgumentException(ErrorMessageType.DUPLICATE_NICKNAME_ERROR.getMessage());
        }
    }

    public static void checkedNicknameLength(List<String> staffs) {
        for(String staff : staffs) {
            if(staff.length() > 5) {
                throw new IllegalArgumentException(ErrorMessageType.INVALID_NICKNAME_LENGTH_ERROR.getMessage());
            }
        }
    }

    public static void checkedMinimumStaffs(List<String> staffs) {
        if(staffs.size() < 5) {
            throw new IllegalArgumentException(ErrorMessageType.MINIMUM_STAFFS_ERROR.getMessage());
        }
    }

    public static void checkedMaximumStaffs(List<String> staffs) {
        if(staffs.size() > 35) {
            throw new IllegalArgumentException(ErrorMessageType.MAXIMUM_STAFFS_ERROR.getMessage());
        }
    }

    public static void checkedRawInput(String rawInput) {
        if(rawInput.contains(",,")) {
            throw new IllegalArgumentException(ErrorMessageType.INVALID_INPUT_ERROR.getMessage());
        }
    }

    public static int checkedStartMonth(String rawMonth) {
        try {
            int startMonth = Integer.parseInt(rawMonth);
            if(startMonth < 1 || startMonth > 12) {
                throw new IllegalArgumentException(ErrorMessageType.INVALID_START_MONTH_FORMAT.getMessage());
            }
            return startMonth;
        } catch (IllegalFormatException e) {
            throw new IllegalArgumentException(ErrorMessageType.INVALID_START_MONTH_FORMAT.getMessage());
        }
    }

    public static void checkedStartDay(String rawDay) {
        List<String> day7 = new ArrayList<>();
        int count = 0;
        day7.add("월");
        day7.add("화");
        day7.add("수");
        day7.add("목");
        day7.add("금");
        day7.add("토");
        day7.add("일");

        for(String day : day7) {
            if(day.equals(rawDay)) {
                count++;
            }
        }

        if (count == 0 ) {
            throw new IllegalArgumentException(ErrorMessageType.INVALID_START_DAY_FORMAT.getMessage());
        }
    }

}
