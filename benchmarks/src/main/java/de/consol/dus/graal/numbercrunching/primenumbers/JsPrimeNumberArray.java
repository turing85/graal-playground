package de.consol.dus.graal.numbercrunching.primenumbers;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

public class JsPrimeNumberArray implements PrimeNumber {

  private final Context context;
  private final Source jsSource;

  public JsPrimeNumberArray() throws IOException {
    context = Context.create();
    jsSource = Source
        .newBuilder(
            "js",
            ClassLoader.getSystemResource("js/primenumber.array.js"))
        .build();
  }

  @Override
  @SuppressWarnings("unchecked")
  public long getNthPrime(int n) {
    context.eval(jsSource);
    Function<Integer, Number> function = context
        .getBindings("js")
        .getMember("getNthPrime")
        .as(Function.class);
    return function.apply(n).longValue();
  }
}
