package com.example.triviahq_app.SuperHeroes;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.R;
import com.example.triviahq_app.SuperHeroes.DC.DCQuestions;
import com.example.triviahq_app.SuperHeroes.Marvel.MarvelQuestions;
import com.example.triviahq_app.SuperHeroes.Other.OtherQuestions;

public class SuperHeroesSubcategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_heroes_subcategory);


        //Move to dc questions if clicked on dc category
        Button DCbut = findViewById(R.id.DCbutton);
        DCbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DC = new Intent(SuperHeroesSubcategory.this, DCQuestions.class);
                startActivity(DC);
            }
        });

        //Move to marvel questions if clicked on marvel category
        Button Marvelbut = findViewById(R.id.Marvelbutton);
        Marvelbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Marvel = new Intent(SuperHeroesSubcategory.this, MarvelQuestions.class);
                startActivity(Marvel);
            }
        });

        //Move to other questions if clicked on other category
        Button Otherbut = findViewById(R.id.Otherbutton);
        Otherbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Other = new Intent(SuperHeroesSubcategory.this, OtherQuestions.class);
                startActivity(Other);
            }
        });
    }
}