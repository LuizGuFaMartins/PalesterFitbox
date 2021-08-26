// Nome: Luiz Gustavo Farabello Martins   RA: 2267942

public abstract class Pessoa {

	// Atributos
	private String nome;
	private int idade;

	// Métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws NomeException {
		if (!nome.isEmpty()) {
			this.nome = nome;
		} else {
			throw new NomeException();
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws NegativoException {
		if (idade > 0 && idade < 130) {
			this.idade = idade;
		} else {
			throw new NegativoException();
		}

	}

	public abstract void mostrarDados();
}