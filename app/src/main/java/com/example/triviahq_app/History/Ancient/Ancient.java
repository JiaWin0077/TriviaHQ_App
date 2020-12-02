package com.example.triviahq_app.History.Ancient;

public class Ancient {

    public String mQuestions[] = {
            "The ancient Roman constructed which famous structure in the modern-day United Kingdom?",
            "The ancient Egyptian god of the dead who was known for having a canine head is called what?",
            "A famous great library, which was considered one of the most impressive in the ancient world but unfortunately was burned down was built in which ancient city?",
            "The ancient Greek city of Sparta was well known for its what?",
            "Before becoming an Empire, the ancient civilization of Rome’s system of government was originally what?",
            "On what island did ancient Greek civilization originate?",
            "What was the first capital of ancient Egypt that shares its name with a city in the USA?",
            "How was the ancient Roman city of Pompeii destroyed?",
            "Who was the famous ancient conqueror that originated from Macedon?",
            "What was the capital city of the Aztec society?"
    };

    public String mChoices[][] = {
            {"Hadrian's Wall", "The Hanging Gardens", "The Tower of London", "The Pantheon"},
            {"Ra", "Het", "Shiva", "Anubis"},
            {"Athens", "Alexandria", "Rhodes", "Rome"},
            {"Mathematicians", "Philosophers", "Warriors", "Sailors"},
            {"A True Democracy", "A Republic", "A Monarchy", "It was always an Empire"},
            {"Cyprus", "Sicily", "Crete", "Madagascar"},
            {"Memphis", "Baltimore", "Philadelphia", "Miami"},
            {"An Invading Army", "An Earthquake", "A Tsunami", "A Volcano"},
            {"Alexander the Great", "Julius Ceaser", "Ghengis Khan", "Hannibal"},
            {"Quetzalcoatl", "Machu Picchu", "Yucatan", "Tenochtitlan"}

    };

    private String mCorrectAnswers[] = {
            "Hadrian’s Wall",
            "Anubis",
            "Alexandria",
            "Warriors",
            "A Republic",
            "Crete",
            "Memphis",
            "Volcano",
            "Alexander the Great",
            "Tenochtitlan"
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