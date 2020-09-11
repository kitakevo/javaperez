package models;

import types.Brand;

public class Card {

    private Brand brand;
    private double cardNumber;
    private String cardHolder;
    private ExpirationDate expirationDate;

    public Brand getBrand() {
        return brand;
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }
}

