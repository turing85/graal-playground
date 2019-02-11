package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

class JsFibonacciRecursive implements Fibonacci {

  private static Function<Integer, Number> function;

  static {
    try {
      Context context = Context.create();
      Source jsSource = Source
          .newBuilder(
              "js",
              ClassLoader.getSystemResource("js/fibonacci.recursive.js"))
          .build();
      context.eval(jsSource);
      function = context
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