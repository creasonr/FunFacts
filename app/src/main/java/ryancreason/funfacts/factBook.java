package ryancreason.funfacts;

import java.util.Random;

/**
 * Created by Creason_C on 12/31/14.
 */
public class factBook {
    // Member variables (properties about the object)
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Treehouse is not actually in a tree."};
    // Method (abilities: things the object can do)
    public String getFact() {
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        return fact;
    }
}
