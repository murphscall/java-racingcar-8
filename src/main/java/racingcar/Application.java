package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.inputCarNames();
        int tryCount = InputView.tryCount();

        CarGame carGame = new CarGame(carNames, tryCount);
        carGame.start();
    }
}