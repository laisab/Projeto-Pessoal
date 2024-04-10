//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class NumIdException extends Exception{
    public void mostraMsg(){
        JOptionPane.showMessageDialog(null, "O número de identificação deve ter 3 números!", "ATENÇÃO", 2);
    }
    
    public Diretor corrNumIdInvalido(Diretor d){
        try{
            int nNumId = Integer.parseInt(JOptionPane.showInputDialog(null, "N° de identificação - Novo:", "CORREÇÃO DE ID", 3));
            d.setNumId(nNumId);
        }catch(NumIdException nie){
            mostraMsg();
            d = corrNumIdInvalido(d);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O número de identificação deve ser um número inteiro!", "ATENCAO", 2);
        }
        
        return d;
    }
    
    public Professor corrNumIdInvalido(Professor p){
        try{
            int nNumId = Integer.parseInt(JOptionPane.showInputDialog(null, "N° de identificação - Novo:", "CORREÇÃO DE ID", 3));
            p.setNumId(nNumId);
        }catch(NumIdException nie){
            mostraMsg();
            p = corrNumIdInvalido(p);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O número de identificação deve ser um número inteiro!", "ATENCAO", 2);
        }
        
        return p;
    }
    
    public Terceirizado corrNumIdInvalido(Terceirizado t){
        try{
            int nNumId = Integer.parseInt(JOptionPane.showInputDialog(null, "N° de identificação - Novo:", "CORREÇÃO DE ID", 3));
            t.setNumId(nNumId);
        }catch(NumIdException nie){
            mostraMsg();
            t = corrNumIdInvalido(t);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O número de identificação deve ser um número inteiro!", "ATENCAO", 2);
        }
        
        return t;
    }
}