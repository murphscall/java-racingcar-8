package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void 랜덤_숫자가_4이상이면_전진한다() {
        Car car = new Car("testCar");
        MoveStrategy alwaysMoveStrategy = () -> true;

        car.move(alwaysMoveStrategy);

        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 랜덤_숫자가_4미만이면_위치가_변하지않는다() {
        Car car = new Car("testCar");
        MoveStrategy alwaysMoveStop = () -> false;

        car.move(alwaysMoveStop);

        assertThat(car.getPosition()).isEqualTo(0);
    }

}