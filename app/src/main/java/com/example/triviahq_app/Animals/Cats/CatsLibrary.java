package com.example.triviahq_app.Animals.Cats;

public class CatsLibrary {

    public String mQuestions[] = {
            "What is the proper term for a group of kittens?",
            "All cats are born with what color eyes?",
            "How many different sounds can a cat make?",
            "What breed of cat has no tail?",
            "Which country has more cats per person than any other country in the world?",
            "What is the largest breed of cat?",
            "What cartoon cat is buddies with a dog named Odie?",
            "How many whiskers does a cat have?",
            "What causes cat allergies?",
            "What is a female cat called?",
            "What is the earliest known ancestor of the modern cat?",
            "How many muscles does a cat have in each ear?",
            "What Cat Goddess did ancient Egyptians worship?",
            "What cat is called the \"tree tiger\" in Indonesia?",
            "What was the name of the first cloned cat?",
    };

    public String mChoices[][] = {
            {"Kindle", "Kettle", "Kine", "Pack"},
            {"Brown", "Blue", "Green", "Yellow"},
            {"100", "20", "10", "50"},
            {"La Perm", "Manx", "Aegean Cat", "Birman"},
            {"Switzerland","United Kingdom","United States","New Zealand"},
            {"Siberian","Maine Coon","Ragamuffin","Ragdoll"},
            {"Tom","Garfield","Simba","Mittens"},
            {"24","14","10","18"},
            {"Dander","Cat Saliva","Urine","All the Above"},
            {"Bitch","Doe","Queen","Dame"},
            {"Proailurus","Rukwalorax","Aeluropuss","Gheerfelis"},
            {"20", "32", "10", "50"},
            {"Bastet","Isis","Horus","Heket"},
            {"Serval","Clouded Leopard","Ocelot","Tiger"},
            {"Max","Boots","Chance","CC"},
    };

    private String mCorrectAnswers[] = {
            "Kindle",
            "Blue",
            "100",
            "Manx",
            "New Zealand",
            "Maine Coon",
            "Garfield",
            "24",
            "All the Above",
            "Queen",
            "Proailurus",
            "32",
            "Bastet",
            "Clouded Leopard",
            "CC",
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
