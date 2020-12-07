package com.example.triviahq_app.SuperHeroes.DC;

public class DC {

    public String mQuestions[] = {
            "What is Batman's identity?",
            "What is Superman's birth name?",
            "Who is the first ever flash?",
            "Who does Harley Quinn call Puddin?",
            "Who is J'onn J'onzz?",
            "Where does Superman send his villains?",
            "What is Captain Marvel better known as?",
            "What does Ra's Al Ghul's name stand for?",
            "Who breaks Batman's back?",
            "Who trained Batman?"

    };

    public String mChoices[][] = {
            {"Bruce Wayne", "Slade Wilson", "Clark Kent", "Oliver Queen"},
            {"Clark Kent", "Kal'eL", "Dan Smith", "Dru-Zod"},
            {"GodSpeed", "Barry Allen", "Wally West", "Jay Garrick"},
            {"Batman", "Robin", "The Riddler", "The Joker"},
            {"Plutonian Man", "Saturn Saber", "Atomizer", "Martian Manhunter"},
            {"The Quantum Realm", "The Phantom Zone", "Asgard", "The BatCave"},
            {"Black Adam", "Shizzle", "Shazam", "The Magician"},
            {"Joe Billy Bob", "The Demon's Head", "The Devil's Maker", "The Devourer"},
            {"Bane", "Kane", "The Joker", "Killer Croc"},
            {"The Darkness", "The League of Assassins", "The League of Bats", "The League of Shadows"}
    };

    private String mCorrectAnswers[] = {
            "Bruce Wayne",
            "Kal'eL",
            "Jay Garrick",
            "The Joker",
            "Martian Manhunter",
            "The Phantom Zone",
            "Shazam",
            "The Demon's Head",
            "Bane",
            "The League of Assassins"
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
