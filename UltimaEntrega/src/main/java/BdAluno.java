// Nome: Luiz Gustavo Farabello Martins   RA: 2267942

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BdAluno {
    
    private Aluno al;
    private static List<Aluno> arrayAluno = new ArrayList<Aluno>();
    
    public static List<Aluno> getBdAluno(){
        return arrayAluno;
    }
    
    public static Aluno acharAluno(int al){
        for(int i=0; i<arrayAluno.size(); i++){
            if(al == arrayAluno.get(i).getMat().getCod_mat()){
                return arrayAluno.get(i);
            }
        }
        return null;
    }
    
    public static void cadastrar(Aluno al){
        arrayAluno.add(al);
    }
    
    public static void excluirAluno(Aluno aluno){
        arrayAluno.remove(aluno);
    }    
    
    public static void alterarAluno(Aluno aluno, int cod){
        for(int i=0; i<arrayAluno.size(); i++){
            if(cod == arrayAluno.get(i).getMat().getCod_mat()){
               try{
                    arrayAluno.get(i).setNome(aluno.getNome());
                    arrayAluno.get(i).setIdade(aluno.getIdade());
                    arrayAluno.get(i).setTurno(aluno.getTurno());
                    arrayAluno.get(i).getMat().setPlano(aluno.getMat().getPlano());                
                              
                } catch (NomeException ne) {
                        JOptionPane.showMessageDialog(null, "Digite o nome corretamente!", "ERRO DE CADASTRO", 0);
                } catch (NumberFormatException ne) {
                        JOptionPane.showMessageDialog(null, "Digite a idade corretamente!", "ERRO DE CADASTRO", 0);
                } catch(NegativoException ne){
                        JOptionPane.showMessageDialog(null, "Digite a idade corretamente!", "ERRO DE CADASTRO", 0);
                }               
            }
        }
    }
    
    public static void listar(){
        for(int i=0; i<arrayAluno.size(); i++){            
            System.out.println("\n > Dados do aluno: ");
            System.out.println("Nome: " + arrayAluno.get(i).getNome());
            System.out.println("Idade: " + arrayAluno.get(i).getIdade());
            System.out.println("Peso: " + arrayAluno.get(i).getPeso());
            System.out.println("Turno: " + arrayAluno.get(i).getTurno());
            System.out.println("Plano: " + arrayAluno.get(i).getMat().getPlano());
            System.out.println("CODIGO DE MATRICULA: " + arrayAluno.get(i).getMat().getCod_mat());
        }
    }
    
    
}
