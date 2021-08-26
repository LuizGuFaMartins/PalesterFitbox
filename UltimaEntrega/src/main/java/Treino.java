// Nome: Luiz Gustavo Farabello Martins   RA: 2267942

public class Treino{

	// Atributos
	private int duracao;
	private int series;
	private int reps;
	private String tipoEquipa;
	private String muscTrab;
	private String tipoTreino;

	// Método construtor
	public Treino() {
		duracao = 0;
		series = 0;
		reps = 0;
		muscTrab = "nenhum";
		tipoEquipa = "nenhum";
                tipoTreino = "nenhum";
	}

	// Métodos
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) throws NegativoException {
		if (duracao >= 0) {
			this.duracao = duracao;
		} else {
			throw new NegativoException();
		}

	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) throws NegativoException {
		if (series >= 0) {
			this.series = series;
		} else {
			throw new NegativoException();
		}
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) throws NegativoException {
		if (reps >= 0) {
			this.reps = reps;
		} else {
			throw new NegativoException();
		}

	}

	public String getTipoEquipa() {
		return tipoEquipa;
	}

	public void setTipoEquipa(String tipoEquipa){
		this.tipoEquipa = tipoEquipa;
	}

	public String getMuscTrab() {
		return muscTrab;
	}

	public void setMuscTrab(String muscTrab) {
		this.muscTrab = muscTrab;
	}

	public String getTipoTreino() {
		return tipoTreino;
	}

	public void setTipoTreino(String tipoTreino) {
		this.tipoTreino = tipoTreino;
	}

	// public String getTreinador() {
	// return treinador;
	// }

	// public void setTreinador(){
	// this.treinador = VerTurnos
	// }

	public String defTipoTrei(int reps) {
		String str = "";
		if (reps > 0 && reps < 6) {
			str = "Treino de Forca muscular";
		}
		if (reps > 5 && reps < 13) {
			str = "Treino de Hipertrofia muscular";
		}
		if (reps > 12) {
			str = "Treino de Resistencia muscular";
		}
		if (reps < 0) {
			str = "Voce chama isso de treino?";
		}
		return str;
	}

	public String defTipoTrei(int reps, int series) {
		String str = "";
		if (reps > 0 && reps < 6 || series > 7 && series < 13) {
			str = "Treino de Forca muscular";
		}
		if (reps > 5 && reps < 13 || series > 12 && series < 21) {
			str = "Treino de Hipertrofia muscular";
		}
		if (reps > 12 || series > 20) {
			str = "Treino de Resistencia muscular";
		}
		if (reps <= 0 || series <= 0) {
			str = "Voce chama isso de treino?";
		}
		return str;
	}

	 public String defMuscTrab(String equip) {
            String str = "";
            if (equip.equals("Empurrar")) {
                str = "Peitoral, triceps e deltoide anterior";
            }
            if (equip.equals("Puxar")) {
                str = "Dorsais, trapezio, biceps e deltoide posterior";
            }
            if (equip.equals("Pernas")) {
                str = "Quadriceps, isquiotibiais e flexores de coxa e panturrilhas";
            }
            return str;
	 }
}

/*
 * .equals() getTipo.equals(Empurrar)
 */