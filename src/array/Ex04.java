package array;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		// 학생 3명의 이름, 국어, 영어 성적을 입력받고
		// 총점과 순위 알아보기 
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
	
		for(int i = 0; i < 3; i++) {
			
			System.out.println(i+1 + "번째 학생의 이름 : ");
			name[0] = scan.next();
			
			System.out.println(i + 1 + "번째 학생의 국어점수 : ");
			kor[i] = scan.nextInt();
			
			System.out.println(i+1 + "번째 학생의 영어점수 : ");
			eng[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i];
			
		}
		

		
		for(int i = 0; i < 3; i++) {
			
			rank[i] = 1;
			
			for(int j = 0; j < 3; j++) {
				
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%S님의 총점은 %d점이고, 순위는 %d등 입니다.\n",
					name[i], total[i], rank[i]);
		}
		
		
		scan.close();
		
		

	}

}
