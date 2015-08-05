package matrix;

import java.util.Random;

/**
 * Created by Ангелин on 04.08.2015.
 */
public class Matrix {
    private double[][] matrix;
    private int line;// строки
    private int column;// столбцы

    public Matrix(){
        line = 3;
        column = 3;
        matrix = new double[line][column];
        createMatrix(matrix);
    }
    public Matrix(int line, int column){
        this.line = line;
        this.column = column;
        matrix = new double[line][column];
        createMatrix(matrix);
    }
    public Matrix(double[][] matrix){
        line = matrix.length;
        column = matrix[column].length;
        this.matrix = matrix;
    }
    public Matrix(Matrix matrixObj){
        line = matrixObj.line;
        column = matrixObj.column;
        matrix = matrixObj.matrix;
    }

    public int getLine() {
        return line;
    }
    public void setLine(int line) {
        this.line = line;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public double[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    //метод заполняет пустой двумерный массив рандомными значениями (создает матрицу)!
    // private только для вызова с класса
    private void createMatrix(double[][] matrix){
        Random random = new Random();
        for (int n = 0; n < line; n++) {
            for (int m = 0; m < column; m++) {
                matrix[n][m] = random.nextDouble()*100;
            }
        }
    }

    // метод принимает матрицу и складывает две матрицы!
    public void sumMatrix(Matrix matrixObj){
        if (matrixObj.line != line || matrixObj.column != column){
            System.err.println("Матрицы разных размеров!");
            return;
        }
        for (int n = 0; n < line; n++){
            for (int m = 0; m < column; m++){
                matrix[n][m] += matrixObj.matrix[n][m];
            }
        }
    }

    // метод принимает число и умножает его на матрицу
    public void multiplyByNumber(int number){
        for (int n = 0; n < line; n++) {
            for (int m = 0; m < column; m++) {
                matrix[n][m] *= number;
            }
        }
    }

    // метод принимает матрицу и перемножает две матрицы!!!
    public void multiplyByMatrix(Matrix matrixObj){
        if (this.column != matrixObj.line){
            System.err.println("Не выполняются условия перемножения матриц!\nКоличество столбцов первой матрицы не равно количеству строк второй матрицы!!!");
            return;
        }
        double[][] newMatrix = new double[line][matrixObj.column];
        for (int n = 0; n < line; n++) {
            for (int m = 0; m < matrixObj.column; m++) {
                for (int i = 0; i < column; i++) {
                    newMatrix[n][m] += matrix[n][i] * matrixObj.matrix[i][m];
                }
            }
        }
        matrix = newMatrix;
        column = matrixObj.column;
    }

    // метод транспонирует матрицу!!!
    public void transpose(){
        double[][] newMatrix = new double[column][line];
        for (int n = 0; n < column; n++) {
            for (int m = 0; m < line; m++) {
                newMatrix[n][m] = matrix[m][n];
            }
        }
        matrix = newMatrix;
        column = line;
        line = newMatrix.length;
    }

    // метод выводит матрицу на экран
    public void printMatrix(){
        System.out.println("Line - "+line+" Column - "+column);
        for (double[] a : matrix){
            System.out.print("|");
            for (double b : a){
                System.out.print(b+" ");
            }
            System.out.println("|");
        }
    }
}


