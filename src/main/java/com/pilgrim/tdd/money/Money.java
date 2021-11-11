package com.pilgrim.tdd.money;

class Money {
  protected int amount;
  protected String currency;

  public Money(int amount, String currency){
    this.amount = amount;
    this.currency = currency;
  }

  // multiplier・・・乗数
  Money times(int multiplier){
    return new Money(amount * multiplier, currency);
  }

  String currency(){
    return currency;
  }

  public boolean equals(Object object){
    Money money = (Money) object;
    return amount == money.amount && currency.equals(money.currency);
  }

  public String toString(){
    return amount + " " + currency;
  }

  static Money dollar(int amount){
    return new Dollar(amount, "USD");
  }

  static Franc franc(int amount){
    return new Franc(amount, "CHF");
  }
}
