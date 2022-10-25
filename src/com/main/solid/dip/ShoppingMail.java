package com.main.solid.dip;

public class ShoppingMail {

  private BankCard bankCard;

  public ShoppingMail(BankCard bankCard) {
    this.bankCard = bankCard;
  }

  public void doPurchaseSomething(long amount) {
    bankCard.doTransaction(amount);
  }

  public static void main(String[] args) {
    BankCard bankCard = new CreditCard();
    ShoppingMail shoppingMail = new ShoppingMail(bankCard);
    shoppingMail.doPurchaseSomething(5000);
  }
}
