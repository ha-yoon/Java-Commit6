package array;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// 5개의 숫자를 입력받아 작은 수부터 나열하기
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i+1 + "번째 숫자 입력 : ");
			num[i] = scan.nextInt();
		}		
		
		int temp = 0;
		
	
		for(int i = 0; i < 5; i++) {
		
			for(int j = i; j < 5; j++) {
			
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
			}
		}	scan.close();
	}	
		System.out.printf("정렬 : %d, %d, %d, %d, %d",
				num[0], num[1], num[2], num[3], num[4]);

	}	
		
		}	