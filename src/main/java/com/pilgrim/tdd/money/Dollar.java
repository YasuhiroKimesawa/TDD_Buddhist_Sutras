package com.pilgrim.tdd.money;

public class Dollar extends Money{

  public Dollar(int amount, String currency) {
    super(amount, currency);
  }

  // multiplier・・・乗数
  Money times(int multiplier){
    return new Dollar(amount * multiplier, "USD");
  }
}
