import java.util.Random;

public class LinhaeColuna {
	static Random r = new Random();
	public static void main(String[]args) {
		int[][] matriz=new int[5][5];
		int[] somas=new int[6];
		int total=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				matriz[i][j]=r.nextInt(20);
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==3) {
					total+=matriz[i][j];
					somas[0]=total;
				}
			}
		}
		
		total=0;
		
		for(int j=0;j<5;j++) {
			for(int i=0;i<5;i++) {
				if(j==1) {
					total+=matriz[i][j];
					somas[1]=total;
				}
			}
		}
		
		total=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) {
					total+=matriz[i][j];
				}
			}
		}
		
		somas[2]=total;
		total=0;
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>0;j--) {
				if(i+j==4) {
					total+=matriz[i][j];
				}
			}
		}
		
		somas[3]=total;
		total=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
					total+=matriz[i][j];
			}
		}
		somas[4]=total;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
					System.out.println(matriz[i][j]+" "+matriz[i][j+1]+" "+matriz[i][j+2]+" "+matriz[i][j+3]+" "+matriz[i][j+4]);
					j=5;
			}
		}
		
		System.out.println("Soma da linha 4 de M: "+somas[0]);
		System.out.println("Soma da coluna 2 de M: "+somas[1]);
		System.out.println("Soma da diagonal principal: "+somas[2]);
		System.out.println("Soma da diagonal secundária: "+somas[3]);
		System.out.println("Soma de todos os elementos da matriz: "+somas[4]);
		
		
		
	}
}
