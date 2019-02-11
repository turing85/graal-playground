package de.consol.dus.graal.numbercrunching.fibonacci;

public class PythonFibonacciIterativeTest extends FibonacciTest {

  @Override
  protected PythonFibonacciIterative getFreshInstance() {
    return new PythonFibonacciIterative();
  }
}