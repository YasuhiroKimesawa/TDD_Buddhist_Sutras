package com.pilgrim.tdd.money2;

class Dollar {

  int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier){
    amount *= multiplier;

    return null;
  }
}
