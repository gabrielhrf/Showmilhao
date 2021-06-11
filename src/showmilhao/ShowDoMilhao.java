/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showmilhao;
import Classes.*;
/**
 *
 * @author Gabriel_PC
 */
public class ShowDoMilhao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Perguntas possiveis[] = new Perguntas[11];
        
        
        AlternativaPergunta a[] = new AlternativaPergunta[4];
        
        a[0] = new AlternativaPergunta("Private ", false);
        a[1] = new AlternativaPergunta("Public", false);
        a[2] = new AlternativaPergunta("Protected", false);
        a[3] = new AlternativaPergunta("Extends", true);
        
        Perguntas p1 = new Perguntas("   Qual desses não é um modificadores de acesso?", a);
        p1.adicionarOpcoes(a);
        
        possiveis[0] = p1;
        
      //////////////////////  
        a[0] = new AlternativaPergunta("Abstração", false);
        a[1] = new AlternativaPergunta("Construição", false);
        a[2] = new AlternativaPergunta("Proteção", false);
        a[3] = new AlternativaPergunta("Encapsulamento", true);
        
        p1 = new Perguntas("  Objetiva esconder todos os membros de uma classe, bem como suas rotinas (métodos)", a);
        p1.adicionarOpcoes(a);
        
        possiveis[1] = p1;
  ////////////////////
        a[0] = new AlternativaPergunta("Método", false);
        a[1] = new AlternativaPergunta("BYTECODE", true);
        a[2] = new AlternativaPergunta("JVM", false);
        a[3] = new AlternativaPergunta("JRE", false);
        
        p1 = new Perguntas("   Código de máquina que o compilador transforma a   aplicação para que pode ser lida pela JVM ", a);
        p1.adicionarOpcoes(a);
        
        possiveis[2] = p1;
////////////////////////
        a[0] = new AlternativaPergunta("Método", false);
        a[1] = new AlternativaPergunta("BYTECODE", false);
        a[2] = new AlternativaPergunta("JVM", true);
        a[3] = new AlternativaPergunta("JRE", false);
        
        p1 = new Perguntas("   Serve como um tradutor e interpretador da aplicação para o sistema operacional;", a);
        p1.adicionarOpcoes(a);
        
        possiveis[3] = p1;
/////////////

        a[0] = new AlternativaPergunta("Public", false);
        a[1] = new AlternativaPergunta("Private", false);
        a[2] = new AlternativaPergunta("Protected", true);
        a[3] = new AlternativaPergunta("Extends", false);
        
        p1 = new Perguntas("Modificador de acesso que permite que um atributo possa ser acessado por todas as classes do mesmo pacote ou as que a extendem", a);
        p1.adicionarOpcoes(a);
        
        possiveis[4] = p1;
///////////

        a[0] = new AlternativaPergunta("Public", false);
        a[1] = new AlternativaPergunta("Private", true);
        a[2] = new AlternativaPergunta("Protected", false);
        a[3] = new AlternativaPergunta("Extends", false);
        
        p1 = new Perguntas("Modificador de acesso que impede que os atributos da classe possam ser acessados fora dela;", a);
        p1.adicionarOpcoes(a);
        
        possiveis[5] = p1;
////////////////
        a[0] = new AlternativaPergunta("JRE", false);
        a[1] = new AlternativaPergunta("JDK;", false);
        a[2] = new AlternativaPergunta("JAVAC", true);
        a[3] = new AlternativaPergunta("JVM", false);
        
        p1 = new Perguntas("Nome do compilador Java da Oracle", a);
        p1.adicionarOpcoes(a);
        
        possiveis[6] = p1;
////////////
        a[0] = new AlternativaPergunta("JRE", true);
        a[1] = new AlternativaPergunta("JDK;", false);
        a[2] = new AlternativaPergunta("JAVAC", false);
        a[3] = new AlternativaPergunta("JVM", false);
        
        p1 = new Perguntas("Ambiente de execução Java, tem o que é necessário para a execução de uma aplicação Java", a);
        p1.adicionarOpcoes(a);
        
        possiveis[7] = p1;
/////////

        a[0] = new AlternativaPergunta("Abstração", false);
        a[1] = new AlternativaPergunta("Herança", true);
        a[2] = new AlternativaPergunta("Poliformismo", false);
        a[3] = new AlternativaPergunta("Override", false);
        
        p1 = new Perguntas("É quando uma classe filha (subclasse) herda todas as caracterÃ­sticas da classe mãe (superclasse)", a);
        p1.adicionarOpcoes(a);
        
        possiveis[8] = p1;
///////////////

        a[0] = new AlternativaPergunta("Construtor", true);
        a[1] = new AlternativaPergunta("Método", false);
        a[2] = new AlternativaPergunta("Atributo", false);
        a[3] = new AlternativaPergunta("Classe", false);
        
        p1 = new Perguntas("É um bloco declarado com o mesmo nome que a classe e serve para construir o objeto que essa classe molda;", a);
        p1.adicionarOpcoes(a);
        
        possiveis[8] = p1;
///////////

        a[0] = new AlternativaPergunta("Poliformismo", true);
        a[1] = new AlternativaPergunta("Override", false);
        a[2] = new AlternativaPergunta("Herança", false);
        a[3] = new AlternativaPergunta("Abstração", false);
        
        p1 = new Perguntas("Nome dado quando classes diferentes podem interpretar um mesmo método de maneiras diferentes ", a);
        p1.adicionarOpcoes(a);
        
        possiveis[9] = p1;
///////////

        a[0] = new AlternativaPergunta("JRE", false);
        a[1] = new AlternativaPergunta("JDK", false);
        a[2] = new AlternativaPergunta("JAVAC", false);
        a[3] = new AlternativaPergunta("JIT", true);
        
        p1 = new Perguntas("Tem a função de compilar os hotspots para a linguagem que o sistema operacional entenda fazendo com que a execução se torne mais ágil", a);
        p1.adicionarOpcoes(a);
        
        possiveis[10] = p1;
///////////
        
        Jogador qtdJogadores[] = new Jogador[10];
        
        for(int i =0;i<qtdJogadores.length;i++)
        {
            qtdJogadores[i] = new Jogador();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial(possiveis, qtdJogadores).setVisible(true);
            }
        });
        
        
    }
    
}
