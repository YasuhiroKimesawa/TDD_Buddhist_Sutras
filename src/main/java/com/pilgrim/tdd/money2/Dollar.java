package com.pilgrim.tdd.money2;

class Dollar extends Money{

  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier){
    return new Dollar(amount * multiplier, currency);
  }
}
