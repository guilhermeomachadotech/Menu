package orçamento;

public class Carro extends MarcaCarro {
	private String nomeCarro;
	private double valorCarro;
	
	public String getNomeCarro() {
		return nomeCarro;
	}
	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}
	public double getValorCarro() {
		return valorCarro;
	}
	public void setValorCarro(double valorCarro) {
		this.valorCarro = valorCarro;
	}
}
