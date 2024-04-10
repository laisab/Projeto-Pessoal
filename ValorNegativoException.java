//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class ValorNegativoException extends Exception{
    public void mostraMsg(){
        JOptionPane.showMessageDialog(null, "O número digitado não pode ser negativo ou igual a 0!", "ATENÇÃO", 2);
    }
    
    public Diretor corrSalNegativo(Diretor d){
        try{
            float nSalario = Float.parseFloat(JOptionPane.showInputDialog(null, "Salário - Novo:", "CORREÇÃO DE SALÁRIO", 3));
            d.setSalario(nSalario);
        }catch(ValorNegativoException vne){
            mostraMsg();
            d = corrSalNegativo(d);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O salário deve ser um número separado por . e deve ser um número!", "ATENÇÃO", 2);
        }
        
        return d;
    }
    
    public Professor corrSalNegativo(Professor p){
        try{
            float nSalario = Float.parseFloat(JOptionPane.showInputDialog(null, "Salário - Novo:", "CORREÇÃO DE SALÁRIO", 3));
            p.setSalario(nSalario);
        }catch(ValorNegativoException vne){
            mostraMsg();
            p = corrSalNegativo(p);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O salário deve ser um número separado por . e deve ser um número!", "ATENÇÃO", 2);
        }
        
        return p;
    }
    
    public Terceirizado corrSalNegativo(Terceirizado t){
        try{
            float nSalario = Float.parseFloat(JOptionPane.showInputDialog(null, "Salário - Novo:", "CORREÇÃO DE SALÁRIO", 3));
            t.setSalario(nSalario);
        }catch(ValorNegativoException vne){
            mostraMsg();
            t = corrSalNegativo(t);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O salário deve ser um número separado por . e deve ser um número!", "ATENÇÃO", 2);
        }
        
        return t;
    }
    
    public Diretor corrIdadeNegativa(Diretor d1){
        try{
            int nIdade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade - Novo:", "CORREÇÃO DE IDADE", 3));
            d1.setIdade(nIdade);
        }catch(ValorNegativoException vne){
            mostraMsg();
            d1 = corrIdadeNegativa(d1);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "A idade deve ser um número inteiro!", "ATENÇÃO", 2);
        }
        
        return d1;
    }
    
    public Diretor corrNumEscoNeg(Diretor d2){
        try{
            int nNumEsc = Integer.parseInt(JOptionPane.showInputDialog(null, "Número (escola) - Novo:", "CORREÇÃO DE NÚMERO", 3));
            d2.getEscola().setNum(nNumEsc);
        }catch(ValorNegativoException vne){
            mostraMsg();
            d2 = corrNumEscoNeg(d2);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "O número do endereço deve ser inteiro!", "ATENÇÃO", 2);
        }
        
        return d2;
    }
    
    public Professor corrNumEscoNeg(Professor p1){
        try{
            int nNumEsc = Integer.parseInt(JOptionPane.showInputDialog(null, "Número (escola) - Novo:", "CORREÇÃO DE NÚMERO", 3));
            p1.getEscola().setNum(nNumEsc);
        }catch(ValorNegativoException vne){
            mostraMsg();
            p1 = corrNumEscoNeg(p1);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "O número do endereço deve ser inteiro!", "ATENÇÃO", 2);
        }
        
        return p1;
    }
    
    public Terceirizado corrNumEscoNeg(Terceirizado t1){
        try{
            int nNumEsc = Integer.parseInt(JOptionPane.showInputDialog(null, "Número (escola) - Novo:", "CORREÇÃO DE NÚMERO", 3));
            t1.getEscola().setNum(nNumEsc);
        }catch(ValorNegativoException vne){
            mostraMsg();
            t1 = corrNumEscoNeg(t1);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "O número do endereço deve ser inteiro!", "ATENÇÃO", 2);
        }
        
        return t1;
    }
    
    public Escola corrNumEscoNeg(Escola e){
        try{
            int nNumEsc = Integer.parseInt(JOptionPane.showInputDialog(null, "Número (escola) - Novo:", "CORREÇÃO DE NÚMERO", 3));
            e.setNum(nNumEsc);
        }catch(ValorNegativoException vne){
            mostraMsg();
            e = corrNumEscoNeg(e);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "O número do endereço deve ser inteiro!", "ATENÇÃO", 2);
        }
        
        return e;
    }
}