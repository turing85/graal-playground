package de.consol.dus.graal.numbercrunching.primenumbers;

import java.io.IOException;

public class PythonPrimeNumberArrayJMH extends PrimeNumberJMH{

  @Override
  protected PythonPrimeNumberArray getFreshInstance() {
    return new PythonPrimeNumberArray();
  }
}