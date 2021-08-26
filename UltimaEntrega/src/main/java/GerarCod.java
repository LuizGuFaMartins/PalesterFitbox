// Nome: Luiz Gustavo Farabello Martins   RA: 2267942

public final class GerarCod {
	// Atributos
	private static int codigo = 0;

	// Métodos
	public static int gerarCodMat() {
		codigo = codigo + 1;
		return codigo;
	}

}