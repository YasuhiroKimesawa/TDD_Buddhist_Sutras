package com.pilgrim.tdd.money;

class Money implements Expression{
  protected int amount;
  protected String currency;

  public Money(int amount, String currency){
    this.amount = amount;
    this.currency = currency;
  }

  // multiplier・・・乗数
  public Expression times(int multiplier){
    return new Money(amount * multiplier, currency);
  }

  public Expression plus(Expression addend) {
    return new Sum(this, addend);
  }

  String currency(){
    return currency;
  }

  public Money reduce(Bank bank, String to){
    int rate = bank.rate(currency, to);
    return new Money(amount / rate, to);
  }

  public boolean equals(Object object){
    Money money = (Money) object;
    return amount == money.amount && currency.equals(money.currency);
  }

  public String toString(){
    return amount + " " + currency;
  }

  static Money dollar(int amount){
    return new Money(amount, "USD");
  }

  static Money franc(int amount){
    return new Money(amount, "CHF");
  }
}
