package com.example.myfirstapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button findBeer = findViewById(R.id.find_beer);
        findBeer.setOnClickListener(view -> {
            Spinner beerColor = findViewById(R.id.beer_color);
            String selectedColor = beerColor.getSelectedItem().toString();
            List<String> beerList = getBeers(selectedColor);
            String beerString = beerList.stream().collect(Collectors.joining("\n"));
            TextView brands = findViewById(R.id.brands);
            brands.setText(beerString);

        });
    }

    private List<String> getBeers(String color) {
        switch (color) {
            case "Light":
                return Arrays.asList("Jail Pale Ale", "Lager Lite");
            case "Amber":
                return Arrays.asList("Jack Amber", "Red Moose");
            case "Brown":
                return Arrays.asList("Brown Bear Beer", "Bock Brownie");
            default:
                return Arrays.asList("Gout Stout", "Dark Daniel");
        }
    }
}