package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

	private static final int MOVE_THRESHOLD = 4;
	private static final int MIN_NUMBER = 0;
	private static final int MAX_NUMBER = 9;

	private final String name;
	private int position;

	public Car(String name) {
		this.name = name;
		this.position = 0;
	}

	public void move() {
		int randomNumber = generatorRandomNumber();
		if (randomNumber >= MOVE_THRESHOLD) {
			position++;
		}
	}

	protected int generatorRandomNumber() {
		return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
	}

	public boolean isAtPosition(int targetPosition) {
		return this.position == targetPosition;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Car{" +
			"name='" + name + '\'' +
			", position=" + position +
			'}';
	}
}
