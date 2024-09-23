# CS61B-Notes
[CS 61B Spring 2024 Home Page](https://sp24.datastructur.es)

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
4. Arrays of Object
   1) Use the new keyword to create the array and specify the size of the array
   2) Use new for each object to put in the array
   ```java
   /** Create an array od Dogs of size 2 */
   Dog[] dogs = new Dog[2];
   dogs[0] = new Dog(8);
   dogs[1] = new Dog(20);
   dogs[0].makeNoise();
   ```
5. Static vs Non-static
   1) Static methods should be accessed by Class
   2) Non-static methods should be accessed by individual instances

6. References (Pointers)
   1) Example: java.lang.NullPointerException ([Visualisation](https://goo.gl/HLzN6s))
   ```java
      /** Example java.lang.NullPointerException */
      /** Visualiser: goo.gl/HLzN6s */
      
      public class DogLoop {
      public static void main(String[] args) {
      Dog smallDog = new Dog(5);
      Dog mediumDog = new Dog(25);
      Dog hugeDog = new Dog(150);
      
              Dog[] manyDogs = new Dog[4];
              manyDogs[0] = smallDog;
              manyDogs[1] = mediumDog;
              manyDogs[2] = new Dog(130);
      
              int i = 0;
              while (i < manyDogs.length) {
                  Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
                  i += 1;
              }
          }
      }
      
   ```
   **Week 2 Lecture 3**
   1. 8 primitive data types of Java are pass by value
      1) These types are: byte, short, int, long, float, double, boolean and char
      2) A copy of an actual parameter's value is made in memory.
      y = x copies all the bits from x into y. Variables int y and int x are stored in different addresses in memory
   2. Everything else, including arrays, is pass by reference
      1) 

