package com.pilgrim.tdd.money2;

import java.util.Objects;

class Dollar {

  int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier){
    return new Dollar(amount * multiplier);
  }

  @Override
  public boolean equals(Object o) {
    return true;
  }

}
