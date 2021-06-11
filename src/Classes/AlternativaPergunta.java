package Classes;
public class AlternativaPergunta {
    String alternativa;
    boolean resposta;
    
    public AlternativaPergunta() {
    }

    public AlternativaPergunta(String alternativa, boolean resposta) {
        this.alternativa = alternativa;
        this.resposta = resposta;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }

    public boolean isResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }
    
    
}
