package Programa;

import tabuleiro.Posição;
import tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;

public class Main {
    public static void main(String[] args) {
        PartidaDeXadrez partida = new PartidaDeXadrez();
        IU.mostrarTabuleiro(partida.getPeças());
    }
}
