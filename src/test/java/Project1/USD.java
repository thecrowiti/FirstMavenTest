package Project1;

public class USD extends Coin {
    private final double Value = 3.52;
    @Override
    public double getValue() {
        return Value;
    }
    public double calculate(double amount) {
        return getValue()*amount;
    }
}
