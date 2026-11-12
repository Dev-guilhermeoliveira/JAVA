package sistemaestudo;

public class Usuario {
	private int Id;
	private String nome;
	private int Idade;
	
	public Usuario(int Id, String nome, int Idade) {
		this.Id = Id;
		this.nome = nome;
		this.Idade = Idade;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int Idade) {
		this.Idade = Idade;
	}
}
