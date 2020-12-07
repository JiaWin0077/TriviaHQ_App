package com.example.triviahq_app.SuperHeroes.Marvel;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.MenuScreen;
import com.example.triviahq_app.R;

public class MarvelFinalPage extends AppCompatActivity {

    private Marvel marvel = new Marvel();

    Button againButton, mainButton;
    TextView finalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marvel_final_page);

        //Show final score
        finalScore = findViewById(R.id.scoreText);
        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");
        finalScore.setText("Your final score is: " + score + "/" + marvel.mQuestions.length);

        //Intent to play the same quiz again
        againButton = findViewById(R.id.playAgain);
        againButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MarvelFinalPage.this, MarvelQuestions.class);
                startActivity(a);
            }
        });

        //Intent to quit from the Dog quiz to main menu
        mainButton = findViewById(R.id.mainMenu);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MarvelFinalPage.this, MenuScreen.class);
                startActivity(b);
            }
        });

    }
}