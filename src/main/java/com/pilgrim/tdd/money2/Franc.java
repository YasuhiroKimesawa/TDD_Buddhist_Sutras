package com.pilgrim.tdd.money2;

public class Franc extends Money{

  Franc(int amount) {
    super(amount);
    this.amount = amount;
  }

  Franc times(int multiplier){
    return new Franc(amount * multiplier);
  }
}
