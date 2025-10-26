package racingcar;

import java.util.List;

public class OutputView {
    private static final String POSITION_SYMBOL = "-";

    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            printCarStatus(car);
        }
        System.out.println();
    }

    private static void printCarStatus(Car car) {
        String position = POSITION_SYMBOL.repeat(car.getPosition());
        System.out.println(car.getName() + " : " + position);
    }

    public static void printWinners(List<String> winners) {
        String winnersText = String.join(", ", winners);
        System.out.println("최종 우승자 : " + winnersText);
    }
}
