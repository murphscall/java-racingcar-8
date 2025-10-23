package racingcar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarNameValidator {

    private static final int MAX_NAME_LENGTH = 5;
    private static final String DELIMITER = ",";

    public static List<String> validate(String input) {
        validateNotEmpty(input);

        String[] names = input.split(DELIMITER);
        List<String> trimNames = trimNames(names);

        for (String name : trimNames) {
            validateNameNotEmpty(name);
            validateNameLength(name);
        }

        validateDuplicates(trimNames);
        return trimNames;
    }

    private static void validateNotEmpty(String input) {
        if (input == null | input.trim().isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }
    }

    private static List<String> trimNames(String[] names) {
        return Arrays.stream(names)
                .map(String::trim)
                .toList();
    }

    private static void validateNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 " + MAX_NAME_LENGTH + "자 이하여야 합니다.");
        }
    }

    private static void validateNameNotEmpty(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 다시 확인해주세요.");
        }
    }

    private static void validateDuplicates(List<String> names) {
        Set<String> uniqueNames = new HashSet<>(names);
        if (uniqueNames.size() != names.size()) {
            throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
        }
    }


}
