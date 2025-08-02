package b_arrayInJava;

import java.util.Scanner;

public class twoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        System.out.print("Enter the number of rows: ");
        row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        col = input.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
//            System.out.println("");
        }
    }
}
