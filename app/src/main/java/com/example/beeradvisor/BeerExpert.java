package com.example.beeradvisor;

import java.util.*;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        switch (color) {
            case "light":
                brands.add("Michelob Ultra");
                brands.add("Heineken Light");
                brands.add("Bud Light");
                brands.add("Yuengling Lager");
                brands.add("Amstel");
                brands.add("Kirin");
                brands.add("Corona");
                brands.add("Sam Adams");
                break;
            case "amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                brands.add("Fat Tire");
                brands.add("Hop Head Red");
                brands.add("Bell's");
                brands.add("Flipside Red IPA");
                break;
            case "brown":
                brands.add("Sweetwater Georgia Brown");
                brands.add("Brooklyn Brown Ale");
                brands.add("Wormtown Brewery Blizzard");
                brands.add("Newcastle Brown Ale");
                brands.add("Ithaca - Nut Brown");
                break;
            default:
                brands.add("New Belgium");
                brands.add("Milk Stout Nitro");
                brands.add("Licorne - Black");
                brands.add("Chocolate Stout");
                brands.add("Chestnut Ale");
                break;
        }
        return brands;
    }
}
