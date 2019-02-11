package de.consol.dus.graal.numbercrunching.primenumbers;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

public class PythonPrimeNumberArray implements PrimeNumber {

  private static Function<Integer, Number> function;

  static {
    try {
      Context context = Context.create();
      Source jsSource = Source
          .newBuilder(
              "python",
              ClassLoader.getSystemResource("python/primenumbers_array.py"))
          .build();
      context.eval(jsSource);
      function = context
          .getBindings("python")
          .getMember("fibonacci")
          .as(Function.class);
    } catch (IOException e) {
      System.exit(42);
    }
  }

  @Override
  @SuppressWarnings("unchecked")
  public long getNthPrime(int n) {
    return function.apply(n).longValue();
  }
}
