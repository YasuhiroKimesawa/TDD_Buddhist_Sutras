package com.pilgrim.tdd.money;

public class Dollar {

  int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  // multiplier・・・乗数
  void times(int multiplier){
    amount = amount * 2;
  }
}
