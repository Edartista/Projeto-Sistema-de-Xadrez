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
    
    private void ConfigInicial(){
        tabuleiro.lugarDaPeça(new Torre(tabuleiro, Cor.branco), new Posição(2,1));
        tabuleiro.lugarDaPeça(new Rei(tabuleiro, Cor.preto), new Posição (0,4));
        tabuleiro.lugarDaPeça(new Rei(tabuleiro, Cor.branco), new Posição (7,4));
    }
    
}