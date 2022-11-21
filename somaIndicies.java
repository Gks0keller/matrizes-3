
public class somaIndicies {
	public static void main(String[]args) {
		int[][] matriz=new int[7][8];
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<8;j++) {
				matriz[i][j]=i+j;
			}
		}
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<8;j++) {
				System.out.println(matriz[i][j]+" está na l"+(i+1)+" c"+(j+1));
			}
		}
		
	}
}
