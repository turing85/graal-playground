package de.consol.dus.graal.numbercrunching.wordcount;

import java.util.HashMap;

public class WordCountIterative extends WordCount {

  private WordCountIterative(String... content) {
    super(content);
  }

  public static WordCountIterative of(String... content) {
    return new WordCountIterative(content);
  }

  @Override
  public HashMap<String, Long> count() {
    HashMap<String, Long> wordCount = new HashMap<>();
    for (String word : getContent().split("[,.!?]?\\s")) {
      word = word.replaceAll("[,.!?]", "");
      if (wordCount.containsKey(word)) {
        wordCount.put(
            word,
            wordCount.get(word) + 1L);
      } else {
        wordCount.put(word, 1L);
      }
    }
    return wordCount;
  }
}