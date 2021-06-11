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
        
        Perguntas p1 = new Perguntas("   Qual desses n�o � um modificadores de acesso?", a);
        p1.adicionarOpcoes(a);
        
        possiveis[0] = p1;
        
      //////////////////////  
        a[0] = new AlternativaPergunta("Abstra��o", false);
        a[1] = new AlternativaPergunta("Construi��o", false);
        a[2] = new AlternativaPergunta("Prote��o", false);
        a[3] = new AlternativaPergunta("Encapsulamento", true);
        
        p1 = new Perguntas("  Objetiva esconder todos os membros de uma classe, bem como suas rotinas (m�todos)", a);
        p1.adicionarOpcoes(a);
        
        possiveis[1] = p1;
  ////////////////////
        a[0] = new AlternativaPergunta("M�todo", false);
        a[1] = new AlternativaPergunta("BYTECODE", true);
        a[2] = new AlternativaPergunta("JVM", false);
        a[3] = new AlternativaPergunta("JRE", false);
        
        p1 = new Perguntas("   C�digo de m�quina que o compilador transforma a   aplica��o para que pode ser lida pela JVM ", a);
        p1.adicionarOpcoes(a);
        
        possiveis[2] = p1;
////////////////////////
        a[0] = new AlternativaPergunta("M�todo", false);
        a[1] = new AlternativaPergunta("BYTECODE", false);
        a[2] = new AlternativaPergunta("JVM", true);
        a[3] = new AlternativaPergunta("JRE", false);
        
        p1 = new Perguntas("   Serve como um tradutor e interpretador da aplica��o para o sistema operacional;", a);
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
        
        p1 = new Perguntas("Ambiente de execu��o Java, tem o que � necess�rio para a execu��o de uma aplica��o Java", a);
        p1.adicionarOpcoes(a);
        
        possiveis[7] = p1;
/////////

        a[0] = new AlternativaPergunta("Abstra��o", false);
        a[1] = new AlternativaPergunta("Heran�a", true);
        a[2] = new AlternativaPergunta("Poliformismo", false);
        a[3] = new AlternativaPergunta("Override", false);
        
        p1 = new Perguntas("� quando uma classe filha (subclasse) herda todas as características da classe m�e (superclasse)", a);
        p1.adicionarOpcoes(a);
        
        possiveis[8] = p1;
///////////////

        a[0] = new AlternativaPergunta("Construtor", true);
        a[1] = new AlternativaPergunta("M�todo", false);
        a[2] = new AlternativaPergunta("Atributo", false);
        a[3] = new AlternativaPergunta("Classe", false);
        
        p1 = new Perguntas("� um bloco declarado com o mesmo nome que a classe e serve para construir o objeto que essa classe molda;", a);
        p1.adicionarOpcoes(a);
        
        possiveis[8] = p1;
///////////

        a[0] = new AlternativaPergunta("Poliformismo", true);
        a[1] = new AlternativaPergunta("Override", false);
        a[2] = new AlternativaPergunta("Heran�a", false);
        a[3] = new AlternativaPergunta("Abstra��o", false);
        
        p1 = new Perguntas("Nome dado quando classes diferentes podem interpretar um mesmo m�todo de maneiras diferentes ", a);
        p1.adicionarOpcoes(a);
        
        possiveis[9] = p1;
///////////

        a[0] = new AlternativaPergunta("JRE", false);
        a[1] = new AlternativaPergunta("JDK", false);
        a[2] = new AlternativaPergunta("JAVAC", false);
        a[3] = new AlternativaPergunta("JIT", true);
        
        p1 = new Perguntas("Tem a fun��o de compilar os hotspots para a linguagem que o sistema operacional entenda fazendo com que a execu��o se torne mais �gil", a);
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
