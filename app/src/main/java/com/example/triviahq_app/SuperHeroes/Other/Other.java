package com.example.triviahq_app.SuperHeroes.Other;

public class Other {

    public String mQuestions[] = {
            "What is the Teenage ninja mutant turtles favorite food?",
            "What substance took the turtles from normal reptiles to crime-fighting ninjas?",
            "Who is the main villain to the TNMT?",
            "THe TNMTs are named after who?",
            "What marvel comic is the TNMT spoofed from?",
            "Who is the spoof of Superman in the Boys?",
            "Why does everyone fear Homelander?",
            "Who is the red demon with one giant hand?",
            "What is Hellboy's nickname?",
            "Who is Black Noir?"

    };

    public String mChoices[][] = {
            {"Chicken", "Sushi", "Pie", "Pizza"},
            {"The Liquid", "Vibe", "Ooze", "The Concoction"},
            {"Dicer", "Cutter", "Slicer", "Shredder"},
            {"Ventriloquist", "Artists", "Docters", "Teachers"},
            {"IronMan", "SpiderMan", "Daredevil", "Doctor Strange"},
            {"Superguy", "Homelander", "Pathfinder", "The King"},
            {"He is insane", "He is a god", "He is powerful", "He likes chicken"},
            {"Thanos", "Hellboy", "Spawn", "Hellraiser"},
            {"Red", "Hellspawn", "Big Guy", "Demon"},
            {"Batman fan", "Just a dude", "A God", "A clone of Homelander"}
    };

    private String mCorrectAnswers[] = {
            "Pizza",
            "Ooze",
            "Shredder",
            "Artists",
            "Daredevil",
            "Homelander",
            "He is insane",
            "Hellboy",
            "Red",
            "A clone of Homelander"

    };

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}