package com.pilgrim.tdd.money;

public class Dollar extends Money{

  private String currency;

  public Dollar(int amount) {
    this.amount = amount;
    currency = "USD";
  }

  // multiplier・・・乗数
  Money times(int multiplier){
    return new Dollar(amount * multiplier);
  }

  @Override
  String currency() {
    return currency;
  }
}
