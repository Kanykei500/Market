package impl;

import classes.Market;
import classes.Pokupatel;
import enums.Markett;
import produkty.Product;
import service.MarketService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketServiceImpl  implements MarketService {
    private List<Pokupatel>pokupatels=new ArrayList<>();

    List<Product> products = new ArrayList<>();
    // private List<Markett>marketList=new ArrayList<>();
    private List<Market> marketList1 = new ArrayList<>();

    public List<Market> getMarketList1() {
        return marketList1;
    }

    public void setMarketList1(List<Market> marketList1) {
        this.marketList1 = marketList1;
    }


    @Override
    public String createMarket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String market = scanner.nextLine();

        System.out.println("Address: ");
        String address = new Scanner(System.in).nextLine();

        System.out.println("Pochta: ");
        String pochta = new Scanner(System.in).nextLine();

        System.out.println("Phone number: ");
        String phoneNumber = new Scanner(System.in).nextLine();
        System.out.println("Schet: ");
        int schet=new Scanner(System.in).nextInt();

        System.out.println("Vremya : ");
        String vremya = new Scanner(System.in).nextLine();

        Market market1 = new Market(Markett.valueOf(market), address, pochta, phoneNumber, vremya, schet);
        marketList1.add(market1);

        return "Market uspeshno sozdan";
    }

   // @Override
    public String buyTheProduct() {


        return null;
    }

    @Override
    public Pokupatel getMarketByFirstName() {
//        System.out.println("First name: ");
//        String firstName=new Scanner(System.in).nextLine();
//
//        for (Pokupatel pokupatel:pokupatelList) {
//            if (pokupatel.getFirstName().equals(firstName)){
//                Pokupatel Markett = null;
//                return null;
//            }
//
//        }
//
//
        return null;
    }



    @Override
    public String chek(Pokupatel pokupatel, Market market) {
        Scanner scanner=new Scanner(System.in);
        int total = 0;
        boolean bool = true;
        while (bool){
            String name=scanner.next();
            if (name.equals("BUY")){
                bool = false;
            }
            for (Product product1:Product.values()) {
                if (product1.name().equals(name.toUpperCase())){
                    products.add(product1);
                    pokupatel.setSchet(pokupatel.getSchet() - product1.getPrice());
                    market.setSchet(market.getSchet() + product1.getPrice());
                    total = total+product1.getPrice();
                }

            }

        }

                

        return "~~~~~~~~CHECK~~~~~~~~~~~~~~~"+
                "\nMARKET:"+Markett.GLOBUS+
                "\nPOKUPATEL:"+pokupatel.getFirstName()+
                "\nPRODUCT:"+products+
                "\nOBSHAYA SUMMA:"+total;
    }
}
