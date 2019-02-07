package de.consol.dus.graal.numbercrunching.wordcount;

import java.util.Arrays;
import java.util.HashMap;

public abstract class WordCount {
  private final String content;

  protected WordCount(String... content) {
    StringBuilder builder = new StringBuilder();
    Arrays.stream(content)
        .forEach(builder::append);
    this.content = builder.toString();
  }

  public String getContent() {
    return content;
  }

  abstract public HashMap<String, Long> count();
}