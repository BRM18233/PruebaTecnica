package Ejercicios;

public class CuboRubik {

	public static boolean validarCuboRubik(int[][][] cubo) {
		for (int[][] cara : cubo) {
			int color = cara[0][0];
			for (int i = 0; i < cara.length; i++) {
				for (int j = 0; j < cara[i].length; j++) {
					if (cara[i][j] != color) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][][] cubo = {

//Aqui se modifica para saber si el cubo esta o no armado correctamente
				// Cara 1 - amarillo
				{ { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } },
				// Cara 2 - azul
				{ { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } },
				// Cara 3 - rojo
				{ { 3, 3, 3 }, { 3, 3, 3 }, { 3, 3, 3 } },
				// Cara 4 - naranja
				{ { 4, 4, 4 }, { 4, 4, 4 }, { 4, 4, 4 } },
				// Cara 5 - verde
				{ { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 } },
				// Cara 6 - blanco
				{ { 6, 6, 6 }, { 6, 6, 6 }, { 6, 6, 6 } } };

		if (validarCuboRubik(cubo)) {
			System.out.println("El cubo está armado correctamente");
		} else {
			System.out.println("El cubo no está armado correctamente");
		}
	}
}
