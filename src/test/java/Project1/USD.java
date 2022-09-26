package Project1;

public class USD extends Coin {
    final double Value = 3.52;
    @Override
    public double getValue() {
        return Value;
    }
    @Override
    public double caculate() {
        return getValue();
    }
}
