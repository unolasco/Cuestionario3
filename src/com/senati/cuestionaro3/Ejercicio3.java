package com.senati.cuestionaro3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arreglo= {32,52,37,12,32,5};
		
		System.out.printf("%s %8s\n", "Indice","Valor");
		for(int contador=0;contador<arreglo.length;contador++)
		{
			System.out.printf("%5d %8d\n", contador,arreglo[contador]);
		}
		
	}

}
