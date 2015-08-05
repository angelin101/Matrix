package matrix;

import java.util.Arrays;

/**
 * Created by јнгелин on 04.08.2015.
 */
public class Matrix {
    private double[][] matrix;
    private int line;// строки
    private int column;// столбцы
    
    // «аполнить рандомно
    public Matrix(){
        line = 3;
        column = 3;
        matrix = new double[column][line];
        createMatrix(matrix);
    }
    public Matrix(int line, int column){
        this.line = line;
        this.column = column;
        matrix = new double[column][line];
        createMatrix(matrix);
    }
    public Matrix(double[][] matrix){
        column = matrix.length;
        line = matrix[line].length;
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

    //метод заполн€ет пустой двумерный массив рандомными значени€ми (создает матрицу)!!!!!
    // private только дл€ вызова с класса
    private void createMatrix(double[][] matrix){
        Random random = new Random();
        for (int n = 0; n < column; n++) {
            for (int m = 0; m < line; m++) {
                matrix[n][m] = random.nextDouble()*100;      
            }                
        }            
    }

    // метод принимает матрицу и складывает две матрицы!
    public void sumMatrix(Matrix matrixObj){
        if (matrixObj.line != line || matrixObj.column != column){
            throw new IndexOutOfBoundsException("ћатрицы разных размеров!");
        }
        for (int n = 0; n < column; n++){
            for (int m = 0; m < line; m++){
                matrix[n][m] += matrixObj.matrix[n][m];
            }
        }
    }

    // метод принимает число и умножает его на матрицу
    public void multiplicationByNumber(int number){
        for (int n = 0; n < column; n++) {
            for (int m = 0; m < line; m++) {
                matrix[n][m] *= number;      
            }                
        }            
    }

    // метод принимает матрицу и перемножает две матрицы!!!*
   /* public void multiplicationByMatrix(Matrix matrixObj){
        if (this.column != matrixObj.line){
            throw new IndexOutOfBoundsException("Ќе выполн€ютс€ услови€ перемножени€ матриц!+\n
                 оличество столбцов первой матрицы не равно количеству строк второй матрицы!!!");
        }
        double[][] newMatrix = new double[line][matrixObj.column];
        for (int n = 0; n < newMatrix.column; n++) {
            for (int m = 0; m < newMatrix.line; m++) {
                newMatrix[m][n] = 
        }
    }*/

    // метод транспонирует матрицу!!!*
    public void transpose(){
        double[][] newMatrix = new double[line][column];
        for (int n = 0; n < newMatrix.length; n++) {
            for (int m = 0; m < newMatrix[line].length; m++) {
                newMatrix[n][m] = matrix[m][n];      
            }                
        }
        matrix = newMatrix;
        column = newMatrix.length;
        line = newMatrix[line].length;            
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

