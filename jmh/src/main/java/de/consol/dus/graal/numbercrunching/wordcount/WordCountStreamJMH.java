package de.consol.dus.graal.numbercrunching.wordcount;

public class WordCountStreamJMH extends WordCountJMH {

  @Override
  protected WordCountStream getFreshInstance(String... content) {
    return WordCountStream.of(content);
  }
}