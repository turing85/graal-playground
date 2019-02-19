package de.consol.dus.graal.numbercrunching.wordcount;

public class WordCountIterativeJMH extends WordCountJMH {

  @Override
  protected WordCountIterative getFreshInstance(String... content) {
    return WordCountIterative.of(content);
  }
}