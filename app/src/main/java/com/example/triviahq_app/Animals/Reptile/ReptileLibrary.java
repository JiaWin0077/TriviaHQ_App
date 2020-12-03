package com.example.triviahq_app.Animals.Reptile;

public class ReptileLibrary {

    public String mQuestions[] = {
            "How many different species of reptile are there?",
            "Where do crocodiles release excess heat?",
            "How many species of snakes are venomous?",
            "What do pit vipers mostly eat?",
            "Reptiles are ectothermic. What does this mean?",
            "Chameleons can predominantly be found on what continent?",
            "What country has the deadliest snakes in the world?",
            "What's the most venomous snake in the world?",
            "What's the world's largest living reptile?",
            "Which of the following structures is absent in reptiles?",
            "Which of the followings is not a lizard?",
            "The substance which covers the bones of the reptiles is:",
            "Snakes belongs to what subclass?",
            "The top of a turtle's shell is called the:",
            "What kind of eggs do reptiles lay?",
    };

    public String mChoices[][] = {
            {"4,000", "11,000", "5,000", "8,000"},
            {"Mouth", "Belly", "Feet", "Tail"},
            {"100", "500", "149", "870"},
            {"Spinach", "Rodents", "Fish", "Birds"},
            {"Warm-blooded","Cold-Blooded","Scaly","Scary"},
            {"Africa","Antarctica","Asia","Europe"},
            {"Canada","Brazil","Australia","India"},
            {"King Cobra","Death Adder","Black Mamba","Inland Taipan"},
            {"Komodo Dragon","Crocodile","Green Sea Turtle","Bearded Dragon"},
            {"Trachea","Pharynx","Vocal cords","Larynx"},
            {"Gecko","Tautra","Chameleon","Iguana"},
            {"Calcium", "Keratin", "Chitin", "Phosphorus"},
            {"Anapsida","Archosauria","Lepidosauria","Synapsids"},
            {"Carapace","Ventricle","Plastron","Amnion"},
            {"Brown Eggs","Amniotic Eggs","Anamniotic Eggs","Hard-shelled Eggs"},
    };

    private String mCorrectAnswers[] = {
            "8,000",
            "Mouth",
            "500",
            "Rodents",
            "Cold-Blooded",
            "Africa",
            "Australia",
            "Inland Taipan",
            "Crocodile",
            "Vocal cords",
            "Tautra",
            "Keratin",
            "Lepidosauria",
            "Carapace",
            "Amniotic Eggs",
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
