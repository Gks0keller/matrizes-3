import java.util.Random;

public class Menor {
	static Random r=new Random();
	public static void main(String[]args) {
		int[][] matriz=new int[7][4]; 
		int menor=78998,c=0,l=0;
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<4;j++) {
				matriz[i][j]=r.nextInt(20);
			}
		}
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<4;j++) {
				if(matriz[i][j]<menor) {
					menor=matriz[i][j];
					c=j;
					l=i;
				}
			}
		}
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(matriz[i][j]+" está na l"+(i+1)+" c"+(j+1));
			}
		}
		
		System.out.println("O menor número está na l "+l+" e na c "+c+" e é: "+menor);
		
	}
}
