package com.example.triviahq_app.History.Modern;

public class Modern{

    public String mQuestions[] = {
        "What incident in 1962 nearly led to a nuclear confrontation between the U.S. and Russia?",
        "The second man to walk on the moon was who?",
        "During World War II, on what day did D-Day, the Allied invasion of German occupied Europe, occur?",
        "Which popular fast food chain restaurant was first opened in 1955?",
        "Who assassinated Robert Kennedy in Los Angeles, California in 1968?",
        "In 1999, Boris Yeltsin resigned as President of Russia, who replaced him?",
        "What was the name of the treaty that ended World War I?",
        "World War II was fought between the Allied Powers and the what?",
        "Which of these countries was not a part of the USSR?",
        "What major event is considered to be the end of the Cold War?"
    };

    public String mChoices[][] = {
            {"Bay of Pigs Invasion", "Launch of Sputnik", "Start of the Vietnam War", "Cuban Missile Crisis"},
            {"Alan Shepard", "Buzz Aldrin", "Yuri Gagarin", "Neil Armstrong"},
            {"December 7, 1941", "September 30, 1939", "June 6, 1944", "July 15, 1942"},
            {"Pizza Hut", "McDonald's", "Wendy's", "Taco Bell"},
            {"Lee Harvey Oswald", "John Wilkes Booth", "Sirhan Sirhan", "Unknown"},
            {"Vladimir Putin", "Nikita Khrushchev", "Mikhail Gorbachev", "Vladimir Lenin"},
            {"Treaty of Paris", "Treaty of London", "Treaty of Berlin", "Treaty of Versailles"},
            {"Axis Powers", "Central Powers", "League of Nations", "USSR"},
            {"Ukraine", "Switzerland", "Belarus", "Estonia"},
            {"Soviet war in Afghanistan", "Iran Hostage Crisis", "Fall of the Berlin Wall", "US war in Grenada"}
    };

    private String mCorrectAnswers[] = {
        "Cuban Missile Crisis",
        "Buzz Aldrin",
        "June 6, 1944",
        "McDonald's",
        "Sirhan Sirhan",
        "Vladimir Putin",
        "Treaty of Versailles",
        "Axis Powers",
        "Switzerland",
        "Fall of the Berlin Wall"
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