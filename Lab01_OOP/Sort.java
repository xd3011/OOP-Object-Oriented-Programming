package Exercises;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		System.out.print("Nhap So phan tu cua mang N = ");
		Scanner N = new Scanner(System.in);
		int iN = N.nextInt();
		int Arr[] = new int[iN];
		System.out.println("Nhap cac phan tu cua mang: ");
		for(int i = 0; i < iN; i++) {
			Arr[i] = N.nextInt();
		}
		
		for(int i =0; i< iN; i++) {
			for(int j = 1; j < iN-i; j++ ) {
				if(Arr[j-1] > Arr[j]) {
					int tmp = Arr[j-1];
					Arr[j-1] = Arr[j];
					Arr[j] = tmp;
				}
			}
		}
		System.out.println("Chuoi sau khi sap xep la:");
		for(int i=0; i< iN; i++) {
			System.out.print(Arr[i] + " ");
		}
		
		N.close();
		System.exit(0);
	}
}
