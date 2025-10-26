package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class CarGame {
    private final List<Car> cars;
    private final int tryCount;

    public CarGame(List<String> cars, int tryCount) {
        this.cars = createCars(cars);
        this.tryCount = tryCount;
    }

    private List<Car> createCars(List<String> carNames) {
        return carNames.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void start() {
        System.out.println();
        System.out.println("실행 결과");
        for (int round = 0; round < tryCount; round++) {
            playRound();
            OutputView.printRoundResult(cars);
        }
        announceWinners();
    }

    private void playRound() {
        MoveStrategy moveStrategy = new RandomMoveStrategy();
        for (Car car : cars) {
            car.move(moveStrategy);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    private void announceWinners() {
        List<String> winners = findWinners();
        OutputView.printWinners(winners);
    }

    private List<String> findWinners() {
        int maxPosition = findMaxPosition();

        return cars.stream()
                .filter(car -> car.isAtPosition(maxPosition))
                .map(Car::getName)
                .toList();
    }

    private int findMaxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }
}
