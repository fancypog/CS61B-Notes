package Week1;

/** Lecture notes for CS61B  Week 1 */


public class Week1Notes {

    /* 3. Declaring Functions */
    /** Returns the larger one of x and y. */
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }


    public static void main(String[] args) {
        /* 1. Hello World */
        System.out.println("hello world");
        /*
        1. All code in Java must be part of a class.
        2. Delimit the beginning and end of segments of code using {}
        3. All statements in Java must end in a semicolon.
        4. For coe to run public static void main(String[] args) is needed.
        */



        /* 2. Static Typing */
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }

        /*
        1. Before Java variables can be used, they must be declared.
        2. Java variables must have a specific type.
        3. Java variable types can never be changed. (cannot reassign a string to a declared integer)
        4. Types are verified before the code even runs! If there's an error the whole code doesn't run
        (Java is a statically typed language)
        */


        /* 3. Declaring Functions */
        System.out.println(larger(-5, 10));

        /*
        1. Functions must be part of a class in Java.
           A function that is part of a class is called a "method".
           So in Java, all functions are methods.
        2. To define a function in Java, we use "public static".
           There are alternative ways of defining functions.
        3. All parameters of a function must have a declared type,
           and the return value of the function must have a declared type.
        4. Functions in Java return only one value!
        */

    }

}


