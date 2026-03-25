// Name = Akshat Rastogi
// Class = CSE 11
// Roll No. = 2400320100133

// Create a package named Mathematics and add a class Matrix with methods to add and 
// subtract matrices. Write a Java program importing the Mathematics package and use the classes defined in it.

import Mathematics.Matrix;
public class Experiment_16 {
    public static void main(String[] args) {
        int[][] a = {{10, 20}, {30, 40}};
        int[][] b = {{5, 5}, {10, 10}};

        Matrix m1 = new Matrix(2, 2, a);
        Matrix m2 = new Matrix(2, 2, b);

        System.out.println("Matrix 1:");
        m1.display();

        System.out.println("\nMatrix 2:");
        m2.display();

        System.out.println("\nResult of Addition:");
        Matrix sum = Matrix.add(m1, m2);
        if (sum != null) sum.display();

        System.out.println("\nResult of Subtraction:");
        Matrix diff = Matrix.subtract(m1, m2);
        if (diff != null) diff.display();
    }
} /* OUTPUT

    Matrix 1:
    10 20 
    30 40 

    Matrix 2:
    5 5
    10 10

    Result of Addition:
    15 25
    40 50

    Result of Subtraction:
    5 15
    20 30
*/