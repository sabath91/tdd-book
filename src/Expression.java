interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression tenFranks);

    Expression times(int multiplier);
}
