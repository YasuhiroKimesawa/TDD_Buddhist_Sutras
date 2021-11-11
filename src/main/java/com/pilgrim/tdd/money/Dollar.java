package com.pilgrim.tdd.money;

public class Dollar extends Money{

  public Dollar(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  // multiplier・・・乗数
  Money times(int multiplier){
    return Money.dollar(amount * multiplier);
  }
}
