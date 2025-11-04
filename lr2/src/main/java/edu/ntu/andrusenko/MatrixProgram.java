import java.util.Random;
import java.util.Scanner;

public class MatrixProgram {

    // Константи для діапазону випадкових чисел
    private static final int MIN_RANDOM = -50;
    private static final int MAX_RANDOM = 50;
    private static final int MAX_SIZE = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків (не більше 20): ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців (не більше 20): ");
        int cols = scanner.nextInt();

        if (rows > MAX_SIZE || cols > MAX_SIZE || rows <= 0 || cols <= 0) {
            System.out.println("Помилка: розміри повинні бути від 1 до 20!");
            return;
        }

        System.out.print("Створити матрицю вручну (1) чи випадково (2)? ");
        int choice = scanner.nextInt();

        int[][] matrix;

        if (choice == 1) {
            matrix = createMatrixManual(scanner, rows, cols);
        } else if (choice == 2) {
            matrix = createMatrixRandom(rows, cols);
        } else {
            System.out.println("Невірний вибір!");
            return;
        }

        printMatrix(matrix);

        int min = findMin(matrix);
        int max = findMax(matrix);
        double average = calculateAverage(matrix);

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + average);
    }

    // Метод створення матриці вручну
    public static int[][] createMatrixManual(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Елемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Метод створення матриці випадковим чином
    public static int[][] createMatrixRandom(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
            }
        }
        return matrix;
    }

    // Метод виведення матриці
    public static void printMatrix(int[][] matrix) {
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%5d", value);
            }
            System.out.println();
        }
    }

    // Пошук мінімального елемента
    public static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    // Пошук максимального елемента
    public static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    // Обчислення середнього арифметичного
    public static double calculateAverage(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return sum / count;
    }
}
