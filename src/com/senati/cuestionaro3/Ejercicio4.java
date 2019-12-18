package com.senati.cuestionaro3;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] matriz= {{3,1,3},{4,5,6},{5,4,2}};
			for(int i=0;i<3;i++)
			{
				System.out.println();
				
				for(int j=0;j<3;j++)
				{
					if(i==j)
					{
						matriz[0][1]=0;
						matriz[0][2]=0;
						matriz[1][0]=0;
						matriz[1][2]=0;
						matriz[2][1]=0;
						matriz[2][0]=0;
					}
					System.out.print(matriz[i][j]+"");
				}
			}
	}

}
