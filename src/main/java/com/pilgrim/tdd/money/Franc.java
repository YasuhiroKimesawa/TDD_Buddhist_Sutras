package com.pilgrim.tdd.money;

public class Franc extends Money{

  public Franc(int amount, String currency) {
    super(amount, currency);
  }

  // multiplier・・・乗数
  Money times(int multiplier){
    return new Money(amount * multiplier, currency);
  }
}
