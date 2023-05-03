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
public class Enfermeiro {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    Enfermeiro(){
        
    }
    
    Enfermeiro(String nome){
        this.nome = nome;
    }
    
    void alteraNome(String nome){
        setNome(nome);
    }
}
