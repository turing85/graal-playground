package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Source;

public class CFibonacciRecursive extends PolyglotFibonacci {

  private static Function<Integer, Long> function;

  static {
    try {
      Source source = getSource("c/fibonacci_recursive.bc", "llvm");
      getContext().eval(source);
      function = getContext()
          .getBindings("llvm")
          .getMember("fibonacci")
          .as(Function.class);
    } catch (IOException e) {
      System.exit(42);
    }
  }

  @Override
  public long calculateNthFibonacci(int n) {
    return function.apply(n);
  }
}