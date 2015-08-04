package matrix;

import java.util.Arrays;

/**
 * Created by Ангелин on 04.08.2015.
 */
public class Matrix {
    private double[][] matrix;
    private int line;// строки
    private int column;// столбцы
    // посмотреть как реализовывать конструктора!!!
    public Matrix(){
        line = 3;
        column = 3;
        matrix = new double[column][line];
    }
    public Matrix(int line, int column){
        this.line = line;
        this.column = column;
        matrix = new double[column][line];
    }
    public Matrix(double[][] matrix){
        this.matrix = matrix;
        column = matrix.length;
        line = matrix[line].length;
    }
    public Matrix(Matrix newMatrix){
        line = newMatrix.line;
        column = newMatrix.column;
        matrix = new double[column][line];
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

    // метод складывает две матрицы!
    public void sumMatrix(Matrix matrix2){
        if (matrix2.line != line || matrix2.column != column){
            throw new IndexOutOfBoundsException("Матрицы разных размеров!");
        }
        for (int n = 0; n < column; n++){
            for (int m = 0; m < line; m++){
                matrix[n][m] += matrix2.matrix[n][m];
            }
        }
    }
    // хуй как массив вывести на печать через toString
    public void printMatrix(){
        for (double[] a : matrix){
            System.out.print("|");
            for (double b : a){
                System.out.print(b+" ");
            }
            System.out.println("|");
        }
    }
}

