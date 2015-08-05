import circle.Circle;
import matrix.Matrix;
import vector.Vector;

/**
 * Created by Ангелин on 03.08.2015.
 */
public class Main {
    public static void main(String[] args) {
/*        *//*Circle cr = new Circle(3,4,5);
        Circle sm = new Circle(3,4,5);
        sm.moveTheCircle(1, -5);
        System.out.println(cr.hashCode());
        System.out.println(sm.hashCode());
        System.out.println(cr.equals(sm));
        System.out.println(cr);
        System.out.println(sm);*//*

        Vector<Circle> vector = new Vector<>();
        Circle c = new Circle(3, 4, 5);
        Circle b = new Circle(2, 1, 8);
        Circle d = new Circle(-4, -3, 4);
        Circle n = new Circle(1,2,7);
        Circle a = new Circle(7,8,3);
        System.out.println(vector.getNumberOfLinks());
        System.out.println(vector);
        vector.putLink(c);
        vector.putLink(b);
        vector.putLink(d);
        vector.putLink(new Circle(1, 1, 1));
        System.out.println(vector.getNumberOfLinks());
        System.out.println(vector);
        *//*vector.removeLink(3);
        System.out.println(vector.getNumberOfLinks());
        System.out.println(vector);*//*
        vector.putLink(n);
        vector.putLink(a);
        vector.putLink(new Circle());
        System.out.println(vector.getNumberOfLinks());
        System.out.println(vector);
        vector.putLink(a);
        vector.putLink(a);
        vector.putLink(a);
        System.out.println(vector.getNumberOfLinks());
        System.out.println(vector);
        vector.removeLink(0);
        vector.removeLink(1);
        vector.removeLink(2);
        vector.removeLink(3);
        vector.removeLink(4);
        vector.eraseArray();
        System.out.println(vector.getNumberOfLinks());
        System.out.println(vector);
   */

        double[][] b = {{1.0, 2.0, 3.0},{4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        Matrix m = new Matrix(b);
        m.printMatrix();
        System.out.println();
        double[][] a = {{1.0, 2.0, 3.0},{4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        Matrix m2 = new Matrix(a);
        m2.printMatrix();
        System.out.println();
        m.sumMatrix(m2);
        m.printMatrix();

        
    }
}
