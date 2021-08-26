// Nome: Luiz Gustavo Farabello Martins   RA: 2267942

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BdTreinador {
    
    private Treinador trei;
    private static List<Treinador> arrayTreinador = new ArrayList<Treinador>();
    
    public static List<Treinador> getBdTreinador(){
        return arrayTreinador;
    }
    
    public static Treinador acharTreinador(String trei){
        for(int i=0; i<arrayTreinador.size(); i++){
            if(trei.equals(arrayTreinador.get(i).getCref())){
                return arrayTreinador.get(i);
            }
        }
        return null;
    }
    
    public static void cadastrar(Treinador trei){
        arrayTreinador.add(trei);
    }
    
    public static void excluirTreinador(Treinador trei){
        arrayTreinador.remove(trei);
    }    
    
    public static void alterarAluno(Treinador trei, String cod){
        for(int i=0; i<arrayTreinador.size(); i++){
            if(cod.equals(arrayTreinador.get(i).getCref())){
               try{
                    arrayTreinador.get(i).setNome(trei.getNome());
                    arrayTreinador.get(i).setIdade(trei.getIdade());
                    arrayTreinador.get(i).setTurnoAtt(trei.getTurnoAtt());                                  
                              
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
}
