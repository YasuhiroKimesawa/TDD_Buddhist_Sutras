package com.pilgrim.tdd.money;

public class Franc extends Money{

  public Franc(int amount) {
    this.amount = amount;
  }

  // multiplier・・・乗数
  Franc times(int multiplier){
    return new Franc(amount * multiplier);
  }
}