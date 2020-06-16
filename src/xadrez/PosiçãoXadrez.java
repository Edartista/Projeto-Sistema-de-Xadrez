package xadrez;

import tabuleiro.Posição;

public class PosiçãoXadrez {
   
    private char coluna;
    private int linha;

    public PosiçãoXadrez(char coluna, int linha) {
        if (coluna < 'a' || coluna >'h' || linha < 1 || linha > 8){
            throw new XadrezExceção("Erro mover a peça: valores válidos correspondem de A1 até H8.");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }
    
    protected Posição moverParaPosição(){
        return new Posição (8 - linha, coluna - 'a');
    } 
    
    protected static PosiçãoXadrez daPosição(Posição posição){
        return new PosiçãoXadrez((char)('a' - posição.getColuna()), 8 - posição.getLinha());
    }
    
    @Override
    public String toString(){
        return "" + coluna + linha;
    }
}
