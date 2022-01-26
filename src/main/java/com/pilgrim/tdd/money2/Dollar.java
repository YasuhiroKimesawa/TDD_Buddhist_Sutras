package com.pilgrim.tdd.money2;

class Dollar {

  int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  void times(int multiplier){
    amount = amount * multiplier;
  }
}
