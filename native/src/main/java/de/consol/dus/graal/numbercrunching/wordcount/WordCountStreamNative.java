package de.consol.dus.graal.numbercrunching.wordcount;

import java.io.IOException;

public class WordCountStreamNative extends WordCountNative {

  public WordCountStreamNative() throws IOException {
    super();
  }

  @Override
  protected WordCountStream getFreshInstance(String... content) {
    return WordCountStream.of(content);
  }

  public static void main(String[] args) throws IOException {
    new WordCountStreamNative().benchmark();
  }
}