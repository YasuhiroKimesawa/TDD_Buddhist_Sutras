package com.pilgrim.tdd.money2;

abstract class Money {

  protected int amount;
  abstract Money times(int multiplier);

  public Money(int amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }

  public static Money dollar(int amount) {
    return new Dollar(amount);
  }

  public static Money franc(int amount) {
    return new Franc(amount);
  }
}
