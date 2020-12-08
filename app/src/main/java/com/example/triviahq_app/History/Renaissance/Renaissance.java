package com.example.triviahq_app.History.Renaissance;

public class Renaissance {

    public String mQuestions[] = {
        "The Renaissance beginnings is considered to have started in which modern day country?",
        "The Renaissance saw a great amount of interest in the history and culture in which ancient civilizations?",
        "The statue of David and the Sistine Chapel were made by which Renaissance artist?",
        "The phrase da Vinci in Leonardo da Vinci’s name means what?",
        "Which of these families was extremely important to the Renaissance?",
        "Which influential author wrote “The Prince”?",
        "What did the “Vitruvian Man” by Leonardo da Vinci depict?",
        "What does the word “Renaissance” mean?",
        "The Renaissance saw the creation of what religious practice?",
        "What idea was proposed by Nicolaus Copernicus?",
    };

    public String mChoices[][] = {
            {"England", "Italy", "Germany", "France"},
            {"Rome and Greece", "Egypt and Mesopotamia", "Mayan and Aztec", "China and India"},
            {"Raphael", "Leonardo da Vinci", "Michelangelo", "Donatello"},
            {"His surname", "The town he was from", "His adoptive family's name", "He made it up"},
            {"The Acciaioli's", "The Gaddi's", "The Medici's", "The Salviati's"},
            {"Chaucer", "Alighieri", "Shakespeare", "Machiavelli"},
            {"Proportions of the body", "The creation of man", "Himself", "Julius Caesar"},
            {"Beginning", "Rebirth", "Recollection", "Review"},
            {"Hinduism", "Protestantism", "Catholicism", "Paganism"},
            {"Heliocentric model", "Nature of anatomy", "Theory of gravity", "Calculus"}
    };

    private String mCorrectAnswers[] = {
        "Italy",
        "Rome and Greece",
        "Michelangelo",
        "The town he was from",
        "The Medici’s",
        "Machiavelli",
        "Proportions of the body",
        "Rebirth",
        "Protestantism",
        "Heliocentric model"
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
