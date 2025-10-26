package racingcar;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

class InputViewTest extends NsTest {

    @Test
    void 진행횟수가_음수면_예외가_발생한다() {
        assertSimpleTest(() -> assertThatThrownBy(() -> run("-1")).isInstanceOf(IllegalArgumentException.class));
    }

    @Test
    void 진행횟수가_숫자가_아니면_예외가_발생한다() {
        assertSimpleTest(() -> assertThatThrownBy(() -> run("aa")).isInstanceOf(IllegalArgumentException.class));
    }

    @Override
    protected void runMain() {
        InputView.tryCount();
    }
}