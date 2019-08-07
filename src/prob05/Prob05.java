package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		int correctNumber = (int) (Math.random() * 100) + 1; // 1~100까지 출력
		System.out.println("수를 결정하였습니다. 맞추어보세요");
		Scanner scanner = new Scanner(System.in);
		int count = 1;

		while (true) {
			int minNumber = 1;
			int maxNumber = 100;
			int guessNumber;
			
			do {
				System.out.println(minNumber + "-" + maxNumber);
				System.out.print(count + ">>");
				guessNumber = scanner.nextInt();
				if (correctNumber != guessNumber && correctNumber > guessNumber) {
					System.out.println("더 높게");
					minNumber = guessNumber;
					count++;
				} else if (correctNumber != guessNumber && correctNumber < guessNumber) {
					System.out.println("더 낮게");
					maxNumber = guessNumber;
					count++;
				}
			} while (guessNumber != correctNumber);
			System.out.println("맞았습니다.");
			System.out.print("다시하시겠습니까(y/n)>>");
			String s = scanner.next();
			if("n".equals(s))
				break;
		}
		//scanner.close();
	}

}