public class Matrix {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] b = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int[][] add = new int[3][3];
        System.out.println("Matrix addition");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                add[i][j] = a[i][j] + b[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        int[][] mul = new int[3][3];
        System.out.println("Matrix multiplication");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
