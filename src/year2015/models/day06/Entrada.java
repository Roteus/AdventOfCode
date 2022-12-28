package year2015.models.day06;

public class Entrada {

    private String acao;
    private int linhaInicio;
    private int colunaInicio;
    private int linhaFim;
    private int colunaFim;

    public Entrada(){}

    public Entrada(String acao, int linhaInicio, int colunaInicio, int linhaFim, int colunaFim) {
        this.acao = acao;
        this.linhaInicio = linhaInicio;
        this.colunaInicio = colunaInicio;
        this.linhaFim = linhaFim;
        this.colunaFim = colunaFim;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public int getLinhaInicio() {
        return linhaInicio;
    }

    public void setLinhaInicio(int linhaInicio) {
        this.linhaInicio = linhaInicio;
    }

    public int getColunaInicio() {
        return colunaInicio;
    }

    public void setColunaInicio(int colunaInicio) {
        this.colunaInicio = colunaInicio;
    }

    public int getLinhaFim() {
        return linhaFim;
    }

    public void setLinhaFim(int linhaFim) {
        this.linhaFim = linhaFim;
    }

    public int getColunaFim() {
        return colunaFim;
    }

    public void setColunaFim(int colunaFim) {
        this.colunaFim = colunaFim;
    }
}
