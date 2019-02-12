package de.consol.dus.graal.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Function;
import org.graalvm.polyglot.Context;
import org.openjdk.jmh.annotations.Param;

@SuppressWarnings("unchecked")
public class JsSortIntArrayJMH /* extends SortJMH */ {

  private static final Function<int[], int[]> arraySorter =
      Context.create("js").eval("js", "(array) => array.sort()").as(Function.class);


  @Param("10")
  private int size;

  private int[] array;
  private final Random rng = new Random();

  public int getSize() {
    return size;
  }

  // @Override
  public void setup() {
    final int n = getSize();
    array = new int[n];

    for (int i = 0; i < n; ++i) {
      array[i] = i;
    }

    shuffle(array);
  }

  private void shuffle(int[] array) {
    for (int i = array.length; i > 0; --i) {
      int fromIndex = i - 1;
      int toIndex = rng.nextInt(i);
      int tmp = array[fromIndex];
      array[fromIndex] = array[toIndex];
      array[toIndex] = tmp;
    }
  }

  // @Override
  public void tearDown() {
    System.out.println(Arrays.toString(array));
    array = null;
  }

  // @Override
  @SuppressWarnings("unchecked")
  public void sort() {
    arraySorter.apply(array);
  }
}