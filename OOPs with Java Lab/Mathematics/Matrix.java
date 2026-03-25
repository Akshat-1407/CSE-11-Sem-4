package Mathematics;

public class Matrix {
    private int rows, cols;
    private int[][] data;

    public Matrix(int rows, int cols, int[][] data) {
        this.rows = rows;
        this.cols = cols;
        this.data = data;
    }
    // Static method to add two matrices
    public static Matrix add(Matrix m1, Matrix m2) {
        if (m1.rows != m2.rows || m1.cols != m2.cols) {
            System.out.println("Error: Matrix dimensions must match for addition.");
            return null;
        }
        int[][] result = new int[m1.rows][m1.cols];
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.cols; j++) {
                result[i][j] = m1.data[i][j] + m2.data[i][j];
            }
        }
        return new Matrix(m1.rows, m1.cols, result);
    }
    // Static method to subtract two matrices
    public static Matrix subtract(Matrix m1, Matrix m2) {
        if (m1.rows != m2.rows || m1.cols != m2.cols) {
            System.out.println("Error: Matrix dimensions must match for subtraction.");
            return null;
        }
        int[][] result = new int[m1.rows][m1.cols];
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.cols; j++) {
                result[i][j] = m1.data[i][j] - m2.data[i][j];
            }
        }
        return new Matrix(m1.rows, m1.cols, result);
    }
    // Method to print the matrix
    public void display() {
        for (int[] row : data) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}