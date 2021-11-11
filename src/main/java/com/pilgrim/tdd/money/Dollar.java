package com.pilgrim.tdd.money;

public class Dollar extends Money{

  public Dollar(int amount) {
    this.amount = amount;
  }

  // multiplier・・・乗数
  Dollar times(int multiplier){
    return new Dollar(amount * multiplier);
  }

  public boolean equals(Object object){
    Dollar dollar = (Dollar) object;
    return amount == dollar.amount;
  }
}
