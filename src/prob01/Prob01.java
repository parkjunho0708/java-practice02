package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		int moneyUnitCount[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		Scanner scanner = new Scanner(System.in );
		
		System.out.print("금액 : ");
		int money = scanner.nextInt();
		
		for(int moneyCount : moneyUnitCount) {
			int moneyNumber = money / moneyCount;
			money = money % moneyCount;
			System.out.println(moneyCount + "원 : " + moneyNumber + "개");
		}
		
		scanner.close();
 	}
}