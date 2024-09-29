package section10_array_list.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class MatrixEx1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the order of the matrix: ");
		int n = sc.nextInt();
		
		sc.close();
		// make the matrix
		int[][] matrix = new int[n][n*2];
		for (int i = 0; i < n; i++) {  // linhas
			for (int j = 0; j < n; j ++) {  // colunas
				matrix[i][j] = j - i*3;
				// System.out.print(matrix[i][j] +" ");
			}
				
		}
		System.out.println("Linhas: "+ matrix.length);
		System.out.println("Colunas: "+ matrix[0].length);
		
		
		System.out.println();
		System.out.print("Matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("%n");
			for (int j = 0; j < matrix[i].length; j ++) {
					System.out.print(matrix[i][j] +" ");
			}
				
		}
		System.out.println();
		System.out.print("Main Diagonal : ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j ++) {
				if(i == j) {
					System.out.print(matrix[i][j] +" ");
				}
			}
				
		}
		
		System.out.println();
		System.out.print("Negative numbers: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j ++) {
				if(matrix[i][j] < 0) {
					System.out.print(matrix[i][j] +" ");
				}
			}
				
		}
		
		
		

	}

}
