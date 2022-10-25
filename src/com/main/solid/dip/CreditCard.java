package com.main.solid.dip;

public class CreditCard implements BankCard {

  @Override
  public void doTransaction(long amount) {
    System.out.println("payment using Credit card");
  }
}
