import java.util.Random;

public class matrzCanto {
	static Random r=new Random(); 
	public static void main(String[]args) {
		int[][] matriz=new int[3][4];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				matriz[i][j]=r.nextInt(20);
			}
		}
		
		System.out.println("--------------------------------------------\n Matriz\n--------------------------------------------");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(matriz[i][j]+" está na l"+(i+1)+" c"+(j+1));
			}
		}
		
		System.out.println("--------------------------------------------\n Números no Canto esquerdo\n--------------------------------------------");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(i==0 && j==0) {
					System.out.println(matriz[i][j]+" está na l"+(i+1)+" c"+(j+1));
				} 
				if(i==2 && j==0) {
					System.out.println(matriz[i][j]+" está na l"+(i+1)+" c"+(j+1));
				}
			}
		}
		
		
	}
}
