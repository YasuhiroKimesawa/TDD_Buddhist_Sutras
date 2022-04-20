package com.pilgrim.tdd.money2;

class Dollar extends Money{

  private String currency;

  Dollar(int amount) {
    super(amount);
    this.currency = "USD";
  }

  Money times(int multiplier){
    return new Dollar(amount * multiplier);
  }

  @Override
  String currency() {
    return currency;
  }

}
