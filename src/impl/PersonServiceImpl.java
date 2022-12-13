package impl;

import classes.Market;
import classes.Pokupatel;
import enums.Markett;
import produkty.Product;
import service.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    private List<Market>marketList=new ArrayList<>();
    private List<Pokupatel>pokupatelList=new ArrayList<>();
    Pokupatel pokupatel;

    public List<Pokupatel> getPokupatelList() {
        return pokupatelList;
    }

    public void setPokupatelList(List<Pokupatel> pokupatelList) {
        this.pokupatelList = pokupatelList;
    }

    @Override
    public String createPokupatel() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("First name: ");
        String firstName=scanner.nextLine();

        System.out.println("Last name: ");
        String lastName=new Scanner(System.in).nextLine();

        System.out.println("Age: ");
        int age=new Scanner(System.in).nextInt();

        System.out.println("Market: ");
        String market=new Scanner(System.in).nextLine();

        System.out.println("Schet: ");
        Long schet=new Scanner(System.in).nextLong();

        Pokupatel pokupatel=new Pokupatel(firstName,lastName,
                Markett.valueOf(market),schet);
        pokupatelList.add(pokupatel);

this.pokupatel=pokupatel;


        return "Pokupatel uspeshno sozdan";
    }

    @Override
    public Pokupatel getProductByLastName() {

        System.out.println("Last name");
        String lastName=new Scanner(System.in).nextLine();

        for (Pokupatel pokupatel:pokupatelList) {
            if (pokupatel.getLastName().equals(lastName)){
                Pokupatel Product = null;
                return Product;
            }
            
        }
        
        
        
        return null;
    }


}
