package racingcar;

public class Car {

    private static final int MOVE_THRESHOLD = 4;

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move() {
        int randomNumber = (int) (Math.random() * 10);
        if (randomNumber > 4){
            position += randomNumber;
        }

    }
}
