/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaussjordan;

/**
 *
 * @author ariel
 */
public class GaussJordan {

    public static void imprimirMatriz(double a[][]) {
        double pivo;
        pivo = a[0][0];

        for (int j = 0; j <= a.length; j++) {

            if (pivo != 1) {
                a[0][j] /= pivo;
            }

            a[1][j] = (a[1][j]) - (a[1][j] * a[0][j]);
            a[2][j] = (a[2][j]) - (a[2][j] * a[0][j]);


        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= a.length; j++) {
                System.out.printf("%f(%d,%d) ", a[i][j], i, j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double a[][] = {
            {7, 1, 8, 16},
            {2, 8, 7, 5},
            {3, 6, 3, 4}};

        System.out.println("Matriz A" + "\r\n");
        imprimirMatriz(a);
        System.out.println();

    }
}
