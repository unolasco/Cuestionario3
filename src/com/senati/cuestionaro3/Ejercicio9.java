package com.senati.cuestionaro3;

import java.util.Random;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int n = 10;
		
		int[] numeros = new int[n];
		
		Random rnd = new Random();
		
		int x = 0;
		
		System.out.println("Lista de números aleatorios (Sin Ordenar)");
		System.out.println("=========================================");
		for (int i = 0; i < n; i++) {
			x = (int)(rnd.nextDouble() * 50.0);
			numeros[i] = x;
			System.out.println("Número " + (i + 1) + ": " + numeros[i]);
		}
		
		int aux = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (numeros[j] > numeros[j + 1]) {
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}
		
		System.out.println("\nLista de números aleatorios (Ordenados)");
		System.out.println("=======================================");
		
		for (int i = 0; i < n; i++) {
			System.out.println("Número " + (i + 1) + ": " + numeros[i]);
		}
	}

		
		
		
	}


