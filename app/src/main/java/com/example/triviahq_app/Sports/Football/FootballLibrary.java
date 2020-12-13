package com.example.triviahq_app.Sports.Football;

public class FootballLibrary {

    public String mQuestions[] = {
            "Which player was drafted 1st overall in the 2020 NFL Draft?",
            "What is a football made out of?",
            "Who had the most receptions in the 2019-2020 season?",
            "Who won the Superbowl in 2017?",
            "How many Superbowls has Tom Brady won?",
            "What team won 3 Super Bowls in the 1990s?",
            "What was the only team that beat the Jaguars in 1999?",
            "Which NFL player legally changed his name to match his jersey number?",
            "What team drafted Brett Favre?",
            "What year was the sudden-death overtime period adopted by the NFL?",
            "How many weeks did the regular NFL season last in 1992?",
            "What is the record for most TD Passes thrown in a season?",
            "How many points is a safety?",
            "Which player played in both the NFL and MLB?",
            "Who is the oldest active player in the NFL?",
    };

    public String mChoices[][] = {
            {"Tom Brady", "Trevor Lawrence", "Sam Darnold", "Joe Burrow"},
            {"Silk", "Pigskin", "Leather", "Cotton"},
            {"Larry Fitzgerald", "Deandre Hopkins", "Davante Adams", "Micheal Thomas"},
            {"Eagles", "Patriots", "Cowboys", "Chiefs"},
            {"3","6","5","4"},
            {"Broncos","49ers","Cowboys","Bills"},
            {"Titans","Ravens","Browns","Steelers"},
            {"Saquon Barkley","Nick Chubb","Chad Johnson","Terell Owens"},
            {"Packers","Falcons","Vikings","Rams"},
            {"1974","2012","2001","1982"},
            {"16","17","18","19"},
            {"49","55","27","38"},
            {"2","3","4","7"},
            {"Micheal Jordan","Mookie Betts","Bo Jackson","OJ Simpson"},
            {"Peyton Manning","Drew Brees","Frank Gore","Tom Brady"},
    };

    private String mCorrectAnswers[] = {
            "Joe Burrow",
            "Leather",
            "Micheal Thomas",
            "Eagles",
            "6",
            "Cowboys",
            "Titans",
            "Chad Johnson",
            "Falcons",
            "1974",
            "18",
            "55",
            "2",
            "Bo Jackson",
            "Tom Brady",
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
