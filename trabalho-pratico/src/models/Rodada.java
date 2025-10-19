package models;

import java.util.ArrayList;
import java.util.List;

public class Rodada {
    private int numero;
    private List<Partida> partidas;

    public Rodada(int numero) {
        this.numero = numero;
        this.partidas = new ArrayList<>();
    }

    public void adicionarPartida(Partida partida) {
        this.partidas.add(partida);
    }

    public boolean todasPartidasFinalizas() {
        return partidas.stream().allMatch(Partida::isFinalizado);
    }

    public int getNumero() { return numero; }
    public List<Partida> getPartidas() { return partidas; }
}
