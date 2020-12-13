package com.example.triviahq_app.Sports.Basketball;

public class BasketballLibrary {

    public String mQuestions[] = {
            "Who won the only unanimous MVP in NBA History?",
            "What team won the championship in 2020?",
            "Who is the starting center for the Sixers?",
            "Who won most improved player in 2019?",
            "What is the most points scored in a game?",
            "How many championships did Micheal Jordan win?",
            "Who has the record for most points in 1 quarter?",
            "Which team has the most championship wins?",
            "Where was the NBA Bubble in 2020?",
            "Which player is missing part of a finger?",
            "What company makes NBA basketballs?",
            "What is the record for most 3 pointers made in 1 season?",
            "At what age did Kobe Bryant get drafted?",
            "Which player changed his name to Metta World Peace?",
            "Who won the MVP award in 2011?",
    };

    public String mChoices[][] = {
            {"Stephen Curry", "Micheal Jordan", "Lebron James", "Tim Duncan"},
            {"Sixers", "Celtics", "Lakers", "Hornets"},
            {"Ben Simmons", "Dwight Howard", "Nikola Jokic", "Joel Embiid"},
            {"Lonzo Ball", "Pascal Siakam", "Kawhi Leonard", "Georges Niang"},
            {"70","81","100","112"},
            {"2","4","6","9"},
            {"Wilt Chamberlain","Klay Thompson","Gerald Green","James Harden"},
            {"Celtics","Sixers","Lakers","Clippers"},
            {"Philadelphia","Minnesota","Orlando","Houston"},
            {"Gerald Green","Ricky Rubio","Luka Doncic","Wes Mathews"},
            {"Wilson","Tissot","Spalding","Baskethoops"},
            {"124","78","378","402"},
            {"17","18","19","20"},
            {"James Harden","Ron Artest","Reggie Miller","Al Jefferson"},
            {"Derrick Rose","Steph Curry","Lebron James","Al Horford"},
    };

    private String mCorrectAnswers[] = {
            "Stephen Curry",
            "Lakers",
            "Joel Embiid",
            "Pascal Siakam",
            "100",
            "6",
            "Klay Thompson",
            "Celtics",
            "Orlando",
            "Gerald Green",
            "Spalding",
            "402",
            "17",
            "Ron Artest",
            "Derrick Rose",
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
