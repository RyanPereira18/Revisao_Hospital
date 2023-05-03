/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao.hospital;

/**
 *
 * @author 15894822637
 */
public class Paciente {
    private String nome;
    private static int cont;
    private int codPaciente;

    public static int getCont() {
        return Paciente.cont;
    }

    public int getCodPaciente() {
        return codPaciente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    Paciente(){
        Paciente.cont = Paciente.cont + 1;
        this.codPaciente = cont;
    }
    
    void alteraNome(String nome){
        setNome(nome);
    }
}
