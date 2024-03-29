package com.example.triviahq_app.Animals.Dogs;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.MenuScreen;
import com.example.triviahq_app.R;

public class DogFinalPage extends AppCompatActivity {

    private DogsLibrary d = new DogsLibrary();

    Button againButton, mainButton;
    TextView finalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_final_page);

        //Show final score
        finalScore = findViewById(R.id.scoreText);
        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");
        finalScore.setText("Your final score is: " + score + "/" + d.mQuestions.length);

        //Intent to play the same quiz again
        againButton = findViewById(R.id.playAgain);
        againButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(DogFinalPage.this, DogQuestions.class);
                startActivity(a);
            }
        });

        //Intent to quit from the Dog quiz to main menu
        mainButton = findViewById(R.id.mainMenu);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(DogFinalPage.this, MenuScreen.class);
                startActivity(b);
            }
        });

    }


}