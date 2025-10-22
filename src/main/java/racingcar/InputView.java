package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public static int tryCount() {
        System.out.println("게임을 얼마나 몇 번 진행할까요?");
        String input = Console.readLine();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자를 입력해주세요");
        }
    }
}
