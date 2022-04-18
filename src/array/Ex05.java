package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		// 동전 교환하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("동전으로 교환할 금액 입력 : ");
		int money = scan.nextInt();
		
		int[] coin = {500, 100, 50, 10};
		
		System.out.println("교환할 돈 : " + money + "원");
		
	
		for(int i =0; i < coin.length; i++) {
			
			System.out.println(coin[i] + "원 : " + money / coin[i] + "개");
			money = money % coin[i];
		}	scan.close();
		
		System.out.println("잔돈 : " + money + "원");
		
	}
		
}
