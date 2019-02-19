package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Source;

class PythonFibonacciRecursive extends PolyglotFibonacci {

  private static Function<Integer, Number> function;

  static {
    try {
      Source source = getSource("python/fibonacci_recursive.py", "python");
      getContext().eval(source);
      function = getContext()
          .getBindings("python")
          .getMember("fibonacci")
          .as(Function.class);
    } catch (IOException e) {
      System.exit(42);
    }
  }

  @Override
  public long calculateNthFibonacci(int n) {
    return function.apply(n).longValue();
  }
}