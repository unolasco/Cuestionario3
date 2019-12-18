package com.senati.cuestionaro3;

import java.util.Random;

public class Ejercicio10 {

	
		public static void main(String[] args) {
			final int m = 3;
			final int n = 4;
			
			int[][] numeros = new int[m][n];
			
			Random rnd = new Random();
			
			int ale = 0;
			
			System.out.println("Matriz de números aleatorios (Sin Ordenar)");
			System.out.println("=========================================");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					ale = (int)(rnd.nextDouble() * 50.0);
					numeros[i][j] = ale;
					System.out.print(numeros[i][j] + " ");
				}
				System.out.println("\n");
			}
			
			int aux = 0;
			
			for (int x = 0; x < m; x++) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n - 1; j++) {
						if (numeros[x][j] > numeros[x][j + 1]) {
							aux = numeros[x][j];
							numeros[x][j] = numeros[x][j + 1];
							numeros[x][j + 1] = aux;
						}
					}
				}
			}
			
			System.out.println("\nMatriz de números aleatorios (Ordenados)");
			System.out.println("=======================================");
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(numeros[i][j] + " ");
				}
				System.out.println("\n");

	}

}
	}
