package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final int MOVE_THRESHOLD = 4;

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move() {
        int randomNumber = generatorRandomNumber();
        if (randomNumber > 4){
            position++;
        }
    }

    private int generatorRandomNumber(){
        return Randoms.pickNumberInRange(0,9);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
