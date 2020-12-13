package com.example.triviahq_app.Sports;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.R;
import com.example.triviahq_app.Sports.Baseball.BaseballQuestions;
import com.example.triviahq_app.Sports.Basketball.BasketballQuestions;
import com.example.triviahq_app.Sports.Football.FootballQuestions;
import com.example.triviahq_app.Sports.Hockey.HockeyQuestions;

public class SportsSubcategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_subcategory);

        //Move to dog questions if clicked on dog category
        Button BasketballButton = findViewById(R.id.BasketballButton);
        BasketballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Basketball = new Intent(SportsSubcategory.this, BasketballQuestions.class);
                startActivity(Basketball);
            }
        });

        //Move to cat questions
        Button FootballButton = findViewById(R.id.FootballButton);
        FootballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Football = new Intent(SportsSubcategory.this, FootballQuestions.class);
                startActivity(Football);
            }
        });

        //Move to bird questions
        Button BaseballButton = findViewById(R.id.BaseballButton);
        BaseballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Baseball = new Intent(SportsSubcategory.this, BaseballQuestions.class);
                startActivity(Baseball);
            }
        });

        //Move to reptile questions
        Button HockeyButton = findViewById(R.id.HockeyButton);
        HockeyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hockey = new Intent(SportsSubcategory.this, HockeyQuestions.class);
                startActivity(Hockey);
            }
        });

    }
}