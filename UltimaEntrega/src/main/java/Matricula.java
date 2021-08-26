// Nome: Luiz Gustavo Farabello Martins   RA: 2267942
public class Matricula {

	// Atributos
	private int cod_mat;
	private String plano;        

	// Método construtor
	public Matricula() {
		plano = "";
                cod_mat = 0;                
	}

	// Métodos           
	public int getCod_mat() {
            return cod_mat;
	}
        
        public void setCod_mat(){
            this.cod_mat = GerarCod.gerarCodMat();
        }

	public String getPlano() {
		return plano;
	}

        public void setPlano(String plano){
            this.plano = plano;
	}

}