package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import java.util.List;
import org.junit.jupiter.api.Test;

class CarGameTest extends NsTest {

    @Test
    void 최대점수와_같은_자동차들을_출력한다() {

        CarGame carGame = new CarGame(List.of("pobi", "woni", "jun"));

        // 테스트 편의상 position 을 직접 셋팅한다.
        carGame.getCars().get(0).setPosition(5);
        carGame.getCars().get(1).setPosition(3);
        carGame.getCars().get(2).setPosition(5);

        carGame.start(0);

        assertThat(output()).contains("최종 우승자 : pobi, jun");

    }

    @Override
    protected void runMain() {

    }
}