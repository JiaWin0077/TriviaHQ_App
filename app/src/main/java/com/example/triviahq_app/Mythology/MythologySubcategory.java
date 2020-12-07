package com.example.triviahq_app.Mythology;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.Animals.AnimalSubcategory;
import com.example.triviahq_app.Animals.Dogs.DogQuestions;
import com.example.triviahq_app.Mythology.Abrahamic.Abrahamic;
import com.example.triviahq_app.Mythology.Abrahamic.AbrahamicQuestions;
import com.example.triviahq_app.Mythology.Celtic.CelticQuestions;
import com.example.triviahq_app.Mythology.Greek_Roman.Greek_RomanQuestions;
import com.example.triviahq_app.Mythology.Norse.NorseQuestions;
import com.example.triviahq_app.R;
import com.example.triviahq_app.SuperHeroes.DC.DCQuestions;
import com.example.triviahq_app.SuperHeroes.Marvel.MarvelQuestions;
import com.example.triviahq_app.SuperHeroes.Other.OtherQuestions;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.R;
import com.example.triviahq_app.SuperHeroes.DC.DCQuestions;
import com.example.triviahq_app.SuperHeroes.Marvel.MarvelQuestions;
import com.example.triviahq_app.SuperHeroes.Other.OtherQuestions;

public class MythologySubcategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mythology_subcategory);


        //pull up the abrahamic category
        Button AbrahamicButton = findViewById(R.id.AbrahamicButton);
        AbrahamicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Abrahamic = new Intent(MythologySubcategory.this, AbrahamicQuestions.class);
                startActivity(Abrahamic);
            }
        });

        //pull up the Celtic category
        Button celticButton = findViewById(R.id.CelticButton);
        celticButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Celtic = new Intent(MythologySubcategory.this, CelticQuestions.class);
                startActivity(Celtic);
            }
        });


        //pull up the greek/roman category
        Button greek_romanButton = findViewById(R.id.Greek_RomanButton);
        greek_romanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Greek_Roman = new Intent(com.example.triviahq_app.Mythology.MythologySubcategory.this, Greek_RomanQuestions.class);
                startActivity(Greek_Roman);
            }
        });

        //pull up the greek/roman category
        Button norseButton = findViewById(R.id.NorseButton);
        greek_romanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Norse = new Intent(com.example.triviahq_app.Mythology.MythologySubcategory.this, NorseQuestions.class);
                startActivity(Norse);
            }
        });
    }
}