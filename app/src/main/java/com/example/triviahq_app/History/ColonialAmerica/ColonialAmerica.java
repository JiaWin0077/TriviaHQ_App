package com.example.triviahq_app.History.ColonialAmerica;

public class ColonialAmerica {

    public String mQuestions[] = {
        "Which of these states were not one of the original Thirteen Colonies?",
        "Who designed the United States of America’s original flag?",
        "What was considered to be the bloodiest battle of the American Revolution?",
        "What was the name of the militia that fought against the British at the battles of Lexington and Concord?",
        "What was the name of the Revolutionary fighter that had the nickname, “The Swamp Fox”?",
        "Who was the first person to sign the Declaration of Independence?",
        "Known as the French and Indian War in America, the conflict is referred in the rest of the world as ___.",
        "The first true battle of the French and Indian war occurred where?",
        "Many colonists didn’t want to secede from Great Britain at first, but actually wanted what?",
        "What was the name of the first successful colony in America?"
    };

    public String mChoices[][] = {
            {"Vermont", "Pennsylvania", "Virginia", "Kentucky"},
            {"Molly Pitcher", "Betsy Ross", "Benjamin Franklin", "Martha Washington"},
            {"Battle of Bunker Hill", "Battle of Lexington", "Siege of Ticonderoga", "Battle of Ridgefield"},
            {"The Patriots", "The Minutemen", "The Federalists", "The Jaegers"},
            {"John Adams", "Nathan Hale", "Francis Marion", "Stephen Clarke"},
            {"Benjamin Franklin", "Samuel Adams", "Thomas Jefferson", "John Hancock"},
            {"The Seven Years War", "The Boer War", "The Colonial War", "The North American War"},
            {"Quebec", "Fort Duquesne", "Fort Cumberland", "Fort Necessity"},
            {"Lower Taxes", "Representation in Parliament", "Lower Tariffs", "Better Trade Agreements"},
            {"Jamestown", "Roanoke", "Boston", "Salem"}
    };

    private String mCorrectAnswers[] = {
        "Kentucky",
        "Betsy Ross",
        "Battle of Bunker Hill",
        "The Minutemen",
        "Francis Marion",
        "John Hancock",
        "The Seven Years War",
        "Fort Necessity",
        "Representation in Parliament",
        "Jamestown"
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