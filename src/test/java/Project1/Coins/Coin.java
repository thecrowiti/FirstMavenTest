package Project1.Coins;

// Lets ILS and USD extends from him
public abstract class Coin implements ICalculate {
    public abstract double getValue();

    @Override
    public double calculate() {
        return 0;
    }
}
