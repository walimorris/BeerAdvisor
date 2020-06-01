package com.example.beeradvisor;

import java.util.*;

/* This method receives a color from the Spinner object, color represents beer strength, and 
 * reads the color. Depending on color, a list of different beer brands are created */ 
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
        // returns list of beer brands to display in TextView 
        return brands;
    }
}
