package com.linkedinlearning.challenges;

public class VAT {
  private double vat;
  private String currencySymbol;

  public VAT(double vat, String currencySymbol) {
    this.vat = vat;
    this.currencySymbol = currencySymbol;
  }

  public String renderInvoice(double price) {
    return """
        Netto: %.2f%s
        VAT (%.2f ): %.2f%s
        Total: %.2f%s""".formatted(
        price, currencySymbol,
        vat, (price * vat), currencySymbol,
        (price + (price * vat)), currencySymbol);
  }

  public static void main(String[] args) {

    VAT vat = new VAT(0.19, "€");
    System.out.println(vat.renderInvoice(10));

  }
}