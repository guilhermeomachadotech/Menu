package jogoDaVelha;

public class JogoVelha extends Jogador{
	private String matrizXO[][]=new String[3][3];
	private int contagemJogo=1;
	private int pontuacaoJogador1=0;
	private int pontuacaoJogador2=0;
	private String opcaoJ1;
	private String opcaoJ2;
	private String nomeJogador1;
	private String nomeJogador2;
	
	//Geters e setters
	public String[][] getMatrizXO() {
		return matrizXO;
	}
	public void setMatrizXO(String[][] matrizXO) {
		this.matrizXO = matrizXO;
	}
	public int getContagemJogo() {
		return contagemJogo;
	}
	public void setContagemJogo(int contagemJogo) {
		this.contagemJogo = contagemJogo;
	}
	public int getPontuacaoJogador1() {
		return pontuacaoJogador1;
	}
	public void setPontuacaoJogador1(int pontuacaoJogador1) {
		this.pontuacaoJogador1 = pontuacaoJogador1;
	}
	public int getPontuacaoJogador2() {
		return pontuacaoJogador2;
	}
	public void setPontuacaoJogador2(int pontuacaoJogador2) {
		this.pontuacaoJogador2 = pontuacaoJogador2;
	}
	public String getOpcaoJ1() {
		return opcaoJ1;
	}
	public void setOpcaoJ1(String opcaoJ1) {
		this.opcaoJ1 = opcaoJ1;
	}
	public String getOpcaoJ2() {
		return opcaoJ2;
	}
	public void setOpcaoJ2(String opcaoJ2) {
		this.opcaoJ2 = opcaoJ2;
	}
	public String getNomeJogador1() {
		return nomeJogador1;
	}
	public void setNomeJogador1(String nomeJogador1) {
		this.nomeJogador1 = nomeJogador1;
	}
	public String getNomeJogador2() {
		return nomeJogador2;
	}
	public void setNomeJogador2(String nomeJogador2) {
		this.nomeJogador2 = nomeJogador2;
	}
	
	//Exec do jogo
	
