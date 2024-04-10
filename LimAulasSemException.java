//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class LimAulasSemException extends Exception{
    public void mostraMsg(){
        JOptionPane.showMessageDialog(null, "O professor não deve ter mais de 44 horas semanais de aula!", "ATENÇÃO", 2);
    }
    
    public Professor corrLimAulasSem(Professor p){
        try{
            int nQtdeAulasSem = Integer.parseInt(JOptionPane.showInputDialog(null, "Qtde. aulas semanais - Novo:", "CORREÇÃO DE AULAS", 3));
            p.setQtdeAulasSemanais(nQtdeAulasSem);
        }catch(LimAulasSemException lase){
            mostraMsg();
            p = corrLimAulasSem(p);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "A quantidade de aulas deve ser um número inteiro", "ATENÇÃO", 2);
        }
        
        return p;
    }
}