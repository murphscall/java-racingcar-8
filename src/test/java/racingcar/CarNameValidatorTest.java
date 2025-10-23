package racingcar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarNameValidatorTest {

    @Test
    @DisplayName("정상적인 입력 - 쉼표로 구분된 이름들")
    void validateNormalInput() {
        String input = "pobi,jinho,honox";
        List<String> result = CarNameValidator.validate(input);
        assertEquals(3, result.size());
    }

    @Test
    @DisplayName("5글자를 넘게되면 예외가 발생한다.")
    void validateNameLength() {
        String input = "pobipobi";

        assertThrows(IllegalArgumentException.class, () -> CarNameValidator.validate(input));
    }

    @Test
    @DisplayName("중복된 자동차 이름은 예외가 발생한다.")
    void validateDuplicateCarName() {
        String input = "pobi,pobi,jinho";

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> CarNameValidator.validate(input));

        assertEquals("자동차 이름은 중복될 수 없습니다.", ex.getMessage());
    }

    @Test
    @DisplayName("자동차 이름이 빈 문자열이면 예외가 발생한다.")
    void validateNameNotEmpty() {
        String input = "pobi,,jinho";
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> CarNameValidator.validate(input));

        assertEquals("자동차 이름을 다시 확인해주세요.", ex.getMessage());
    }
}