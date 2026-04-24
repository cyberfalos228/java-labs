public class Main {

    public static void runTranspose(MatrixOperations ops, int[][] matrix) {
        System.out.println("Оригінальна матриця:");
        ops.printMatrix(matrix);
        int[][] transposed = ops.transposeMatrix(matrix);
        System.out.println("Транспонована матриця:");
        ops.printMatrix(transposed);
    }

    public static void runMultiply(MatrixOperations ops, int[][] a, int[][] b) {
        System.out.println("Матриця A:");
        ops.printMatrix(a);
        System.out.println("Матриця B:");
        ops.printMatrix(b);
        int[][] product = ops.multiplyMatrices(a, b);
        System.out.println("Результат множення A x B:");
        ops.printMatrix(product);
    }

    public static void main(String[] args) {
        MatrixOperations ops = new MatrixOperations();

        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        runTranspose(ops, matrix1);
        System.out.println();
        runMultiply(ops, matrix1, matrix2);
    }
}
