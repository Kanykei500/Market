package produkty;

public enum Product {
    APELSIN("apelsin",120),//frukty
    LIMON("limon",50),
    YABLAKO("yablako",100),
    BANAN("banan",90),
    PERSIK("persik",140),
    TVOROG("tvorog",100),//molochnye produkty
    SYR("syr",120),
    MOLOKO("moloko",85),
    KEFIR("kefir",90),
    KURUT("kurut",200),
    IOGURT("iogurt",70),
    KURISA("kurisa",200),// myaso
    BARANINA("baranina",300),
    SVININA("Svinina",450),
    CHAI("chai",50),//napitki
    KOLA("kola",80),
    SOK("sok",70),
    VODA("voda",30),
    KARTOSHKA("kartoshka",55),//ovoshi
    POMIDODR("pomidor",120),
    KAPUSTA("kapusta",60),
    LUK("luk",40),
    MORKOV("morkov",45),
    HLEB("hleb",30),//hleb
    BULOCHKA("bulochka",60),
    BATON("baton",25);

    private String name;
    private int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
