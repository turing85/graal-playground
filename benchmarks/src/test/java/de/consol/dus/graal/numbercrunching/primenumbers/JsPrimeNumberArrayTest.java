package de.consol.dus.graal.numbercrunching.primenumbers;

import java.io.IOException;

public class JsPrimeNumberArrayTest extends PrimeNumberTest {

  @Override
  protected JsPrimeNumberArray getFreshInstance() {
    try {
      return new JsPrimeNumberArray();
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(42);
    }
    return null;
  }
}
