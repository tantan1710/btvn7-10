import java.util.Scanner;

public class Main {

    //Bài 1
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = calculateSum(scanner);
        System.out.println("Tổng các giá trị chia hết cho 3 là: "+ sum);
    }
    public static int calculateSum(Scanner scanner){
        System.out.println("Nhập số hàng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột: ");
        int column = Integer.parseInt(scanner.nextLine());
        int arr [][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Mời bạn nhập dòng thứ " + ( i + 1 )+ ", cột thứ " + ( j + 1 ) +" là: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j] % 3==0){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }*/
    //Bài 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculateSum(scanner);
    }

    public static void calculateSum(Scanner scanner) {
        System.out.println("Nhập số dòng của ma trận A: ");
        int rowsA = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận A: ");
        int columnsA = scanner.nextInt();

        System.out.println("Nhập số dòng của ma trận B: ");
        int rowsB = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận B: ");
        int columnsB = scanner.nextInt();

        int[][] matrixA;
        int[][] matrixB;

        if (rowsA != rowsB || columnsA != columnsB) {
            System.out.println("Số dòng hoặc số cột của hai ma trận không bằng nhau. Không thể thực hiện tính toán.");
        } else {
            System.out.println("Nhập giá trị cho ma trận A:");
            matrixA = inputMatrix(scanner, rowsA, columnsA);

            System.out.println("Nhập giá trị cho ma trận B:");
            matrixB = inputMatrix(scanner, rowsB, columnsB);

            int[][] sumMatrix = addMatrices(matrixA, matrixB);

            System.out.println("Tổng của hai ma trận là:");
            printMatrix(sumMatrix);
        }
    }

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] resultMatrix = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return resultMatrix;
    }

    public static int[][] inputMatrix(Scanner scanner, int row, int column) {
        int matrix[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out
                        .print("Nhập giá trị của phần tử hàng " + (i + 1) + ", cột " + (j + 1) + " trong ma trận: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}