//Nome: Lais Aparecida Borges - RA: 2453525

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Diretor extends Funcionario implements Validar{
    private String dataAdmissao;
    private String expAnterior;
    private int idade;
    
    public Diretor(){
        dataAdmissao = "";
        expAnterior = "";
        idade = 0;
    }
    
    //Sobrecarga
    public Diretor(Diretor d){
        dataAdmissao = d.getDataAdmissao();
        expAnterior = d.getExpAnterior();
        idade = d.getIdade();
    }
    
    //Sobrescrita
    public void mostraDados(){
        JOptionPane.showMessageDialog(null, "Data de admissão: " + dataAdmissao + "\nExperiência anterior: " + expAnterior + "\nIdade: " + idade, "NOVOS DADOS", 1);
    }
    
    public void mostraDadosMae(){
        super.mostraDados();
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getExpAnterior() {
        return expAnterior;
    }

    public void setExpAnterior(String expAnterior) {
        this.expAnterior = expAnterior;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws ValorNegativoException{
        if (idade > 0){
            this.idade = idade;
        }else{
            throw new ValorNegativoException();
        }
    }
    
    public String validaData(){
        String data = "";
        SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            dataFormato.setLenient(false);
            dataFormato.parse(getDataAdmissao());
            data = getDataAdmissao();
        }catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Data inválida!", "ATENÇÃO", 2);
        }
        
        return data;
    }
}