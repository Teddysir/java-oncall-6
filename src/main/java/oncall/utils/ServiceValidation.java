package oncall.utils;

import oncall.constants.ErrorMessageType;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ServiceValidation {

    public static void checkedDuplicateNickname(String rawInput, List<String> staffs) {
        Set<String> unDuplicatedStaffs = Arrays.stream(rawInput.split(","))
                .collect(Collectors.toSet());
        if(unDuplicatedStaffs.size() != staffs.size()) {
            throw new IllegalArgumentException(ErrorMessageType.DUPLICATE_NICKNAME_ERROR.getMessage());
        }
    }

}
