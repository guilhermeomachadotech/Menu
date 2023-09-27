package jogoDaVelha;
import java.util.Scanner;
public class ExemploJogoVelha {
	public static void main (String[] args) {
		Scanner ler=new Scanner (System.in);
		int linha, coluna,i,j;
		String matriz[][]=new String [3][3];
		System.out.println("Jogo da Velha");
		System.out.println ("Obs: jogador par = X, jogador impar = O.");
		for (i=1;i<=9;i++) {
			System.out.println("Indique a posição da linha e a coluna da matriz:");
			System.out.println("Digite a Linha:");
			linha=ler.nextInt();
			System.out.println("Digite a Coluna:");
			coluna=ler.nextInt();
			if (i%2==0) {
				matriz[linha][coluna]="X";
			}else {
				matriz[linha][coluna]="O";
			}
		}
		for(i=0;i<3;i++) {
			System.out.println();
			for (j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
		System.out.println();
		if (matriz[0][0].equalsIgnoreCase("x") && matriz[0][1].equalsIgnoreCase("x") && matriz[0][2].equalsIgnoreCase("x")||
				matriz[0][0].equalsIgnoreCase("o") && matriz[0][1].equalsIgnoreCase("o") && matriz[0][2].equalsIgnoreCase("o")) {
			System.out.println(matriz[0][0]+" ganhou!");
		}else if (matriz[1][0].equalsIgnoreCase("x") && matriz[1][1].equalsIgnoreCase("x") && matriz[1][2].equalsIgnoreCase("x")||
				matriz[1][0].equalsIgnoreCase("o") && matriz[1][1].equalsIgnoreCase("o") && matriz[1][2].equalsIgnoreCase("o")) {
			System.out.println (matriz[1][0]+" ganhou!");
		}else if (matriz[2][0].equalsIgnoreCase("x") && matriz[2][1].equalsIgnoreCase("x") && matriz[2][2].equalsIgnoreCase("x")||
				matriz[2][0].equalsIgnoreCase("o") && matriz[2][1].equalsIgnoreCase("o") && matriz[2][2].equalsIgnoreCase("o")) {
			System.out.println(matriz[2][0]+" ganhou!");
		}else if (matriz[0][0].equalsIgnoreCase("x") && matriz[1][0].equalsIgnoreCase("x") && matriz[2][0].equalsIgnoreCase("x")||
				matriz[0][0].equalsIgnoreCase("o") && matriz[1][0].equalsIgnoreCase("o") && matriz[2][0].equalsIgnoreCase("o")) {
			System.out.println (matriz[0][0]+" ganhou!");
		}else if (matriz[0][1].equalsIgnoreCase("x") && matriz[1][1].equalsIgnoreCase("x") && matriz[2][1].equalsIgnoreCase("x")||
				matriz[0][1].equalsIgnoreCase("o") && matriz[1][1].equalsIgnoreCase("o") && matriz[2][1].equalsIgnoreCase("o")) {
			System.out.println(matriz[0][1]+" ganhou!");
		}else if (matriz[0][2].equalsIgnoreCase("x") && matriz[1][2].equalsIgnoreCase("x") && matriz[2][2].equalsIgnoreCase("x")||
				matriz[0][2].equalsIgnoreCase("o") && matriz[1][2].equalsIgnoreCase("o") && matriz[2][2].equalsIgnoreCase("o")) {
			System.out.println(matriz[0][2]+" ganhou!");
		}else if (matriz[0][0].equalsIgnoreCase("x") && matriz[1][1].equalsIgnoreCase("x") && matriz[2][2].equalsIgnoreCase("x")||
				matriz[0][0].equalsIgnoreCase("o") && matriz[1][1].equalsIgnoreCase("o") && matriz[2][2].equalsIgnoreCase("o")) {
			System.out.println(matriz[0][0]+" ganhou!");
		}else if (matriz[0][2].equalsIgnoreCase("x") && matriz[1][1].equalsIgnoreCase("x") && matriz[2][0].equalsIgnoreCase("x")||
				matriz[0][2].equalsIgnoreCase("o") && matriz[1][1].equalsIgnoreCase("o") && matriz[2][0].equalsIgnoreCase("o")) {
			System.out.println (matriz[0][2]+" ganhou!");
		}else {
			System.out.println ("Deu velha!");
		}
		ler.close();		
	}
}
