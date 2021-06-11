package Classes;
import Classes.AlternativaPergunta;

public class Perguntas {
    String enunciado;
    AlternativaPergunta opcoes[];

    public Perguntas() {
    }

    public Perguntas(String enunciado, AlternativaPergunta[] opcoes) {
        this.enunciado = enunciado;
        this.opcoes = new AlternativaPergunta[4];
    }
    
    public void adicionarOpcoes(AlternativaPergunta alternativas[]){
        System.arraycopy(alternativas, 0, this.opcoes, 0, 4);
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
    public AlternativaPergunta getAlternativaPosicao(int posicao)
    {
        return opcoes[posicao];
    }
    
    
}
