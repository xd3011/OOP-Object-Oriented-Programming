package Exercises;

import java.util.Scanner;

public class AddMatrix {
	public static Scanner input = new Scanner(System.in);
	public static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
	   
    public static void main(String[] args) {
        System.out.print("Nhap So Hang: ");
        int n = input.nextInt();
        System.out.print("Nhap So Cot: ");
        int m = input.nextInt();
        int[][] arr_1 = new int[n][m];
        System.out.print("Nhap Phan Tu Ma Tran 1: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("a[%d][%d] = ",i,j);
                arr_1[i][j] = input.nextInt();
            }
        }
        int[][] arr_2 = new int[n][m];
        System.out.print("Nhap Phan Tu Ma Tran 2: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("a[%d][%d]",i,j);
                arr_2[i][j] = input.nextInt();
            }
        }
        int[][] arr_3= new int[n][m];
        for(int i = 0; i<n;i++) {
        	for (int j= 0; j<m;j++) {
        		arr_3[i][j]=arr_1[i][j] +arr_2[i][j];
        	}
        }
        
        System.out.println("Ma Tran 1: ");
        show(arr_1);
        System.out.println("Ma Tran 2: ");
        show(arr_2);
        System.out.println("Tong 2 ma tran: ");
        show(arr_3);
        
    }
}
