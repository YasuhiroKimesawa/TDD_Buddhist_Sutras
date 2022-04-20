package com.pilgrim.tdd.money2;

public class Franc extends Money{

  private String currency;

  Franc(int amount) {
    super(amount);
    this.amount = amount;
    currency = "CHF";
  }

  Money times(int multiplier){
    return new Franc(amount * multiplier);
  }

  @Override
  String currency() {
    return currency;
  }
}
