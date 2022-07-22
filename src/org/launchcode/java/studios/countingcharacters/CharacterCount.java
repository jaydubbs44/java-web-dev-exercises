package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
public class CharacterCount {
    public static void main(String[] args) {
        String manyWords = "If the product of two terms is zero then common sense says at least " +
                "one of the two terms has to be zero to start with. So if you move all the terms " +
                "over to one side, you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";

        String[] charactersInManyWords = manyWords.split("");
        HashMap<String, Integer> characterCounts = new HashMap<>();
        for (String item : charactersInManyWords){
            if (!characterCounts.containsKey(item)){
                characterCounts.put(item, 1);
            } else if (characterCounts.containsKey(item)){
                characterCounts.put(item, characterCounts.get(item)+1);
            }
        }
      for (Map.Entry<String, Integer> character : characterCounts.entrySet()){
          System.out.println(character.getKey() + ": " + character.getValue());
      }
    }
}
