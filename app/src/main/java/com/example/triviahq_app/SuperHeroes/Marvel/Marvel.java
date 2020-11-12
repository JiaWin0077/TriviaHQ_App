package com.example.triviahq_app.SuperHeroes.Marvel;

public class Marvel {

    public String mQuestions[] = {
            "What is Thor's Hammer called?",
            "What is Captain America’s shield made of?",
            "The Flerkens are a race of extremely dangerous aliens that resembles what?",
            "What is the alien race Loki sends to invade Earth in The Avengers?",
            "What are the items Thanos is looking for throughout the galaxy?",
            "Who creates Ultron?",
            "How was Thor's hammer made?",
            "What does Ironman say to Thanos before making the snap with the Infinity gauntlet?",
            "Who is Peter Parker?",
            "Who is the big purple villain in the Avengers?"

    };

    public String mChoices[][] = {
            {"Mjolnir", "Hammer Time", "Norn", "Aesir"},
            {"Adamantium", "Vibranium", "Carbon", "Promethium"},
            {"Ducks", "Lizards", "Cats", "Mice"},
            {"The Chitauri", "The Skrulls", "The Kree", "The Flerkens"},
            {"Paralax gems", "World stones", "Special rocks", "Infinity stones"},
            {"Tony Stark", "Captain Rogers", "Hank Pym", "Natasha Romanoff"},
            {"With metal from a drying star", "In a furnace", "With metal form a shooting star", "By a blacksmith named Bob"},
            {"I am inevitable", "See ya Squidward", "I am IronMan", "See ya Grimace"},
            {"IronMan", "Starlord", "Doctor Strange", "SpiderMan"},
            {"Ultron", "Abomination", "Venom", "Thanos"}
    };

    private String mCorrectAnswers[] = {
            "Mjolnir",
            "Vibranium",
            "Cats",
            "The Chitauri",
            "Infinity stones",
            "Hank Pym",
            "With metal from a dying star",
            "I am IronMan",
            "SpiderMan",
            "Thanos"

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
