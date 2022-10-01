package Project1;

public abstract class Coin implements ICaculate {
    public abstract double getValue();

    @Override
    public double calculate() {
        return 0;
    }
}
