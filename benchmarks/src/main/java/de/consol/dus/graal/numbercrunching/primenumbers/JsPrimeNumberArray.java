package de.consol.dus.graal.numbercrunching.primenumbers;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Source;

public class JsPrimeNumberArray extends PolyglotPrimeNumber {

  private static Function<Integer, Number> function;

  static {
    try {
      Source source = getSource("js/primenumbers.array.js", "js");
      getContext().eval(source);
      function = getContext()
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