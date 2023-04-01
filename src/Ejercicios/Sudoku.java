package Ejercicios;

import java.util.HashSet;

public class Sudoku {

    private final int[][] tablero;

    public Sudoku(int[][] tablero) {
        this.tablero = tablero;
    }

    public boolean estaResuelto() {
        return filasValidas() && columnasValidas() && cuadrantesValidos();
    }

    private boolean filasValidas() {
        for (int fila = 0; fila < 9; fila++) {
            HashSet<Integer> set = new HashSet<>();
            for (int columna = 0; columna < 9; columna++) {
                int numeroActual = tablero[fila][columna];
                if (numeroActual < 1 || numeroActual > 9 || set.contains(numeroActual)) {
                    return false;
                }
                set.add(numeroActual);
            }
        }
        return true;
    }

    private boolean columnasValidas() {
        for (int columna = 0; columna < 9; columna++) {
            HashSet<Integer> set = new HashSet<>();
            for (int fila = 0; fila < 9; fila++) {
                int numeroActual = tablero[fila][columna];
                if (numeroActual < 1 || numeroActual > 9 || set.contains(numeroActual)) {
                    return false;
                }
                set.add(numeroActual);
            }
        }
        return true;
    }

    private boolean cuadrantesValidos() {
        for (int cuadranteFila = 0; cuadranteFila < 3; cuadranteFila++) {
            for (int cuadranteColumna = 0; cuadranteColumna < 3; cuadranteColumna++) {
                HashSet<Integer> set = new HashSet<>();
                for (int i = cuadranteFila * 3; i < cuadranteFila * 3 + 3; i++) {
                    for (int j = cuadranteColumna * 3; j < cuadranteColumna * 3 + 3; j++) {
                        int numeroActual = tablero[i][j];
                        if (numeroActual < 1 || numeroActual > 9 || set.contains(numeroActual)) {
                            return false;
                        }
                        set.add(numeroActual);
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] tablero = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        Sudoku resuelto = new Sudoku(tablero);
        if (resuelto.estaResuelto()) {
            System.out.println("El tablero está resuelto correctamente.");
        } else {
        	System.out.println("El tablero no está resuelto correctamente.");
        }
    }
}   
