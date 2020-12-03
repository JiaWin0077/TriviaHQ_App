package com.example.triviahq_app.Animals;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.Animals.Birds.BirdQuestions;
import com.example.triviahq_app.Animals.Dogs.DogQuestions;
import com.example.triviahq_app.Animals.Cats.CatsQuestions;
import com.example.triviahq_app.Animals.Reptile.ReptileQuestions;
import com.example.triviahq_app.R;

public class AnimalSubcategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_subcategory);

        //Move to dog questions if clicked on dog category
        Button DogButton = findViewById(R.id.DogsButton);
        DogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dogs = new Intent(AnimalSubcategory.this, DogQuestions.class);
                startActivity(Dogs);
            }
        });

        //Move to cat questions
        Button CatButton = findViewById(R.id.CatsButton);
        CatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cats = new Intent(AnimalSubcategory.this, CatsQuestions.class);
                startActivity(Cats);
            }
        });

        //Move to bird questions
        Button BirdButton = findViewById(R.id.BirdsButton);
        BirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Birds = new Intent(AnimalSubcategory.this, BirdQuestions.class);
                startActivity(Birds);
            }
        });

        //Move to reptile questions
        Button ReptileButton = findViewById(R.id.ReptilesButton);
        ReptileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Reptile = new Intent(AnimalSubcategory.this, ReptileQuestions.class);
                startActivity(Reptile);
            }
        });

    }
}