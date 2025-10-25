package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class InputViewTest {

	@Test
	void 진행횟수가_음수면_예외가_발생한다() {
		String input = "-1";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		assertThrows(IllegalArgumentException.class, () -> InputView.tryCount());
	}
}