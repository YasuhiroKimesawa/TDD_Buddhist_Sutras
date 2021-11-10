package com.pilgrim.tdd.money;

public class Dollar {

  int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  // multiplier・・・乗数
  Dollar times(int multiplier){
    amount *= multiplier;
    return null;
  }
}
