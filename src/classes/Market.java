package classes;

import enums.Markett;

public class Market {
    private Markett market;
    private String address;
    private String pochta;
    private String phoneNumber;
    private String vremya;
    private int schet;

    public int getSchet() {
        return schet;
    }

    public void setSchet(int schet) {
        this.schet = schet;
    }
    public Market(){}

    public Market(Markett market, String address, String pochta, String phoneNumber, String vremya, int schet) {
        this.market = market;
        this.address = address;
        this.pochta = pochta;
        this.phoneNumber = phoneNumber;
        this.vremya = vremya;
        this.schet = schet;
    }

    public Markett getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market.getMarket();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPochta() {
        return pochta;
    }

    public void setPochta(String pochta) {
        this.pochta = pochta;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVremya() {
        return vremya;
    }

    public void setVremya(String vremya) {
        this.vremya = vremya;
    }

    @Override
    public String toString() {
        return "Market{" +
                "\nmarket=" + market +
                "\n address='" + address +
                "\n pochta='" + pochta +
                "\n phoneNumber='" + phoneNumber +
                "\n vremya='" + vremya +
                "\n schet='"+schet+
                "\n==========================";};
    }




