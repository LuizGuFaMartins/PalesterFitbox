// Nome: Luiz Gustavo Farabello Martins   RA: 2267942

public class Aluno extends Pessoa {

  // Atributos
  String turno;
  float peso;
  Treino tre;
  Matricula mat;

  // Método construtor
  public Aluno() {
    turno = "";
    peso = 0;
    tre = new Treino();
    mat = new Matricula();
  }

  // Métodos
  public String getTurno() {
    return turno;
  }
  
  public void setTurno(String turno)  {
    this.turno = turno;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) throws NegativoException {
    if (peso >= 0) {
      this.peso = peso;
    } else {
      throw new NegativoException();
    }
  }

  public Treino getTre() {
    return tre;
  }

  public void setTre(Treino tre) {
    this.tre = tre;
  }

  public Matricula getMat() {
    return mat;
  }  

  public void mostrarDados() {
    System.out.println("\n > Dados do aluno: ");
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Peso: " + getPeso());
    System.out.println("Turno: " + getTurno());
    System.out.println("Plano: " + getMat().getPlano());
    System.out.println("CODIGO DE MATRICULA: " + getMat().getCod_mat());
    System.out.println("\n");
  }
 
}
