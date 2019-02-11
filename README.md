This module provides a testing playground for the GraalVM.

In submodule `benchmarks`, some benchmarks are implemented. Note that the 
`resources` folder contains some javascript files, which are then used through 
Graal's polyglot capabilities to run from java. Each benchmark is implemented as
standalone function (e.g. in `fibonacci.array.js`) and wrapped to execute it 
directly in javascript (e.g. in `fibonacci.array.starter.js`). The computation 
code, however, is in both implementations exactly the same.

Submodule `jmh` wraps each benchmark in a JMH test. Tests are executed with the 
`SingleShotTime` strategy. Each test consists of 10 warmup iterations and 10
test iterations. Results are reported in Seconds. To execute tests, just execute

    java -jar dus.graal.jmh-1.0-SNAPSHOT.jar
    
If you want to runs only a subset of tests, you can provide a regex matcher as 
command line argument. For example, if you only with to execute fibonacci-tests,
run

    java -jar dus.graal.jmh-1.0-SNAPSHOT.jar "Fibonacci

In submodule `native`, for each benchmark a executable class with some `public 
static void main(String... args)` is created. This mimics the behaviour of the 
JMH test from the `jmh` submodule. Folder `scripts` holds a file
`nativeScript.sh` to compile one native image per benchmark. For this to work, 
it is necessary to export the environment variable `GRAAL_HOME` to some existing
GraalVM. the native images are created within the `target` folder.

If you have questions or would like to contribute, contact me via 
<a href="mailto:marco.bungart@consol.de">marco(dot)bungart(at)consol(dot)de</a>
or <a href="https://twitter.com/turing85">Twitter</a>.