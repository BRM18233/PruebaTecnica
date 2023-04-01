package Ejercicios;

import java.util.Scanner;

public class Ajedrez {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[8][8];
        boolean correcto = true;

        System.out.println("Ingrese las ubicaciones de las 8 reinas (fila,columna):");
        for (int i = 0; i < 8; i++) {
            int fila = sc.nextInt();
            int columna = sc.nextInt();
            tablero[fila][columna] = 1;
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == 1) {
                    for (int k = 0; k < 8; k++) {
                        if (k != j && tablero[i][k] == 1) {
                            correcto = false;
                            break;
                        }
                        if (k != i && tablero[k][j] == 1) {
                            correcto = false;
                            break;
                        }
                    }
                    for (int k = 1; k < 8; k++) {
                        if (i + k < 8 && j + k < 8 && tablero[i + k][j + k] == 1) {
                            correcto = false;
                            break;
                        }
                        if (i - k >= 0 && j - k >= 0 && tablero[i - k][j - k] == 1) {
                            correcto = false;
                            break;
                        }
                        if (i + k < 8 && j - k >= 0 && tablero[i + k][j - k] == 1) {
                            correcto = false;
                            break;
                        }
                        if (i - k >= 0 && j + k < 8 && tablero[i - k][j + k] == 1) {
                            correcto = false;
                            break;
                        }
                    }
                }
            }
        }

        if (correcto) {
            System.out.println("Las 8 reinas están ubicadas correctamente.");
        } else {
            System.out.println("Las 8 reinas NO están ubicadas correctamente.");
        }

        sc.close();
    }
}

