package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class CarGame {
    private final List<Car> cars;

    public CarGame(List<String> cars) {
        this.cars = createCars(cars);
    }

    private List<Car> createCars(List<String> carNames) {
        return carNames.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }


    public void start(int tryCount) {
        for (int round = 0; round < tryCount; round++) {
            playRound();
        }
    }

    private void playRound() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
