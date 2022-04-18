package array;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] engScores = {70, 83, 92, 63, 88};
		

		for(int eng : engScores) {
			System.out.printf(eng + " ");
		}
		System.out.println();
		

		int[] newEngScores = new int[7];
		
		for(int i = 0; i < engScores.length; i++) {
			newEngScores[i] = engScores[i]; 			
		}
		
		for(int eng : newEngScores) {
			System.out.print(eng + " ");
		}
		
		
	}

}
