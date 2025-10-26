package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMoveStrategy implements MoveStrategy {
    private static final int MOVE_THRESHOLD = 4;
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;

    @Override
    public boolean isMovable() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER) >= MOVE_THRESHOLD;
    }
}
