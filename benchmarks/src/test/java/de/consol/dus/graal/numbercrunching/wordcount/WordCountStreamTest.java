package de.consol.dus.graal.numbercrunching.wordcount;

public class WordCountStreamTest extends WordCountTest {

  @Override
  public WordCount getFreshInstance(String... content) {
    return WordCountStream.of(content);
  }
}
