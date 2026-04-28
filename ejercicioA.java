

import java.io.*;
import java.util.*;
import java.math.*;

public class ejercicioA{
    static Scanner sc;
    static int numCasos;
    static int numPiezas;
    static String entrada;
    static String posicion;
    static String[][] matriz = new String[8][8];

    public static void matrizInicial(String[][] matriz){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i+j)%2 == 0)
                    matriz[i][j] = "\u25FB";
                else
                    matriz[i][j] = "\u25FC";
            }
        }
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j < 7)
                    System.out.print(matriz[j][i]+" ");
                else
                    System.out.print(matriz[j][i]);
            }
            System.out.println();
        }
    }

    public static void solucion(String[][] matriz, char pieza, char charFila, char charColumna){
        int fila = 0;
        int columna = 0;
        String piezas = "";

        switch (charFila) {
            case 'a':
                fila = 0;
                break;
            case 'b':
                fila = 1;
                break;
            case 'c':
                fila = 2;
                break;
            case 'd':
                fila = 3;
                break;
            case 'e':
                fila = 4;
                break;
            case 'f':
                fila = 5;
                break;
            case 'g':
                fila = 6;
                break;
            case 'h':
                fila = 7;
                break;
        }
        switch (charColumna) {
            case '8':
                columna = 0;
                break;
            case '7':
                columna = 1;
                break;
            case '6':
                columna = 2;
                break;
            case '5':
                columna = 3;
                break;
            case '4':
                columna = 4;
                break;
            case '3':
                columna = 5;
                break;
            case '2':
                columna = 6;
                break;
            case '1':
                columna = 7;
                break;
        }

        switch (pieza) {
            case 'R':
                piezas = "\u2654";
                break;
            case 'D':
                piezas = "\u2655";
                break;
            case 'T':
                piezas = "\u2656";
                break;
            case 'A':
                piezas = "\u2657";
                break;
            case 'C':
                piezas = "\u2658";
                break;
            case 'P':
                piezas = "\u2659";
                break;
            case 'r':
                piezas = "\u265A";
                break;
            case 'd':
                piezas = "\u265B";
                break;
            case 't':
                piezas = "\u265C";
                break;
            case 'a':
                piezas = "\u265D";
                break;
            case 'c':
                piezas = "\u265E";
                break;
            case 'p':
                piezas = "\u265F";
                break;
        }

        matriz[fila][columna] = piezas;
    }
    
    public static void main(String [] args)throws FileNotFoundException{
        sc=new Scanner(System.in);
        numCasos=sc.nextInt();
        numPiezas=sc.nextInt();

        matrizInicial(matriz);

        for(int i=0; i<numPiezas; i++){
            entrada=sc.next();
            posicion = sc.next();
            char charPieza = entrada.charAt(0);
            char charFila = posicion.charAt(0);
            char charColumna = posicion.charAt(1);
            solucion(matriz, charPieza, charFila, charColumna);
       }
       
       imprimirMatriz(matriz);

        sc.close();

    
    }
}
