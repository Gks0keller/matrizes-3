import java.util.Random;

public class cuboDaMatriz {
	static Random r=new Random();
	public static void main(String[]args) {
		int[][] matriz=new int[5][5],matrizCubo=new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				matriz[i][j]=r.nextInt(20);
			}
		}
		
		System.out.println("------------------\n Matriz Original\n------------------");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.println(matriz[i][j]+" está na l"+(i+1)+" c"+(j+1));
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				matrizCubo[i][j]=matriz[i][j]*matriz[i][j]*matriz[i][j];
			}
		}
		System.out.println("------------------\n Matriz ao cubo\n------------------");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.println(matrizCubo[i][j]+" está na l"+(i+1)+" c"+(j+1));
			}
		}
		
		
	}
}
