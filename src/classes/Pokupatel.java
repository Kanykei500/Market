package classes;

import enums.Markett;

public class Pokupatel {
    private String firstName;
    private String lastName;
     private int age;
     private Markett market;
    private long schet;

    public Pokupatel(String firstName, String lastName, Markett market, long schet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.market = market;
        this.schet = schet;
    }

    public Pokupatel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Markett getMarket() {
        return market;
    }

    public void setMarket(Markett market) {
        this.market = market;
    }

    public long getSchet() {
        return schet;
    }

    public void setSchet(long schet) {
        this.schet = schet;
    }

    @Override
    public String toString() {
        return "Pokupatel{" +
                "\nfirstName='" + firstName  +
                "\nlastName='" + lastName +
                "\nmarket=" + market +
                "\nschet=" + schet +
                "=================================";};
    }

