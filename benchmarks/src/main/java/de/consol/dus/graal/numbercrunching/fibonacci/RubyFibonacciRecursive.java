package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Source;

public class RubyFibonacciRecursive extends PolyglotFibonacci{

  private static Function<Integer, Number> function;

  static {
    try {
      Source source = getSource("ruby/fibonacci_recursive.rb", "ruby");
      getContext().eval(source);
      function = getContext()
          .getBindings("ruby")
          .getMember("fibonacci")
          .as(Function.class);
    } catch (IOException exception) {
      System.exit(42);
    }
  }

  @Override
  public long calculateNthFibonacci(int n) {
    return function.apply(n).longValue();
  }
}
