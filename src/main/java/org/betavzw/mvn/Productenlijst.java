package org.betavzw.mvn;

import java.util.ArrayList;
import java.util.List;

public class Productenlijst {
    private static List<Product> producten = new ArrayList<>();
    static{
        producten.add(new Product(1, "potlood", 3));
        producten.add(new Product(2, "gom", 4));

    }
    public static List<Product> getProducten(){
        return producten;
    }
}
