package com.example.triviahq_app.Animals.Reptile;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.triviahq_app.R;

public class ReptileQuestions extends AppCompatActivity {

    private ReptileLibrary rl = new ReptileLibrary();

    private TextView Score;
    private TextView Question;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    private String Answer;
    private int currentScore = 0;
    private int questionNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptile_questions);

        Score = findViewById(R.id.ScoreBox);
        Question = findViewById(R.id.QuestionBox);
        button1 = findViewById(R.id.buttonA);
        button2 = findViewById(R.id.buttonB);
        button3 = findViewById(R.id.buttonC);
        button4 = findViewById(R.id.buttonD);

        updateQuestion();

        //Start of Button Listener for Button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic for Button goes in here

                if (button1.getText() == Answer) {
                    currentScore = currentScore + 1;
                    updateScore(currentScore);

                    if (questionNum == rl.mQuestions.length) {
                        Intent i = new Intent(ReptileQuestions.this, ReptileFinalPage.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", currentScore);
                        i.putExtras(bundle);
                        ReptileQuestions.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }

                else {
                    if (questionNum == rl.mQuestions.length) {
                        Intent i = new Intent(ReptileQuestions.this, ReptileFinalPage.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", currentScore);
                        i.putExtras(bundle);
                        ReptileQuestions.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });
        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic for Button goes in here

                if (button2.getText() == Answer) {
                    currentScore = currentScore + 1;
                    updateScore(currentScore);

                    if (questionNum == rl.mQuestions.length) {
                        Intent i = new Intent(ReptileQuestions.this, ReptileFinalPage.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", currentScore);
                        i.putExtras(bundle);
                        ReptileQuestions.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }

                else {
                    if (questionNum == rl.mQuestions.length) {
                        Intent i = new Intent(ReptileQuestions.this, ReptileFinalPage.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", currentScore);
                        i.putExtras(bundle);
                        ReptileQuestions.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });
        //End of Button Listener for Button2

        //Start of Button Listener for Button3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (button3.getText() == Answer) {
                    currentScore = currentScore + 1;
                    updateScore(currentScore);

                    if (questionNum == rl.mQuestions.length) {
                        Intent i = new Intent(ReptileQuestions.this, ReptileFinalPage.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", currentScore);
                        i.putExtras(bundle);
                        ReptileQuestions.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }

                else {
                    if (questionNum == rl.mQuestions.length) {
                        Intent i = new Intent(ReptileQuestions.this, ReptileFinalPage.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", currentScore);
                        i.putExtras(bundle);
                        ReptileQuestions.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });
        //End of Button Listener for Button3

        //Start of Button Listener for Button4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (button4.getText() == Answer) {
                    currentScore = currentScore + 1;
                    updateScore(currentScore);

                    if (questionNum == rl.mQuestions.length) {
                        Intent i = new Intent(ReptileQuestions.this, ReptileFinalPage.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", currentScore);
                        i.putExtras(bundle);
                        ReptileQuestions.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }

                else {
                    if (questionNum == rl.mQuestions.length) {
                        Intent i = new Intent(ReptileQuestions.this, ReptileFinalPage.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", currentScore);
                        i.putExtras(bundle);
                        ReptileQuestions.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });
        //End of Button Listener for Button4
    }

    private void updateQuestion() {
        Question.setText(rl.getQuestion(questionNum));
        button1.setText(rl.getChoice1(questionNum));
        button2.setText(rl.getChoice2(questionNum));
        button3.setText(rl.getChoice3(questionNum));
        button4.setText(rl.getChoice4(questionNum));

        Answer = rl.getCorrectAnswer(questionNum);
        questionNum++;
    }

    public void updateScore(int point) {
        Score.setText("Score: " + currentScore);
    }
}