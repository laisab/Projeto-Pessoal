//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class CpfInvalidoException extends Exception{
    public void mostraMsg(){
        JOptionPane.showMessageDialog(null, "CPF inválido!", "ATENCAO", 2);
    }
    
    public Diretor corrCpfInvalido(Diretor d){
        try{
            long nCpf = Long.parseLong(JOptionPane.showInputDialog(null, "CPF - Novo:", "CORREÇÃO DE CPF", 3));
            d.setCpf(nCpf);
        }catch(CpfInvalidoException cie){
            mostraMsg();
            d = corrCpfInvalido(d);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O CPF deve ser um número!", "ATENÇÃO", 2);
        }
        
        return d;
    }
    
    public Professor corrCpfInvalido(Professor p){
        try{
            long nCpf = Long.parseLong(JOptionPane.showInputDialog(null, "CPF - Novo:", "CORREÇÃO DE CPF", 3));
            p.setCpf(nCpf);
        }catch(CpfInvalidoException cie){
            mostraMsg();
            p = corrCpfInvalido(p);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O CPF deve ser um número!", "ATENÇÃO", 2);
        }
        
        return p;
    }
    
    public Terceirizado corrCpfInvalido(Terceirizado t){
        try{
            long nCpf = Long.parseLong(JOptionPane.showInputDialog(null, "CPF - Novo:", "CORREÇÃO DE CPF", 3));
            t.setCpf(nCpf);
        }catch(CpfInvalidoException cie){
            mostraMsg();
            t = corrCpfInvalido(t);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O CPF deve ser um número!", "ATENÇÃO", 2);
        }
        
        return t;
    }
}