	public String fazerJogada(int linha, int coluna) {
		if(contagemJogo%2!=0) {
			matrizXO[linha][coluna]=opcaoJ1;
			contagemJogo++;
			return opcaoJ1;
		}else {
			matrizXO[linha][coluna]=opcaoJ2;
			contagemJogo++;
			return opcaoJ2;
		}
	}
	public String verificarVencedor() {
			if (matrizXO[0][0]==opcaoJ1 && matrizXO[0][1]==opcaoJ1 && matrizXO[0][2]==opcaoJ1||
					matrizXO[0][0]==opcaoJ2 && matrizXO[0][1]==opcaoJ2 && matrizXO[0][2]==opcaoJ2) {
				
				if(opcaoJ1.equalsIgnoreCase(matrizXO[0][0])) {
					pontuacaoJogador1++;
					contagemJogo=1;
					return nomeJogador1;
				}else {
					pontuacaoJogador2++;
					contagemJogo=1;
					return nomeJogador2;
				}
				
			}else if (matrizXO[1][0]==opcaoJ1 && matrizXO[1][1]==opcaoJ1 && matrizXO[1][2]==opcaoJ1||
					matrizXO[1][0]==opcaoJ2 && matrizXO[1][1]==opcaoJ2 && matrizXO[1][2]==opcaoJ2) {
				if(opcaoJ1.equalsIgnoreCase(matrizXO[1][0])) {
					pontuacaoJogador1++;
					contagemJogo=1;
					return nomeJogador1;
				}else {
					pontuacaoJogador2++;
					contagemJogo=1;
					return nomeJogador2;
				}
			}else if (matrizXO[2][0]==opcaoJ1 && matrizXO[2][1]==opcaoJ1 && matrizXO[2][2]==opcaoJ1||
					matrizXO[2][0]==opcaoJ2 && matrizXO[2][1]==opcaoJ2 && matrizXO[2][2]==opcaoJ2) {
				if(opcaoJ1.equalsIgnoreCase(matrizXO[2][0])) {
					pontuacaoJogador1++;
					contagemJogo=1;
					return nomeJogador1;
				}else {
					pontuacaoJogador2++;
					contagemJogo=1;
					return nomeJogador2;
				}
			}else if (matrizXO[0][0]==opcaoJ1 && matrizXO[1][0]==opcaoJ1 && matrizXO[2][0]==opcaoJ1||
					matrizXO[0][0]==opcaoJ2 && matrizXO[1][0]==opcaoJ2 && matrizXO[2][0]==opcaoJ2) {
				
				if(opcaoJ1.equalsIgnoreCase(matrizXO[0][0])) {
					pontuacaoJogador1++;
					contagemJogo=1;
					return nomeJogador1;
				}else {
					pontuacaoJogador2++;
					contagemJogo=1;
					return nomeJogador2;
				}
				//To aqui
			}else if (matrizXO[0][1]==opcaoJ1 && matrizXO[1][1]==opcaoJ1 && matrizXO[2][1]==opcaoJ1||
					matrizXO[0][1]==opcaoJ2 && matrizXO[1][1]==opcaoJ2 && matrizXO[2][1]==opcaoJ2) {
				
				if(opcaoJ1.equalsIgnoreCase(matrizXO[0][1])) {
					pontuacaoJogador1++;
					contagemJogo=1;
					return nomeJogador1;
				}else {
					pontuacaoJogador2++;
					contagemJogo=1;
					return nomeJogador2;
				}
				//Agora to aqui
			}else if (matrizXO[0][2]==opcaoJ1 && matrizXO[1][2]==opcaoJ1 && matrizXO[2][2]==opcaoJ1||
					matrizXO[0][2]==opcaoJ2 && matrizXO[1][2]==opcaoJ2 && matrizXO[2][2]==opcaoJ2) {
				
				if(opcaoJ1.equalsIgnoreCase(matrizXO[0][2])) {
					pontuacaoJogador1++;
					contagemJogo=1;
					return nomeJogador1;
				}else {
					pontuacaoJogador2++;
					contagemJogo=1;
					return nomeJogador2;
				}
				//To aqui
			}else if (matrizXO[0][0]==opcaoJ1 && matrizXO[1][1]==opcaoJ1 && matrizXO[2][2]==opcaoJ1||
					matrizXO[0][0]==opcaoJ2 && matrizXO[1][1]==opcaoJ2 && matrizXO[2][2]==opcaoJ2) {
				
				if(opcaoJ1.equalsIgnoreCase(matrizXO[0][0])) {
					pontuacaoJogador1++;
					contagemJogo=1;
					return nomeJogador1;
				}else {
					pontuacaoJogador2++;
					contagemJogo=1;
					return nomeJogador2;
				}
			}else if (matrizXO[0][2]==opcaoJ1 && matrizXO[1][1]==opcaoJ1 && matrizXO[2][0]==opcaoJ1||
					matrizXO[0][2]==opcaoJ2 && matrizXO[1][1]==opcaoJ2 && matrizXO[2][0]==opcaoJ2) {
			
				if(opcaoJ1.equalsIgnoreCase(matrizXO[0][2])) {
					pontuacaoJogador1++;
					contagemJogo=1;
					return nomeJogador1;
				}else {
					pontuacaoJogador2++;
					contagemJogo=1;
					return nomeJogador2;
				}
			}else {
				return null;
			}
	}
	
	public String fimJogo() {
		if (pontuacaoJogador1>pontuacaoJogador2) {
			for (int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					matrizXO[i][j]=null;
				}
			}
			return "J1";
		}else if (pontuacaoJogador1<pontuacaoJogador2){
			for (int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					matrizXO[i][j]=null;
				}
			}
			return "J2";
		}else {
			for (int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					matrizXO[i][j]=null;
				}
			}
			return "Empate";
		}
	}
	
	public void resetarJogo() {
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				matrizXO[i][j]=null;
			}
		}
		contagemJogo=1;
	}
}
