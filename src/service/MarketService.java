package service;

import classes.Market;
import classes.Pokupatel;
import produkty.Product;

public interface MarketService {
    String createMarket();
//String buyTheProduct();

Pokupatel getMarketByFirstName();
String chek(Pokupatel pokupatel, Market market);

}
