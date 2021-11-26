package hackerrank;

import java.util.Scanner;

public class SortingDiagonals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Enter matrix values");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter 1 for major diagonal and 2 for minor diagonal for sorting");
		int order = sc.nextInt();

		if (order == 1) {
			/*
			 * for (int k = 0; k < row - 1; k++) { for (int i = 0, j = i + k; i < row && j <
			 * col; i++, j++) { for (int r = i + 1, c = j + 1; r < row && c < col; r++, c++)
			 * { if (arr[i][j] > arr[r][c]) { int temp = arr[r][c]; arr[r][c] = arr[i][j];
			 * arr[i][j] = temp; } if (arr[j][i] > arr[c][r]) { int temp = arr[c][r];
			 * arr[c][r] = arr[j][i]; arr[j][i] = temp; } } } }
			 */
			for (int i = row - 2, j = 0; i >= 0 && j <= col - 2;) {
				for (int r = i, c = j; r <= row - 2 && c <= col - 2; r++, c++) {
					for (int ro = r + 1, co = c + 1; ro <= row - 1 && co <= col - 1; ro++, co++) {
						if (arr[r][c] > arr[ro][co]) {
							int temp = arr[r][c];
							arr[r][c] = arr[ro][co];
							arr[ro][co] = temp;
						}
					}

				}
				if (i == 0)
					j++;
				if (i != 0)
					i--;
			}
		} else if (order == 2) {
			/*
			 * for (int k = col - 1; k > 0 || l > col - 1; k--) { for (int i = 0, j = i + k;
			 * i < row && j >= 0; i++, j--) { for (int r = i + 1, c = j - 1; r < row && c >=
			 * 0; r++, c--) { if (arr[i][j] > arr[r][c]) { int temp = arr[r][c]; arr[r][c] =
			 * arr[i][j]; arr[i][j] = temp; } if (k < col - 1 && r<row || c+l >=0 || i+l
			 * <row || j+l>=0) { if (arr[i + l][j + l] > arr[c + l][r + l]) { int temp =
			 * arr[c + l][r + l]; arr[c + l][r + l] = arr[i + l][j + l]; arr[i + l][j + l] =
			 * temp; System.out.println("c = " + l); l++; } } } } }
			 */
			for (int i = row - 1, j = col - 1; i > 0 && j > 0;) {
				for (int r = i - 1, c = j; r < row - 1 && c > 0; r++, c--) {
					for (int ro = r + 1, co = c - 1; ro < row && co >= 0; ro++, co--) {
						if (arr[r][c] > arr[ro][co]) {
							int temp = arr[ro][co];
							arr[ro][co] = arr[r][c];
							arr[r][c] = temp;
						}
					}
				}
				if (i == 1)
					j--;
				if (i != 1)
					i--;
			}
		} else {
			System.out.println("Invalid");
			System.exit(1);
		}
		// printing matrix values
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j]);
				if (j != col - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
