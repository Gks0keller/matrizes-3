import java.util.Random;

public class matrizPares {
	static Random r=new Random();
	public static void main(String[]args) {
		int[][] matriz=new int[5][5];
		int pares=0,total=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				matriz[i][j]=r.nextInt(15);
			}
		}
		System.out.println("--------------------------------------------\n Matriz \n--------------------------------------------");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.println(matriz[i][j]+" está na l"+(i+1)+" c"+(j+1));
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(matriz[i][j]%2==0) {
					total+=matriz[i][j];
					pares++;
				}
			}
		}
		total=total/pares;
		System.out.println("--------------------------------------------\n--------------------------------------------");
		System.out.println("A média será dos pares: "+total);
		
		
		
		
		
		
		
		
	}
}
