package com.pilgrim.tdd.money2;

class Money implements Expression {

  protected int amount;
  protected String currency;

  String currency(){
    return currency;
  };

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  Money times(int multiplier){
    return new Money(amount * multiplier, currency);
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && currency().equals(money.currency());
  }

  public static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public String toString(){
    return amount + " " + currency;
  }

  public Expression plus(Money addend) {
    return new Money(amount + addend.amount, currency);
  }
}
