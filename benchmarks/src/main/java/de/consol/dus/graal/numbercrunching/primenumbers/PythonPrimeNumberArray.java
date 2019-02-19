package de.consol.dus.graal.numbercrunching.primenumbers;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Source;

public class PythonPrimeNumberArray extends PolyglotPrimeNumber {

  private static Function<Integer, Number> function;

  static {
    try {
      Source source = getSource("python/primenumbers_array.py", "python");
      getContext().eval(source);
      function = getContext()
          .getBindings("python")
          .getMember("get_nth_prime")
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