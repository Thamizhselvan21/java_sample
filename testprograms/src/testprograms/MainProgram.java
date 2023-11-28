package testprograms;

import testprograms.mathoperations.Mathfunctions;

public class MainProgram {
    public static void main(String[] args) {
        // Fibonacci
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < 10; i++) {
            System.out.print(Mathfunctions.fibonacci(i) + " ");
        }
        System.out.println();

        // Factorial
        int num = 5;
        System.out.println("Factorial of " + num + ": " + Mathfunctions.factorial(num));

        // Prime or not
        int primeNum = 11;
        System.out.println(primeNum + " is prime? " + Mathfunctions.isPrime(primeNum));
    }
}