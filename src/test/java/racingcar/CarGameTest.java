package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CarGameTest {

	@Test
	void 최대점수와_같은_자동차들을_출력한다() {

		CarGame carGame = new CarGame(List.of("pobi", "jiho", "jauk"));
		List<Car> cars = carGame.getCars();

		// 테스트 편의상 position 을 직접 셋팅한다.
		cars.get(0).setPosition(2);
		cars.get(1).setPosition(4);
		cars.get(2).setPosition(4);

		List<String> winners = carGame.findWinners();

		assertThat(winners).containsExactlyInAnyOrder("jiho", "jauk");

	}

}