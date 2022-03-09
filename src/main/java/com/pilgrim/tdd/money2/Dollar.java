package com.pilgrim.tdd.money2;

class Dollar extends Money{

  Dollar(int amount) {
    super(amount);
  }

  Dollar times(int multiplier){
    return new Dollar(amount * multiplier);
  }

}
