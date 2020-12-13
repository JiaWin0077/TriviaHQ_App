package com.example.triviahq_app;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.Animals.AnimalSubcategory;
import com.example.triviahq_app.History.HistorySubcategory;
import com.example.triviahq_app.Mythology.MythologySubcategory;
import com.example.triviahq_app.Sports.SportsSubcategory;
import com.example.triviahq_app.SuperHeroes.SuperHeroesSubcategory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animals button command
        Button animalButton = findViewById(R.id.AnimalsButton);
        animalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Animal = new Intent(MainActivity.this, AnimalSubcategory.class);
                startActivity(Animal);
            }
        });

        //History button command
        Button hisButton = findViewById(R.id.HistoryButton);
        hisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent History = new Intent(MainActivity.this, HistorySubcategory.class);
                startActivity(History);
            }
        });

        //Sports button command
        Button sportsButton = findViewById(R.id.Sportsbutton);
        sportsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sports = new Intent(MainActivity.this, SportsSubcategory.class);
                startActivity(Sports);
            }
        });

        //Myth button command
        Button mythButton = findViewById(R.id.MythologyButton);
        mythButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Myth = new Intent(MainActivity.this, MythologySubcategory.class);
                startActivity(Myth);
            }
        });

        //Superheroes button command
        Button shButton = findViewById(R.id.SuperHerosButton);
        shButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Super = new Intent(MainActivity.this, SuperHeroesSubcategory.class);
                startActivity(Super);
            }
        });

    }


}