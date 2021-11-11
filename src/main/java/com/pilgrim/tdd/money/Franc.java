package com.pilgrim.tdd.money;

public class Franc extends Money{

  public Franc(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  // multiplier・・・乗数
  Money times(int multiplier){
    return Money.franc(amount * multiplier);
  }
}
