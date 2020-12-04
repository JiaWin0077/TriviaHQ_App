package com.example.triviahq_app.Mythology.Celtic;

public class Celtic {
    public String Questions[] = {
            "Who was the queen of Tír na nÓg",
            "Who is the Welsh God of the Sea?",
            "Who is the Irish God of Youth, Love and Poetic Inspiration?",
            "Who is the Irish God of War?",
            "Who is the Gaulish God of Smiths?",
            "Who, or what, is the Celtic personification of Death?",
            "Who is the Irish God of Speech and Language",
            "What is the Irish Land of Youth?",
            "Who is the Irish God of the Underworld?",
            "Who is the Gaulish Goddess of Horses?"

    };

    public String Choices[][] = {
            {"Niamh", "Aranrhod", "Rosmerta", "Arawn"},
            {"Lir", "Sucellos", "Llyr", "Selkie"},
            {"Neit", "Aengus", "Llyr", "Selkie"},
            {"Rosmerta", "Arawn", "Aengus", "Neit"},
            {"Neit", "Gobannos", "Bucca", "Aengus"},
            {"Belanos", "Gwydyon", "Lir", "Breton"},
            {"Ogma", "Grannos", "Annwn", "Arawn"},
            {"Heaven", "Tír na nÓg", "Hades", "Hel"},
            {"Arawn", "Kelpie", "Aengus", "Aed"},
            {"Epona", "Secretariat", "Roach", "Bojack Horseman"}
    };

    private String CorrectAnswers[] = {
            "Niamh",
            "Llyr",
            "Aengus",
            "Neit",
            "Gobannos",
            "Breton",
            "Ogma",
            "Tír na nÓg",
            "Aed",
            "Epona"
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
