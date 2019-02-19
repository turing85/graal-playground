package de.consol.dus.graal.numbercrunching.primenumbers;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Source;

public class RubyPrimeNumberArray extends PolyglotPrimeNumber {

  private static Function<Integer, Number> function;

  static {
    try {
      Source source = getSource("ruby/primenumbers_array.rb", "ruby");
      getContext().eval(source);
      function = getContext()
          .getBindings("ruby")
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