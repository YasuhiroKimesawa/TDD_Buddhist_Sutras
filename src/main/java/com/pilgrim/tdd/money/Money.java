package com.pilgrim.tdd.money;

abstract class Money {
  protected int amount;
  abstract Money times(int multiplier);
  abstract String currency();

  public boolean equals(Object object){
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }

  static Money dollar(int amount){
    return new Dollar(amount);
  }

  static Franc franc(int amount){
    return new Franc(amount);
  }
}
