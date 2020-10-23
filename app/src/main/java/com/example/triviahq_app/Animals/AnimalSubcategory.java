package com.example.triviahq_app.Animals;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.Animals.Dogs.DogQuestions;
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


    }
}