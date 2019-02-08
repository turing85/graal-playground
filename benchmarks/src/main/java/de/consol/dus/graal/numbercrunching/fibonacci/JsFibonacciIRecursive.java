package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

class JsFibonacciIRecursive implements Fibonacci {

  private final Source jsSource;
  private final Context context;

  public JsFibonacciIRecursive() throws IOException {
    context = Context.create();
    jsSource = Source
        .newBuilder(
            "js",
            ClassLoader.getSystemResource("js/fibonacci.recursive.js"))
        .build();
  }

  @Override
  @SuppressWarnings("unchecked")
  public long calculateNthFibonacci(int n) {
    context.eval(jsSource);
    Function<Integer, Number> function = context
        .getBindings("js")
        .getMember("fibonacci")
        .as(Function.class);
    return function.apply(n).longValue();
  }
}