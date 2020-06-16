package tabuleiro;
public class Tabuleiro {
    
    private int linhas;
    private int colunas;
    private Peça[][] peças;

    public Tabuleiro(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1){
            throw new TabuleiroExceção("Erro na criação do tabuleiro: é necessário pelo menos uma linha e uma coluna.");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        peças = new Peça [linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peça peça (int linha, int coluna){
        return peças[linha][coluna];
    }
    
    public Peça peça (Posição posição){
        if (!posiçãoPossível(posição)){
            throw new TabuleiroExceção("Posição fora do tabuleiro");
        }
        return peças[posição.getLinha()][posição.getColuna()];
    }
    
    public void lugarDaPeça(Peça peça, Posição posição){
        if (posiçãoOcupada(posição)){
            throw new TabuleiroExceção("Posição (" + posição + ") já está ocupada por outra peça.");
        }
        peças[posição.getLinha()][posição.getColuna()] = peça;
        peça.posição = posição;
    }
    
    private boolean posiçãoPossível(int linha, int coluna){
        return linha >= 0 && linha <= linhas && coluna >= 0 && coluna < colunas;
    }
    
    private boolean posiçãoPossível(Posição posição){
        return posiçãoPossível(posição.getLinha(), posição.getColuna());
    }

    public boolean posiçãoOcupada(Posição posição){
        if (!posiçãoPossível(posição)){
            throw new TabuleiroExceção("Posição fora do tabuleiro");
        }
        return peça(posição) != null; 
    }
    
}


