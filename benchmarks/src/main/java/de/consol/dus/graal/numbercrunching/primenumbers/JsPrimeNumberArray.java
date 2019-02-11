package de.consol.dus.graal.numbercrunching.primenumbers;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

public class JsPrimeNumberArray implements PrimeNumber {

  private static Function<Integer, Number> function;

  static {
    try {
      Context context = Context.create();
      Source jsSource = Source
          .newBuilder(
              "js",
              ClassLoader.getSystemResource("js/primenumber.array.js"))
          .build();
      context.eval(jsSource);
      function = context
          .getBindings("js")
          .getMember("getNthPrime")
          .as(Function.class);
    } catch (IOException e) {
      System.exit(42);
    }
  }

  @Override
  public long getNthPrime(int n) {
    return function.apply(n).longValue();
  }
}
