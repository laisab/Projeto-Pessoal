//Nome: Lais Aparecida Borges - RA: 2453525

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDFunc {
    static Funcionario f = new Funcionario();
    static Diretor d = new Diretor();
    static Professor p = new Professor();
    static Terceirizado t = new Terceirizado();
    static Escola e = new Escola();
    static List<Funcionario> bdFunc;
    static List<Diretor> bdDir;
    static List<Professor> bdProf;
    static List<Terceirizado> bdTerc;
    static List<Escola> bdEsc;
    private static BDFunc bancoFuncUnico;
    
    private BDFunc(){
        bdFunc = new ArrayList<Funcionario>();
        bdDir = new ArrayList<Diretor>();
        bdProf = new ArrayList<Professor>();
        bdTerc = new ArrayList<Terceirizado>();
        bdEsc = new ArrayList<Escola>();
    }
    
    public static BDFunc getBancoFunc(){
        if(bancoFuncUnico == null){
            bancoFuncUnico = new BDFunc();
        }
        
        return bancoFuncUnico;
    }
    
    public List<Funcionario> getBdFunc(){
        return bdFunc;
    }
    
    public List<Diretor> getBdDir(){
        return bdDir;
    }
    
    public List<Professor> getBdProf(){
        return bdProf;
    }
    
    public List<Terceirizado> getBdTerc(){
        return bdTerc;
    }
    
    public List<Escola> getBdEsc(){
        return bdEsc;
    }
    
    public static Funcionario cadFunc(Funcionario f){
        if(consFunc(f) == null){
            bdFunc.add(f);
            return f;
        }
        
        return null;
    }
    
    public static Funcionario consFunc(Funcionario f){
        for(int i = 0; i < bdFunc.size(); i++){
            if(f.getNumId() == bdFunc.get(i).getNumId()){
                return bdFunc.get(i);
            }
        }
        
        return null;
    }
    
    public static Funcionario excFunc(Funcionario f){
        for(int i = 0; i < bdFunc.size(); i++){
            if(f.getNumId() == bdFunc.get(i).getNumId()){
               bdFunc.remove(bdFunc.get(i));
               return null;
            }
        }
        
        return f;
    }
    
    public static Diretor cadDir(Diretor d){
        if(consDir(d) == null){
            bdDir.add(d);
            return d;
        }
        
        return null;
    }
    
    public static Diretor consDir(Diretor d){
        for(int i = 0; i < bdDir.size(); i++){
            if(d.getNumId() == bdDir.get(i).getNumId()){
                return bdDir.get(i);
            }
        }
        
        return null;
    }
    
    public static Diretor altDir(Diretor d){
        for(int i = 0; i < bdDir.size(); i++){
            if(d.getNumId() == bdDir.get(i).getNumId()){
                String nNome = JOptionPane.showInputDialog(null, "Novo nome:", "ALTERAÇÃO DE NOME", 3);
                String nTel = JOptionPane.showInputDialog(null, "Novo telefone:", "ALTERAÇÃO DE TELEFONE", 3);
                long nCpf = Long.parseLong(JOptionPane.showInputDialog(null, "Novo CPF:", "ALTERAÇÃO DE CPF", 3));
                float nSal = Float.parseFloat(JOptionPane.showInputDialog(null, "Novo salário:", "ALTERAÇÃO DE SALÁRIO", 3));
                String nDataAdm = JOptionPane.showInputDialog(null, "Nova data de admissão:", "ALTERAÇÃO DE DATA DE ADMISSÃO", 3);
                String nExpAnt = JOptionPane.showInputDialog(null, "Nova experiência:", "ALTERAÇÃO DE EXPERIÊNCIA", 3);
                int nIdade = Integer.parseInt(JOptionPane.showInputDialog(null, "Nova idade:", "ALTERAÇÃO DE IDADE", 3));
                String nNomeEsc = JOptionPane.showInputDialog(null, "Novo nome - escola:", "ALTERAÇÃO DE NOME - ESCOLA", 3);
                String nRuaEsc = JOptionPane.showInputDialog(null, "Nova rua - escola:", "ALTERAÇÃO DE RUA - ESCOLA", 3);
                int nNumEsc = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo número - escola:", "ALTERAÇÃO DE NÚMERO - ESCOLA", 3));
                String nBairroEsc = JOptionPane.showInputDialog(null, "Novo bairro - escola:", "ALTERAÇÃO DE BAIRRO - ESCOLA", 3);
                String nCidadeEsc = JOptionPane.showInputDialog(null, "Nova cidade - escola:", "ALTERAÇÃO DE CIDADE - ESCOLA", 3);
                String nCepEsc = JOptionPane.showInputDialog(null, "Novo CEP - escola:", "ALTERAÇÃO DE CEP - ESCOLA", 3);
                
                d.setNome(nNome);
                d.setTelefone(nTel);
                
                try{
                    d.setCpf(nCpf);
                }catch(CpfInvalidoException cie){
                    cie.mostraMsg();
                    d = cie.corrCpfInvalido(d);
                }
                
                try{
                    d.setSalario(nSal);
                }catch(ValorNegativoException vne){
                    vne.mostraMsg();
                    d = vne.corrSalNegativo(d);
                }
                
                d.setDataAdmissao(nDataAdm);
                d.setExpAnterior(nExpAnt);
                
                try{
                    d.setIdade(nIdade);
                }catch(ValorNegativoException vne){
                    vne.mostraMsg();
                    d = vne.corrIdadeNegativa(d);
                }
                
                d.getEscola().setNome(nNomeEsc);
                d.getEscola().setRua(nRuaEsc);
                
                try{
                    d.getEscola().setNum(nNumEsc);
                }catch(ValorNegativoException vne){
                    vne.mostraMsg();
                    d = vne.corrNumEscoNeg(d);
                }
                
                d.getEscola().setBairro(nBairroEsc);
                d.getEscola().setCidade(nCidadeEsc);
                d.getEscola().setCep(nCepEsc);
                
                bdDir.set(i, d);
                f = (Funcionario) d;
                bdFunc.set(i, f);
                
                return bdDir.get(i);
            }
        }
        
        return null;
    }
    
    public static Diretor excDir(Diretor d){
        for(int i = 0; i < bdDir.size(); i++){
            if(d.getNumId() == bdDir.get(i).getNumId()){
                bdDir.remove(bdDir.get(i));
                return null;
            }
        }
        
        return d;
    }
    
    public static Professor cadProf(Professor p){
        if(consProf(p) == null){
            bdProf.add(p);
            return p;
        }
        
        return null;
    }
    
    public static Professor consProf(Professor p){
        for(int i = 0; i < bdProf.size(); i++){
            if(p.getNumId() == bdProf.get(i).getNumId()){
                return bdProf.get(i);
            }
        }
        
        return null;
    }
    
    public static Professor altProf(Professor p){
        for(int i = 0; i < bdProf.size(); i++){
            if(p.getNumId() == bdProf.get(i).getNumId()){
                String nNome = JOptionPane.showInputDialog(null, "Novo nome:", "ALTERAÇÃO DE NOME", 3);
                String nTel = JOptionPane.showInputDialog(null, "Novo telefone:", "ALTERAÇÃO DE TELEFONE", 3);
                long nCpf = Long.parseLong(JOptionPane.showInputDialog(null, "Novo CPF:", "ALTERAÇÃO DE CPF", 3));
                float nSal = Float.parseFloat(JOptionPane.showInputDialog(null, "Novo salário:", "ALTERAÇÃO DE SALÁRIO", 3));
                String nDiscLec = JOptionPane.showInputDialog(null, "Nova disciplina:", "ALTERAÇÃO DE DISCIPLINA", 3);
                String nTitulacao = JOptionPane.showInputDialog(null, "Novo título:", "ALTERAÇÃO DE TÍTULO", 3);
                int nQtdeAulas = Integer.parseInt(JOptionPane.showInputDialog(null, "Nova qtde. de aulas semanais em horas:", "ALTERAÇÃO DE AULAS", 3));
                String nNomeEsc = JOptionPane.showInputDialog(null, "Novo nome - escola:", "ALTERAÇÃO DE NOME - ESCOLA", 3);
                String nRuaEsc = JOptionPane.showInputDialog(null, "Nova rua - escola:", "ALTERAÇÃO DE RUA - ESCOLA", 3);
                int nNumEsc = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo número - escola:", "ALTERAÇÃO DE NÚMERO - ESCOLA", 3));
                String nBairroEsc = JOptionPane.showInputDialog(null, "Novo bairro - escola:", "ALTERAÇÃO DE BAIRRO - ESCOLA", 3);
                String nCidadeEsc = JOptionPane.showInputDialog(null, "Nova cidade - escola:", "ALTERAÇÃO DE CIDADE - ESCOLA", 3);
                String nCepEsc = JOptionPane.showInputDialog(null, "Novo CEP - escola:", "ALTERAÇÃO DE CEP - ESCOLA", 3);
                
                p.setNome(nNome);
                p.setTelefone(nTel);
                
                try{
                    p.setCpf(nCpf);
                }catch(CpfInvalidoException cie){
                    cie.mostraMsg();
                    p = cie.corrCpfInvalido(p);
                }
                
                try{
                    p.setSalario(nSal);
                }catch(ValorNegativoException vne){
                    vne.mostraMsg();
                    p = vne.corrSalNegativo(p);
                }
                
                p.setDiscLeciona(nDiscLec);
                p.setTitulacao(nTitulacao);
                
                try{
                    p.setQtdeAulasSemanais(nQtdeAulas);
                }catch(LimAulasSemException lase){
                    lase.mostraMsg();
                    p = lase.corrLimAulasSem(p);
                }
                
                p.getEscola().setNome(nNomeEsc);
                p.getEscola().setRua(nRuaEsc);
                
                try{
                    p.getEscola().setNum(nNumEsc);
                }catch(ValorNegativoException vne){
                    vne.mostraMsg();
                    p = vne.corrNumEscoNeg(p);
                }
                
                p.getEscola().setBairro(nBairroEsc);
                p.getEscola().setCidade(nCidadeEsc);
                p.getEscola().setCep(nCepEsc);
                
                bdProf.set(i, p);
                f = (Funcionario) p;
                bdFunc.set(i, f);
                
                return bdProf.get(i);
            }
        }
        
        return null;
    }
    
    public static Professor excProf(Professor p){
        for(int i = 0; i < bdProf.size(); i++){
            if(p.getNumId() == bdProf.get(i).getNumId()){
                bdProf.remove(bdProf.get(i));
                return null;
            }
        }
        
        return p;
    }
    
    public static Terceirizado cadTerc(Terceirizado t){
        if(consTerc(t) == null){
            bdTerc.add(t);
            return t;
        }
        
        return null;
    }
    
    public static Terceirizado consTerc(Terceirizado t){
        for(int i = 0; i < bdTerc.size(); i++){
            if(t.getNumId() == bdTerc.get(i).getNumId()){
                return bdTerc.get(i);
            }
        }
        
        return null;
    }
    
    public static Terceirizado altTerc(Terceirizado t){
        for(int i = 0; i < bdTerc.size(); i++){
            if(t.getNumId() == bdTerc.get(i).getNumId()){
                String nNome = JOptionPane.showInputDialog(null, "Novo nome:", "ALTERAÇÃO DE NOME", 3);
                String nTel = JOptionPane.showInputDialog(null, "Novo telefone:", "ALTERAÇÃO DE TELEFONE", 3);
                long nCpf = Long.parseLong(JOptionPane.showInputDialog(null, "Novo CPF:", "ALTERAÇÃO DE CPF", 3));
                float nSal = Float.parseFloat(JOptionPane.showInputDialog(null, "Novo salário:", "ALTERAÇÃO DE SALÁRIO", 3));
                String nNomeEmp = JOptionPane.showInputDialog(null, "Novo nome da empresa:", "ALTERAÇÃO DE NOME DA EMPRESA", 3);
                String nServPrest = JOptionPane.showInputDialog(null, "Novo serviço prestado:", "ALTERAÇÃO DE SERVIÇO", 3);
                String nIniCont = JOptionPane.showInputDialog(null, "Nova data inicial do contrato:", "ALTERAÇÃO DE DATA INICIAL", 3);
                String nFimCont = JOptionPane.showInputDialog(null, "Nova data final do contrato:", "ALTERAÇÃO DE DATA FINAL", 3);
                String nNomeEsc = JOptionPane.showInputDialog(null, "Novo nome - escola:", "ALTERAÇÃO DE NOME - ESCOLA", 3);
                String nRuaEsc = JOptionPane.showInputDialog(null, "Nova rua - escola:", "ALTERAÇÃO DE RUA - ESCOLA", 3);
                int nNumEsc = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo número - escola:", "ALTERAÇÃO DE NÚMERO - ESCOLA", 3));
                String nBairroEsc = JOptionPane.showInputDialog(null, "Novo bairro - escola:", "ALTERAÇÃO DE BAIRRO - ESCOLA", 3);
                String nCidadeEsc = JOptionPane.showInputDialog(null, "Nova cidade - escola:", "ALTERAÇÃO DE CIDADE - ESCOLA", 3);
                String nCepEsc = JOptionPane.showInputDialog(null, "Novo CEP - escola:", "ALTERAÇÃO DE CEP - ESCOLA", 3);
                
                t.setNome(nNome);
                t.setTelefone(nTel);
                
                try{
                    t.setCpf(nCpf);
                }catch(CpfInvalidoException cie){
                    cie.mostraMsg();
                    t = cie.corrCpfInvalido(t);
                }
                
                try{
                    t.setSalario(nSal);
                }catch(ValorNegativoException vne){
                    vne.mostraMsg();
                    t = vne.corrSalNegativo(t);
                }
                
                
                t.setNomeEmp(nNomeEmp);
                t.setTipoServPrest(nServPrest);
                t.setDataIniContrato(nIniCont);
                t.setDataTermContrato(nFimCont);
                t.getEscola().setNome(nNomeEsc);
                t.getEscola().setRua(nRuaEsc);
                
                try{
                    t.getEscola().setNum(nNumEsc);
                }catch(ValorNegativoException vne){
                    vne.mostraMsg();
                    t = vne.corrNumEscoNeg(t);
                }
               
                t.getEscola().setBairro(nBairroEsc);
                t.getEscola().setCidade(nCidadeEsc);
                t.getEscola().setCep(nCepEsc);
                
                bdTerc.set(i, t);
                f = (Funcionario) t;
                bdFunc.set(i, f);
                
                return bdTerc.get(i);
            }
        }
        
        return null;
    }
    
    public static Terceirizado excTerc(Terceirizado t){
        for(int i = 0; i < bdTerc.size(); i++){
            if(t.getNumId() == bdTerc.get(i).getNumId()){
                bdTerc.remove(bdTerc.get(i));
                return null;
            }
        }
        
        return t;
    }
    
    public static Escola cadEsc(Escola e){
        if(consEsc(e) == null){
            bdEsc.add(e);
            return e;
        }
        
        return null;
    }
    
    public static Escola consEsc(Escola e){
        for(int i = 0; i < bdEsc.size(); i++){
            if(e.getNome().equalsIgnoreCase(bdEsc.get(i).getNome())){
                return bdEsc.get(i);
            }
        }
        
        return null;
    }
    
    public static Escola altEsc(Escola e){
        for(int i = 0; i < bdEsc.size(); i++){
            if(e.getNome().equalsIgnoreCase(bdEsc.get(i).getNome())){
                String nRuaEsc = JOptionPane.showInputDialog(null, "Nova rua - escola:", "ALTERAÇÃO DE RUA - ESCOLA", 3);
                int nNumEsc = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo número - escola:", "ALTERAÇÃO DE NÚMERO - ESCOLA", 3));
                String nBairroEsc = JOptionPane.showInputDialog(null, "Novo bairro - escola:", "ALTERAÇÃO DE BAIRRO - ESCOLA", 3);
                String nCidadeEsc = JOptionPane.showInputDialog(null, "Nova cidade - escola:", "ALTERAÇÃO DE CIDADE - ESCOLA", 3);
                String nCepEsc = JOptionPane.showInputDialog(null, "Novo CEP - escola:", "ALTERAÇÃO DE CEP - ESCOLA", 3);
                
                e.setRua(nRuaEsc);
                
                try{
                    e.setNum(nNumEsc);
                }catch(ValorNegativoException vne){
                    vne.mostraMsg();
                    e = vne.corrNumEscoNeg(e);
                }
                
                e.setBairro(nBairroEsc);
                e.setCidade(nCidadeEsc);
                e.setCep(nCepEsc);
                
                bdEsc.set(i, e);
                
                return bdEsc.get(i);
            }
        }
        
        return null;
    }
    
    public static Escola excEsc(Escola e){
        for(int i = 0; i < bdEsc.size(); i++){
            if(e.getNome().equalsIgnoreCase(bdEsc.get(i).getNome())){
                bdEsc.remove(bdEsc.get(i));
                return null;
            }
        }
        
        return e;
    }
}