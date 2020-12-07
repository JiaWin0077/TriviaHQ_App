package com.example.triviahq_app.Mythology.Norse;

public class Norse {
    public String Questions[] = {
            "Where did all mighty Norse warriors hope to go to after their death?",
            "What were Odin's personal soldiers from Valhalla called?",
            "What is the world-ending event in Norse mythology?",
            "What texts are the main sources of Norse mythology?",
            "What did the Norse call their epic poems?",
            "What did the Norse call the fiery region to the south of their world?",
            "What was the first living thing, according to Norse myth?",
            "What was the first animal, created to accompany and nourish Ymir?",
            "Who kills Ymir and creates the rest of the world?",
            "What innocuous item kills Balder?"

    };

    public String Choices[][] = {
            {"Heaven", "Valhalla", "Purgatory", "Hel"},
            {"Einherjar", "Soliders of Odin", "Heroes", "Valkyries"},
            {"Apocalypse", "End of Days", "Einherjar", "Ragnarök"},
            {"Eillas", "Ellas", "Eddas", "Eibas"},
            {"Skold", "Skald", "Skild", "Skonds"},
            {"Muspelheim", "Niflheim", "Helheim", "Alfheim"},
            {"Fish", "Frost Giant", "Man", "Goat"},
            {"Sheep", "Goat", "Cow", "Pig"},
            {"Sons of Bor", "Sons of Odin", "Sons of Loki", "Sons of Thor"},
            {"Leaf", "Papyrus", "Cloth", "Mistletoe"}
    };

    private String CorrectAnswers[] = {
            "Valhalla",
            "Einherjar",
            "Ragnarök",
            "Eddas",
            "Skald",
            "Muspelheim",
            "Frost Giant",
            "Cow",
            "Sons of Bor",
            "Mistletoe"
    };

    public String getQuestion(int a) {
        String question = Questions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = Choices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = Choices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = Choices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = Choices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = CorrectAnswers[a];
        return answer;
    }
}
