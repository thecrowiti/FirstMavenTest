package Project1.Coins;

// Doing the calculation from ILS to USD
public class ILS extends Coin {
    final double Value = 0.28;
    @Override
    public double getValue() {
        return Value;
    }
    public double calculate(double amount) {
        return getValue()*amount;
    }
}
