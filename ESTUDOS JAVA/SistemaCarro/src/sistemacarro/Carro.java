package sistemacarro;

public class Carro {
	private int Id;
	private String modelo;
	private String cor;
	private String placa;
	private double preco;
	
	public Carro(int Id, String modelo, String cor, String placa, double preco) {
		this.Id = Id;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.preco = preco;
		
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
