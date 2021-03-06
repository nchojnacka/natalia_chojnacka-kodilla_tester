package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();
    public PartOfSpeech partOfSpeech;

    public void addWord(String polishWord, EnglishWord englishWord) {
            List<EnglishWord> englishWords =
                    dictionary.getOrDefault(polishWord, new ArrayList<>());
            englishWord.add(englishWord);
            dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        return Collections.emptyList();
    }

    public int size() {
        return dictionary.size();
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
        return result;
    }
}
