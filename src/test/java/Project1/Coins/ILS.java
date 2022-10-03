package Project1.Coins;

import Project1.Coins.Coin;

// Convert ILS to USD
public class ILS extends Coin {
    final double Value = 0.28;
    public double getValue() {
        return Value;
    }
    public double calculate(double amount) {
        return getValue()*amount;
    }
}
