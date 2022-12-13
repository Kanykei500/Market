import classes.Market;
import classes.Pokupatel;
import enums.Markett;
import impl.MarketServiceImpl;
import impl.PersonServiceImpl;
import produkty.Product;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonServiceImpl personService=new PersonServiceImpl();
        MarketServiceImpl marketService=new MarketServiceImpl();
        Pokupatel pokupatel = new Pokupatel();
        Market market = new Market();

        while (true){
            System.out.println("""
                    
                    
                    ~~~~~~~~~COMMANDS~~~~~~~~~
                    1.MARKETS
                    2.PRODUCTS
                    3.CREATE POKUPATEL
                    4.GET ALL POKUPATEL
                    5.CREATE MARKET
                    6.GET ALL MARKET
                    7.CHEK
                    8.GET PRODUCT BY MARKET NAME//
                    9.
                    10.
                    11.GET MARKET BY FIRST NAME//
                    
                    
                    
                    WRITE COMMAND:
                    """);
            Scanner scanner=new Scanner(System.in);
            int number= scanner.nextInt();
            switch (number){
                case 1:
                    System.out.println("Markety: "+ Arrays.toString(Markett.values()));
                    break;
                case  2:
                    System.out.println("Produkty: "+Arrays.toString(Product.values()));
                    break;
                case 3:
                    System.out.println(personService.createPokupatel());
                    break;
                case 4:
                    System.out.println(personService.getPokupatelList());
                    break;
                case 5:
                    System.out.println(marketService.createMarket());
                    break;
                case 6:
                    System.out.println(marketService.getMarketList1());
                    break;
                case 7:
                    System.out.println(marketService.chek(pokupatel, market));
                    break;




            }
        }
    }
}