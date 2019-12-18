package com.senati.cuestionaro3;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] matriz=new int[3][3];
		
		matriz[0][0]=2;
		matriz[0][1]=3;
		matriz[0][2]=5;
		matriz[1][0]=4;
		matriz[1][1]=6;
		matriz[1][2]=6;
		matriz[2][0]=3;
		matriz[2][1]=3;
		matriz[2][2]=3;
		
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				System.out.print(matriz[i][j] + "");
			}
		}
	}

}
