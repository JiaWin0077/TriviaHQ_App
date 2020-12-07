package com.example.triviahq_app.Mythology.Abrahamic;

public class Abrahamic {
    public String Questions[] = {
            "What symbol typically denotes Christianity?",
            "What is the religious text of the Islamic faith?",
            "What is Jesus in the Islamic faith?",
            "Which of the following is not an Abrahamic religion",
            "Judaism developed among the ancient _____",
            "Jesus is considered the central figure of Christianity, what religion did he practice?",
            "Jesus' death is considered by Christian scripture to save mankind from original sin. Which group was responsible for his death?",
            "Who is considered the father of the Jewish religion?",
            "Jesus Christ was born in _____",
            "Jesus recruited twelve close followers to preach his teachings known as _____"

    };

    public String Choices[][] = {
            {"Star of David", "Crucifix", "Crescent and Star", "The Bible"},
            {"The Torah", "The Bible", "Psalms", "The Quran"},
            {"The Messiah", "A Prophet", "The Son of God", "The King of Rome"},
            {"Hinduism", "Islam", "Judaism", "Christianity"},
            {"Greeks", "Hebrews", "Indians", "Christians"},
            {"Christianity", "Buddhism", "Islam", "Judaism"},
            {"The Israelites", "The Romans", "The Greeks", "The Macedonians"},
            {"Solomon", "Judah", "Abraham", "Moses"},
            {"Sparta", "Bethlehem", "Athens", "Mecca"},
            {"Apostles", "Patriarchs", "Zealots", "Messiahs"}
    };

    private String CorrectAnswers[] = {
            "Crucifix",
            "The Quran",
            "A Prophet",
            "Hinduism",
            "Hebrews",
            "Judaism",
            "The Romans",
            "Abraham",
            "Bethlehem",
            "Apostles"
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
