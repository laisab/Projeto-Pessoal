//Nome: Lais Aparecida Borges - RA: 2453525

import javax.swing.JOptionPane;

public class Funcionario {
    private int numId;
    private String nome;
    private long cpf;
    private String telefone;
    private float salario;
    private Escola escola;
    
    public Funcionario(){
        numId = 0;
        nome = "";
        cpf = 0L;
        telefone = "";
        salario = 0;
        escola = new Escola();
    }
    
    //Sobrecarga
    public Funcionario(Funcionario f){
        numId = f.getNumId();
        nome = f.getNome();
        cpf = f.getCpf();
        telefone = f.getTelefone();
        salario = f.getSalario();
        escola = f.getEscola();
    }
    
    //Sobrescrita
    public void mostraDados(){
        JOptionPane.showMessageDialog(null, 
                "Número de identificação: " + numId + "\nNome: " + nome + "\nTelefone: " 
                        + telefone + "\nCPF: " + cpf + "\nNome da escola: " + getEscola().getNome() 
                        + "\nEndereço da escola: " + getEscola().getRua() + ", " + getEscola().getNum() + ", " 
                        + getEscola().getBairro() + ", " + getEscola().getCidade() + ", " + getEscola().getCep(), 
                "NOVOS DADOS", 1);
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) throws NumIdException{
        String contDigito = Integer.toString(numId);
        int aux = contDigito.length();
        
        if(aux == 3){
            this.numId = numId;
        }else{
            throw new NumIdException();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) throws CpfInvalidoException{
        String contDigito = Long.toString(cpf);
        int aux = contDigito.length();
        
        if((aux != 11) || (cpf == 00000000000L) || (cpf == 11111111111L) || (cpf == 22222222222L) ||
            (cpf == 33333333333L) || (cpf == 44444444444L) || (cpf == 55555555555L) || (cpf == 66666666666L) || (cpf == 77777777777L) || 
            (cpf == 88888888888L) || (cpf == 99999999999L)){
            throw new CpfInvalidoException();
        }else{
            this.cpf = cpf;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) throws ValorNegativoException{
        if(salario > 0){
            this.salario = salario;
        }else{
            throw new ValorNegativoException();
        }
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
}