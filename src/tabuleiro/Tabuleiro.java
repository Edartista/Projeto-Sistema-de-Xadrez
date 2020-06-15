package tabuleiro;
public class Tabuleiro {
    
    private int linhas;
    int colunas;
    private int colunas;
    Peça[][] peças;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        peças = new Peça [linhas][colunas];
        
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    
    
    
    
}
