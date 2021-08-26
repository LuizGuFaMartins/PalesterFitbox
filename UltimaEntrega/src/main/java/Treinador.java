// Nome: Luiz Gustavo Farabello Martins   RA: 2267942

public class Treinador extends Pessoa {

  // Atributos
  String cref;
  String turnoAtt;

  // Método construtos
  public Treinador() {
    cref = "";
    turnoAtt = "";
  }

  // Métodos
  public String getCref() {
    return cref;
  }

  public void setCref(String cref) {
    this.cref = cref;
  }

  public String getTurnoAtt() {
    return turnoAtt;
  }

  public void setTurnoAtt(String turnoAtt){
    this.turnoAtt = turnoAtt;
  }

  public void mostrarDados() {
    System.out.println("\n Dados do treinador:");
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Codigo do CREF: " + getCref());
    System.out.println("Turno de trabalho: " + getTurnoAtt());
  }
}
