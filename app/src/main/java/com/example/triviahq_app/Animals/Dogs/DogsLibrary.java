package com.example.triviahq_app.Animals.Dogs;

public class DogsLibrary {

    public String mQuestions[] = {
            "According to the AKC, what dog breed has been registered the most since 1991?",
            "What's the name of the dog that first traveled into space?",
            "What fictional dog is based on Charles Schulz's childhood dog named Spike?",
            "The longest living dog was a Australian Cattle Dog named ___.",
            "A dog's sense of smell is how much better than a human's?",
            "What is the fear of dogs called?",
            "Who was the first dog superstar?",
            "What is the Queen of England's favorite dog breed?",
            "Dog's sweat glands are located where?",
            "What type of nutrient is NOT necessary in a dog's diet?",
            "What is the most common dietary problem suffered by dogs in the US?",
            "Which of these dogs were bred to hunt rabbits in packs?",
            "Which of the following is NOT a vaccine against a canine disease?",
            "A housebroken dog is suddenly urinating in the house. What could this mean?",
            "Dogs who eat this may become very ill from alcohol poisoning.",


    };

    public String mChoices[][] = {
            {"German Shepard", "Beagle", "Labrador", "Siberian Husky"},
            {"Laika", "Belka", "Strelka", "Apollo"},
            {"Dogmeat", "Snoopy", "Clifford", "Pluto"},
            {"Bluey", "Max", "Coco", "Sopia"},
            {"100","1000","10100","10000"},
            {"Anthrophobia","Cynophobia","Elurophobia","Mysophobia"},
            {"Lassie","Rin Tin Tin","Marley","Air Bud"},
            {"Collie","Beagle","Corgi","English Bulldog"},
            {"Tongue","Paws","Ears","Neck"},
            {"Carbohydrate","Protein","Fatty Acids","Fat"},
            {"Allergies","Pancreatitis","Obesity","Cancer"},
            {"Dachshund","Whippet","Greyhound","Beagle"},
            {"Rabies","FeLV","Parvovirus","Distemper"},
            {"Bladder Infection","Renal Failure","Diabetes","Any of the Above"},
            {"Applesause","Bread Dough","Oatmeal","Grape Jelly"},
    };

    private String mCorrectAnswers[] = {
            "Labrador",
            "Laika",
            "Snoopy",
            "Bluey",
            "10000",
            "Cynophobia",
            "Rin Tin Tin",
            "Corgi",
            "Paws",
            "Carbohydrate",
            "Obesity",
            "Beagle",
            "FeLV",
            "Any of the Above",
            "Bread Dough",
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
