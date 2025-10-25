package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void 랜덤_숫자가_4이상이면_전진한다() {
		Car car = new Car("testCar") {
			@Override
			protected int generatorRandomNumber() {
				return 4;
			}
		};

		car.move();

		assertThat(car.getPosition()).isEqualTo(1);
	}

	@Test
	void 랜덤_숫자가_4미만일_때_정지한다() {
		// given
		Car car = new Car("testCar") {
			@Override
			protected int generatorRandomNumber() {
				return 2;
			}
		};

		// when
		car.move();

		// then
		assertThat(car.getPosition()).isEqualTo(0);
	}

}