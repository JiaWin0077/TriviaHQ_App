package com.example.triviahq_app.Sports.Hockey;

public class HockeyLibrary {

    public String mQuestions[] = {
            "Who has the all-time most points in the NHL?",
            "What is the diameter(inches) of a hockey puck?",
            "What year was the offsides rule introduced by the NHL?",
            "What is a hockey puck sometimes called?",
            "The Stanley Cup has been used as a _______",
            "Who is the only NHL player that was suspended for life?",
            "Which No. 1 overall draft pick refused to play for Quebec Nordiques?",
            "Who is the youngest NHL captain to ever hoist the Stanley Cup?",
            "What was the longest shootout in NHL history?",
            "Who is the oldest man ever to coach an NHL game?",
            "Which player once ripped off a fan's shoe and beat him with it?",
            "What did Florida Panthers fans throw on the ice during the 1995-96 season?",
            "Which NHL team once drafted a player that didn't exist?",
            "Which player won NHL Rookie of the Year at age 31?",
            "Which NHL team was named after a Disney movie?",
    };

    public String mChoices[][] = {
            {"Sidney Crosby", "Jaromir Jagr", "Wayne Gretzky", "Mark Messier"},
            {"3", "5", "10", "12"},
            {"1950", "1915", "1920", "1930"},
            {"Wafer", "Cookie", "Pretzel", "Biscuit"},
            {"Cereal Bowl","Baptismal Font","Toilet","All of these"},
            {"Eddie Shore","Bill Coutu","Ted Green","Raffi Torres"},
            {"Mats Sundan","Owen Nolan","Mike Foligno","Eric Lindros"},
            {"Sidney Crosby","Jonathon Toews","Connor McDavid","Wayne Simmonds"},
            {"18 rounds","16 rounds","20 rounds","14 rounds"},
            {"Scotty Bowman","Art Ross","Al Arbour","Glenn Sather"},
            {"Martin St Louis","Adam Oates","Dino Ciccarelli","Joel Otto"},
            {"Rats","Lobsters","Fish","Chicken Wings"},
            {"Penguins","Sabres","Flames","Flyers"},
            {"Evgeni Malkin","Jim McFadden","Tony Esposito","Sergei Makarov"},
            {"Flyers","Penguins","Ducks","Coyotes"},
    };

    private String mCorrectAnswers[] = {
            "Wayne Gretzky",
            "3",
            "1930",
            "Biscuit",
            "All of these",
            "Bill Coutu",
            "Eric Lindros",
            "Wanye Gretzky",
            "20 rounds",
            "Al Arbour",
            "Dino Ciccarelli",
            "Rats",
            "Sabres",
            "Sergei Makarov",
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
