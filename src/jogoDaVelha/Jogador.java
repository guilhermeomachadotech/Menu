package jogoDaVelha;

public class Jogador {
	private String nomeJogador;
	private String opcaoJogador;
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public String getOpcaoJogador() {
		return opcaoJogador;
	}
	public void setOpcaoJogador(String opcaoJogador) {
		this.opcaoJogador = opcaoJogador;
	}
	public void CadastrarJogador(String nome,String opcao) {
		this.nomeJogador=nome;
		this.opcaoJogador=opcao;
	}
}
