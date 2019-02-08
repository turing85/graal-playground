package de.consol.dus.graal.sorting;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;
import org.openjdk.jmh.annotations.Param;

public class SortStringArrayJMH extends SortJMH {

  @Param("524288")
  private int size;

  @Param("128")
  private int bytesPerString;

  private String[] array;
  private final Random rng = new Random();

  public int getSize() {
    return size;
  }

  public int getBytesPerString() {
    return bytesPerString;
  }

  @Override
  public void setup() {
    final int n = getSize();
    array = new String[n];

    for (int i = 0; i < n; ++i) {
      byte[] bytes = new byte[getBytesPerString()];
      rng.nextBytes(bytes);
      array[i] = new String(bytes, Charset.forName("UTF-8"));
    }
  }

  @Override
  public void tearDown() {
    array = null;
  }

  @Override
  public void sort() {
    Arrays.sort(array);
  }
}