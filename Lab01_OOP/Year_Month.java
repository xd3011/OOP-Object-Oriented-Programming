package Exercises;

import java.util.Scanner;

// Example 6.4
public class Year_Month {
	public static void main(String[] args) {
		String[] Month_31 = {"January", "Jan.", "Jan", "1", 
							 "March", "Mar.", "Mar", "3",
							 "May", "5",
							 "July", "Jul", "7",
							 "August", "Aug.", "Aug", "8",
							 "October", "Oct.", "Oct", "10",
							 "December", "Dec.", "Dec", "12"};
		String[] Month_30 = {"April", "Apr.", "Apr", "4",
							 "June", "Jun", "6",
							 "September", "Sept.", "Sep", "9",
							 "November", "Nov.", "Nov", "11"};
		String[] Month_2 = {"February", "Feb.", "Feb", "2"};
		while(true) {
			int iYear;
			while(true){
				System.out.print("Nhap Nam: ");
				Scanner year = new Scanner(System.in);
				iYear = year.nextInt();
				if(iYear >= 0){
					break;
				}else {
					continue;
				}
			}
			System.out.print("Nhap thang: ");
			Scanner month = new Scanner(System.in);
			String strMonth = month.nextLine();
			for(String s : Month_31) {
				if(s.equals(strMonth)) {
					System.out.println("Thang " + s + " Nam " + iYear + " So ngay trong thang la: 31");
					System.exit(0);
				}
			}
			
			for(String s : Month_30) {
				if(s.equals(strMonth)) {
					System.out.println("Thang "+ s +" Nam " + iYear + " So ngay trong thang la: 30");
					System.exit(0);
				}
			}
			
			for(String s : Month_2) {
				if(s == strMonth) {
					if(iYear/4 == 0 && iYear/100 != 0) {
						System.out.println("Thang " + s + " Nam " + iYear + " So ngay trong thang la: 28");
						System.exit(0);
					}else {
						System.out.println("Thang " + s + " Nam " + iYear + " So ngay trong thang la: 29");
						System.exit(0);
					}
				}
			}
			System.out.println("Thang, Nam khong chinh xac! Hay nhap lai:\n");
			month.close();
		}
	}
}
