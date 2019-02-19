package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Source;

class JsFibonacciRecursive extends PolyglotFibonacci {

  private static Function<Integer, Number> function;

  static {
    try {
      Source source = getSource("js/fibonacci.recursive.js", "js");
      getContext().eval(source);
      function = getContext()
          .getBindings("js")
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