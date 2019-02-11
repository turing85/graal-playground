package de.consol.dus.graal.numbercrunching.fibonacci;

public class PythonFibonacciRecursiveTest extends FibonacciTest {

  @Override
  protected PythonFibonacciRecursive getFreshInstance() {
    return new PythonFibonacciRecursive();
  }
}