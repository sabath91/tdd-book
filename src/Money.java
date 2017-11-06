public class Money {

    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && currency.equals(money.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }


}
