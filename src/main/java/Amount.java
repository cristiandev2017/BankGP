public class Amount {

    private final int value;

    public Amount(int value) {
        this.value = value;
    }

    public static Amount amountOf(int value){
        return new Amount(value);
    }

    public Amount plus(Amount otherAmount){
        return amountOf(this.value + otherAmount.value);
    }

    public Amount negative(Amount otherAmount){
        return amountOf(this.value - otherAmount.value);
    }

    public boolean isGreaterThan(Amount otherAmount){
        return this.value > otherAmount.value;
    }



}
