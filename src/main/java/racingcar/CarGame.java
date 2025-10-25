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
			OutputView.printRoundResult(cars);
		}
		announceWinners();
	}

	private void playRound() {
		for (Car car : cars) {
			car.move();
		}
	}

	public List<Car> getCars() {
		return cars;
	}

	private void announceWinners() {
		List<String> winners = findWinners();
		OutputView.printWinners(winners);
	}

	public List<String> findWinners() {
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
