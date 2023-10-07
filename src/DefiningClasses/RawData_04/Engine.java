package DefiningClasses.RawData_04;

public class Engine {
    private final int speed;
    private final int power;

    public Engine(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
