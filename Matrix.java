package matrix;

import java.util.Arrays;

/**
 * Created by ������� on 04.08.2015.
 */
public class Matrix {
    private double[][] matrix;
    private int line;// ������
    private int column;// �������
    
    // ��������� ��������
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

    //����� ��������� ������ ��������� ������ ���������� ���������� (������� �������)!!!!!
    // private ������ ��� ������ � ������
    private void createMatrix(double[][] matrix){
        Random random = new Random();
        for (int n = 0; n < column; n++) {
            for (int m = 0; m < line; m++) {
                matrix[n][m] = random.nextDouble()*100;      
            }                
        }            
    }

    // ����� ��������� ������� � ���������� ��� �������!
    public void sumMatrix(Matrix matrixObj){
        if (matrixObj.line != line || matrixObj.column != column){
            throw new IndexOutOfBoundsException("������� ������ ��������!");
        }
        for (int n = 0; n < column; n++){
            for (int m = 0; m < line; m++){
                matrix[n][m] += matrixObj.matrix[n][m];
            }
        }
    }

    // ����� ��������� ����� � �������� ��� �� �������
    public void multiplicationByNumber(int number){
        for (int n = 0; n < column; n++) {
            for (int m = 0; m < line; m++) {
                matrix[n][m] *= number;      
            }                
        }            
    }

    // ����� ��������� ������� � ����������� ��� �������!!!*
   /* public void multiplicationByMatrix(Matrix matrixObj){
        if (this.column != matrixObj.line){
            throw new IndexOutOfBoundsException("�� ����������� ������� ������������ ������!+\n
                ���������� �������� ������ ������� �� ����� ���������� ����� ������ �������!!!");
        }
        double[][] newMatrix = new double[line][matrixObj.column];
        for (int n = 0; n < newMatrix.column; n++) {
            for (int m = 0; m < newMatrix.line; m++) {
                newMatrix[m][n] = 
        }
    }*/

    // ����� ������������� �������!!!*
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

    // ����� ������� ������� �� �����
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

