package com.example.beeradvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.*;

public class MainActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        /**
         * Method is called when user clicks the "FIND BEER" Button
         * @param view: The button GUI component is of type View
         */
        public void onClickFindBeer (View view){
            /* Creates a reference to the textview beer brands */
            TextView brands = findViewById(R.id.brands);
            /* creates a reference to the Spinner component in the layout */
            Spinner color = findViewById(R.id.color);
            /* Gets the selected item in the spinner object */
            String beerType = String.valueOf(color.getSelectedItem());
            /* Calls the getBrands() method from the BeerExpert class in order to create a
             * list of brands, depending on which "color" was chosen from the spinner, and
             * displays the list of beers */
            List<String> brandsList = expert.getBrands(beerType);
            StringBuilder brandsFormatted = new StringBuilder();
            for (String brand : brandsList) {
                brandsFormatted.append(brand).append('\n');
            }
            brands.setText(brandsFormatted);
        }
    }


