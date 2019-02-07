package de.consol.dus.graal.numbercrunching.wordcount;

import de.consol.dus.graal.AbstractBenchmark;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.openjdk.jmh.annotations.Param;

public class WordCountStreamJMH extends AbstractBenchmark {

  @Param("wordCount/le_grand_cyrus.txt")
  private String pathToInput;

  private WordCountStream wordCount = null;

  @Override
  public void setup() throws IOException {
    if (wordCount == null) {
      StringBuilder builder = new StringBuilder();
      try (
          BufferedInputStream is = new BufferedInputStream(ClassLoader.getSystemClassLoader()
              .getResourceAsStream(pathToInput));
          BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
        String line = reader.readLine();
        while (line != null) {
          builder.append(line);
          line = reader.readLine();
        }
      }
      wordCount = WordCountStream.of(builder.toString());
    }
  }

  @Override
  public void tearDown() {}

  @Override
  protected void execute() {
    wordCount.count();
  }
}
