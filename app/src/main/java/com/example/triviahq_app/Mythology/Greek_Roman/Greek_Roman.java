package com.example.triviahq_app.Mythology.Greek_Roman;

public class Greek_Roman {
    public String Questions[] = {
            "Arrow-shooting Cupid is the Roman god of love and beauty. Who is his equivalent in Greek mythology?",
            "According to Greek mythology, Gaia was the first goddess -- but what was the first thing to exist?",
            "Who was the king of all the Greek gods?",
            "Which Roman god is the god of beginnings?",
            "What were the 12 major Roman deities -- six gods and six goddess -- known as?",
            "What's the name of the ancient Roman temple dedicated to the major deities?",
            "Where did the council of 12 Greek gods meet?",
            "Who were the \"hounds\" of Zeus?",
            "Who was condemned to push a boulder uphill, only to have to watch it roll back down?",
            "What type of animal did Zeus turn the king of Attica, Periphas, into, according to Greek mythology?"

    };

    public String Choices[][] = {
            {"Atlas", "Eros", "Orion", "Ra"},
            {"Chaos", "Minerva", "Pele", "Titans"},
            {"Horus", "Jupiter", "Odin", "Zeus"},
            {"Anansi", "Pan", "Janus", "Sisyphus"},
            {"Amazons", "The Dii Consentes", "The Gigantes", "The Titans"},
            {"Angkor Wat", "Palace of Knossos", "Pantheon", "Stonehenge"},
            {"Machu Picchu", "Mount Everest", "Mount Olympus", "Mount Sinai"},
            {"The Chimera", "The Harpies", "The Phoenix", "The Winged Centaurs"},
            {"Styx", "Sphinx", "Solar", "Sisyphus"},
            {"An eagle", "A faun", "A minotaur", "a unicorn"}
    };

    private String CorrectAnswers[] = {
            "Eros",
            "Chaos",
            "Zeus",
            "Janus",
            "The Dii Consentes",
            "Pantheon",
            "Mount Olympus",
            "The Harpies",
            "Sisyphus",
            "An eagle"
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
