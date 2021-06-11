/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.JOptionPane;

public class Jogador {
    private String nome;
    private String premio;
    private String nickName;

    

    public Jogador() {
        this.nome = "<EMPTY>";
        this.premio = "0.0";
        this.nickName = "<EMPTY>";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    public void adicionarJogador(Jogador qtdJogadores[], Jogador novo)
    {
        for(int i =0;i<qtdJogadores.length;i++)
        {
            if(qtdJogadores[i].getNome().equals("<EMPTY>")){
                qtdJogadores[i] = novo;
                i=qtdJogadores.length+2;
            }
        }
        
    }
    
    
    
}
