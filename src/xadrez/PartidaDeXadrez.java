package xadrez;

import tabuleiro.Posição;
import tabuleiro.Tabuleiro;
import xadrez.peças.Rei;
import xadrez.peças.Torre;

public class PartidaDeXadrez {
    
    private Tabuleiro tabuleiro;
    
    public PartidaDeXadrez(){
        tabuleiro = new Tabuleiro(8,8);
        ConfigInicial();
    }
 
    public PeçaDeXadrez[][] getPeças(){
        PeçaDeXadrez[][] matriz = new PeçaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i=0; i<tabuleiro.getLinhas(); i++){
            for (int j=0; j<tabuleiro.getColunas(); j++){
                matriz[i][j] = (PeçaDeXadrez) tabuleiro.peça(i, j);
            }
        }
        return matriz;
    }
    
    private void lugarNovaPeça(char coluna, int linha, PeçaDeXadrez peça){
        tabuleiro.lugarDaPeça(peça, new PosiçãoXadrez (coluna, linha).moverParaPosição());
}
    
    private void ConfigInicial(){
        lugarNovaPeça('b', 6, new Torre(tabuleiro, Cor.branco));
        lugarNovaPeça('e', 8,new Rei(tabuleiro, Cor.preto));
        lugarNovaPeça('e', 1, new Rei(tabuleiro, Cor.branco));
    }
    
    
    
}
