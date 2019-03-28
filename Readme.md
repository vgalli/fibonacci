# Print Fibonacci sequence

Note:  I left a copy of the built artifact in the build folder of the project. It is used by the run.bat or run.sh

# Build 
I made the choice to use maven, it is using a standardize project structure and automatically runs the tests (if not skipped)

`mvn clean install`

# Execute
Usage: run.sh or run.bat [n]
n: First N numbers to display

n is a mandatory parameter.

# File inventory
build/fibonacci-app-1.0-SNAPSHOT.jar : copy of built artifact obtain by running : `mvn install`

src/main/java/com/vgalli/Fibonacci.java : Main class. As it is a relativly simple project I kept the Fibonacci sequence code and the main class in one class

src/test/java/com/vgalli/test/FibonacciTest.java : Fibonacci sequence unit test, using @Parametrized test

src/test/java/com/vgalli/test/ParametersTest.java : Unit tests program parameters

output.txt: Run output

pom.xml : maven configuration file, contains dependencies, artifact name and many other options.

run.bat : windows bat file. usafe run.bat 100

run.sh : linux/mac/unix script file. usafe run.sh 100


