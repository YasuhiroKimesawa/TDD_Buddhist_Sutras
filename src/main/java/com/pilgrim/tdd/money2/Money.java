package com.pilgrim.tdd.money2;

abstract class Money {

  protected int amount;
  protected String currency;
  abstract Money times(int multiplier);

  String currency(){
    return currency;
  };

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }

  public static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }
}
