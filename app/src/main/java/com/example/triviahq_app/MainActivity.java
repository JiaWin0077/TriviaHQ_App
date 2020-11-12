package com.example.triviahq_app;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.Animals.AnimalSubcategory;
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

        //Sports button command

        //Norse Myth button command

        //Superheroes button command
        Button superHeroButton = findViewById(R.id.SuperHerosButton);
        superHeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SuperHero = new Intent(MainActivity.this, SuperHeroesSubcategory.class);
                startActivity(SuperHero);
            }
        });


    }


}