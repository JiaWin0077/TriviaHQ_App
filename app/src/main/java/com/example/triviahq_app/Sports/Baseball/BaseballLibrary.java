package com.example.triviahq_app.Sports.Baseball;

public class BaseballLibrary {

    public String mQuestions[] = {
            "What was specifically designed to be the size and weight of a baseball?",
            "What player holds the record for most stolen bases in a season?",
            "What year did the first recorded baseball game take place?",
            "Who holds the record for most at bats in a season?",
            "What baseball innovation was legalized in 1884?",
            "What player has the longest hitting streak?",
            "Who was the first woman to call a nationally televised MLB playoff game?",
            "How much does a baseball weigh in ounces?",
            "How many baseballs are used during a typical Major League Baseball game?",
            "Which pitcher had no right hand?",
            "The Brooklyn \"Dodgers\" nickname originally referred to dodging ______",
            "What batter claimed the MLB Triple Crown in 2012?",
            "How old was the youngest MLB player?",
            "What color are the \"mile high\" seats at Coors Field?",
            "What were the Kansas City Royals named after?",
    };

    public String mChoices[][] = {
            {"Coffee Mug", "Hand Grenade", "Soup Can", "Walkie Talkie"},
            {"Lou Brock", "Babe Ruth", "Bryce Harper", "Ricky Henderson"},
            {"1749", "1649", "1949", "1812"},
            {"Jimmy Rollins", "Jose Reyes", "Prince Fielder", "Ichiro Suzuki"},
            {"Strikes","Balls","Overhand Pitching","Foul"},
            {"George Sisler","Pete Rose","Joe Dimaggio","Ty Cobb"},
            {"Lauren Shihadi","Alanna Rizzo","Jessica Mendoza","Heidi Watney"},
            {"5.25","12","3","7.5"},
            {"25","50","75","100"},
            {"Guy Hecker","Cole Hamels","Jim Abbott","Stubby Clapp"},
            {"Horse Droppings","Trolleys","Bullets","Bowling Balls"},
            {"Ryan Braun","Chris Davis","Miguel Cabrera","Ryan Howard"},
            {"17","15","19","13"},
            {"Green","Silver","Purple","Red"},
            {"Rodeo","Hotel","Monarchy","School"},
    };

    private String mCorrectAnswers[] = {
            "Hand Grenade",
            "Ricky Henderson",
            "1749",
            "Jimmy Rollins",
            "Overhand Pitching",
            "Joe Dimaggio",
            "Jessica Mendoza",
            "5.25",
            "100",
            "Jim Abbott",
            "Trolleys",
            "Miguel Cabrera",
            "15",
            "Purple",
            "Rodeo",
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
