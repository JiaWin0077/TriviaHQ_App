package com.example.triviahq_app.Animals.Birds;

public class BirdLibrary {

    public String mQuestions[] = {
            "Which bird has the largest wingspan",
            "How many known species of birds are there?",
            "What color are the American robin's eggs?",
            "What is a group of owls called?",
            "What bird has the longest lifespan?",
            "What evolutionary adaptation helps birds fly?",
            "One ostrich egg is equivalent to the weight of how many chicken eggs?",
            "Which bird can fly backwards?",
            "A bald eagle nest can weigh up to ____.",
            "Which bird has sometimes been called an \"honorary mammal\"?",
            "How many species of penguins live at the North Pole?",
            "For their size, hummingbirds have the largest _____ of all birds.",
            "What percent of parrot species are endangered?",
            "What sound do owls make?",
            "What's the most common species of bird found around the world?",
    };

    public String mChoices[][] = {
            {"Ostrich", "Wandering Albatross", "Golden Eagle", "Ruppell's Vulture"},
            {"10,000", "40,000", "20,000", "5,000"},
            {"Pink", "Blue", "White", "Brown"},
            {"Colony", "Flock", "Parliament", "Brood"},
            {"Parrot","Swan","Ostrich","Bald Eagle"},
            {"Hollow Bones","Rapid Digestion","Beaks","All the Above"},
            {"12","5","24","10"},
            {"Kingfisher","Heron","Warbler","Hummingbird"},
            {"4,400lbs","2,200lbs","500lbs","1,000lbs"},
            {"Penguin","Emu","Cassowary","Kiwi"},
            {"0","5","2","3"},
            {"Wingspan","Brain","Eyes","Beak"},
            {"50%","20%","40%","10%"},
            {"Bark","Hoot","Whinny","All of These"},
            {"Canada Goose","Chicken","Swan","American Crow"},
    };

    private String mCorrectAnswers[] = {
            "Wandering Albatross",
            "10,000",
            "Blue",
            "Parliament",
            "Parrot",
            "All the Above",
            "24",
            "Hummingbird",
            "4,400lbs",
            "Kiwi",
            "0",
            "Brain",
            "50%",
            "All of These",
            "Chicken",
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
