package Project1;

public class ILS extends Coin {
    final double Value = 0.28;
    public double getValue() {
        return Value;
    }
    public double calculate(double amount) {
        return getValue()*amount;
    }
}
