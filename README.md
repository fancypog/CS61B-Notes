# CS61B-Notes
**Week 1 Lecture 1**
1. Java is an object oriented language with strict requirements.
   1) Every .java file has to contain a class declaration.
   2) All code has to be part of a class.
   3) To run a java programme, a main method needs to be defined using
      ```java
      public static void main(String[] args)
2. Java is statically typed
   1) All variables, parameter, and methods must have a declared type.
   2) That type can never change
   3) Expressions also have a type
   4) The compiler checks for type compatability before running the programme (instead of during execution)(upon compiling instead of run-time)
3. Static typing
   
   Merits:
   1) Catches certain types of errors, easier to debug
   2) Type errors can (almost) never occur on the end user's computer
   3) Easier to read and reason the code
   4) Efficient to run (No runtime type checks)
  
   Drawbacks:
   1) verbose
   2) less general (->generics)

**Week 1 Lecture 2**
1. Compilation (linux terminal)
   1) compile: `javac HelloWorld.java`
   2) run: `java HelloWorld`
   3) `cat` to print out the file on terminal: `cat HelloWorld.java`
2. The Process
   1) `HelloWorld.java`
   2) `javac` (Compiler)
   3) `HelloWorld.class` (type-checked java file, pre-chewed for the machine)
   4) `java` (Interpreter)
   5) stuff happens
3. Classes and main method
   1) Every method is associated with some class, to run a class, we must define a main method.
   2) Below is a class without a main method which cannot be run directly
   ```java
   public class Dog {
        public static void makeNoise(){
            System.out.println("Bark!");
       }
   }
   ``` 
   3) Below is a test-drive class, which calls the above method, a method from another class ("Dog")
   ```java
   public class DogLauncher { 
        public static void main(String[] args) {
            Dog.makeNoise();
        }
   } 
   ```
   
