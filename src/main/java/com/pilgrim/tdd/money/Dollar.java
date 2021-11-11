package com.pilgrim.tdd.money;

public class Dollar extends Money{

  public Dollar(int amount) {
    this.amount = amount;
    currency = "USD";
  }

  // multiplier・・・乗数
  Money times(int multiplier){
    return new Dollar(amount * multiplier);
  }
}
