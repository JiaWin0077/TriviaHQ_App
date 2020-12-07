package com.example.triviahq_app.History;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.R;
import com.example.triviahq_app.History.Ancient.AncientQuestions;
import com.example.triviahq_app.History.Renaissance.RenaissanceQuestions;
import com.example.triviahq_app.History.ColonialAmerica.ColonialAmericaQuestions;
import com.example.triviahq_app.History.Modern.ModernQuestions;

public class HistorySubcategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h);

        //Move to ancient questions if clicked on ancient category
        Button AncientButton = findViewById(R.id.Button1);
        AncientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ancient = new Intent(HistorySubcategory.this, AncientQuestions.class);
                startActivity(Ancient);
            }
        });

        //Move to renaissance questions if clicked on renaissance category
        Button RenaissanceButton = findViewById(R.id.Button2);
        RenaissanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Renaissance = new Intent(HistorySubcategory.this, RenaissanceQuestions.class);
                startActivity(Renaissance);
            }
        });

        //Move to colonial america questions if clicked on colonial america category
        Button ColonialAmericaButton = findViewById(R.id.Button3);
        ColonialAmericaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ColonialAmerica = new Intent(HistorySubcategory.this, ColonialAmericaQuestions.class);
                startActivity(ColonialAmerica);
            }
        });

        Button ModernButton = findViewById(R.id.Button4);
        ModernButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Modern = new Intent(HistorySubcategory.this, ModernQuestions.class);
                startActivity(Modern);
            }
        });
    }
}
