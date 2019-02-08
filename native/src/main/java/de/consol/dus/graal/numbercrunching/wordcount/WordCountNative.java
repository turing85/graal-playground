package de.consol.dus.graal.numbercrunching.wordcount;

import de.consol.dus.graal.numbercrunching.AbstractNative;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class WordCountNative extends AbstractNative {

  public static final String PATH = "wordCount/le_grand_cyrus.txt";

  private final WordCount wordCount;

  protected abstract WordCount getFreshInstance(String... content);

  public WordCountNative() throws IOException {
    StringBuilder builder = new StringBuilder();
    try (
        BufferedInputStream is =
            new BufferedInputStream(ClassLoader.getSystemClassLoader().getResourceAsStream(PATH));
        BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
      String line = reader.readLine();
      while (line != null) {
        builder.append(line);
        line = reader.readLine();
      }
    }
    wordCount = getFreshInstance(builder.toString());
  }

  @Override
  public void execute() {
    wordCount.count();
  }
}
