package com.pilgrim.tdd.money2;

class Money {

  protected int amount;
  protected String currency;

  String currency(){
    return currency;
  };

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  Money times(int multiplier){
    return null;
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && currency().equals(money.currency());
  }

  public static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  public String toString(){
    return amount + " " + currency;
  }
}
