package com.example.triviahq_app.Animals;

public class Dogs {

    public String mQuestions[] = {
            "According to the AKC, what dog breed has been registered the most since 1991?",
            "What's the name of the dog that first traveled into space?",
            "What fictional dog is based on Charles Schulz's childhood dog named Spike?",
            "The longest living dog was a ___ named Bluey."

    };

    public String mChoices[][] = {
            {"German Shepard", "Beagle", "Labrador Retriever", "Siberian Husky"},
            {"Laika", "Belka", "Strelka", "Apollo"},
            {"Dogmeat", "Snoopy", "Clifford", "Pluto"},
            {"Australian Cattle Dog", "Mutt", "Chihuahua", "Pug"}
    };

    private String mCorrectAnswers[] = {
            "Labrador Retriever",
            "Laika",
            "Snoopy",
            "Australian Cattle Dog"};

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
