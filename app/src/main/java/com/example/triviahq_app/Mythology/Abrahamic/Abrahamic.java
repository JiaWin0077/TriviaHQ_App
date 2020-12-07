package com.example.triviahq_app.Mythology.Abrahamic;

public class Abrahamic {
    public String Questions[] = {
            "What symbol typically denotes Christianity?",
            "What is the religious text of the Islamic faith?",
            "What is Jesus in the Islamic faith?",
            "",
            "",
            "",
            "",
            "",
            "",
            ""

    };

    public String Choices[][] = {
            {"Star of David", "Crucifix", "Crescent and Star", "The Bible"},
            {"The Torah", "The Bible", "Psalms", "The Quran"},
            {"The Messiah", "A Prophet", "The Son of God", "The King of Rome"},
            {"Batman", "Robin", "The Riddler", "The Joker"},
            {"Plutonian Man", "Saturn Saber", "Atomizer", "Martian Manhunter"},
            {"The Quantum Realm", "The Phantom Zone", "Asgard", "The BatCave"},
            {"Black Adam", "Shizzle", "Shazam", "The Magician"},
            {"Joe Billy Bob", "The Demon's Head", "The Devil's Maker", "The Devourer"},
            {"Bane", "Kane", "The Joker", "Killer Croc"},
            {"The Darkness", "The League of Assassins", "The League of Bats", "The League of Shadows"}
    };

    private String CorrectAnswers[] = {
            "Crucifix",
            "The Quran",
            "A Prophet",
            "The Joker",
            "Martian Manhunter",
            "The Phantom Zone",
            "Shazam",
            "The Demon's Head",
            "Bane",
            "The League of Assassins"
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
