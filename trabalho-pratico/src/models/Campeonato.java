package models;

import exceptions.QtdTimesException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Campeonato {
    private String nome;
    private List<Time> times;
    private List<Rodada> rodadas;
    private Map<String, Time> timesMap;

    public Campeonato(String nome) {
        this.nome = nome;
        this.times = new ArrayList<>();
        this.rodadas = new ArrayList<>();
        this.timesMap = new HashMap<>();
    }

    public void adicionarTime(Time time) throws QtdTimesException {
        if(times.size() >= 20) {
            throw new QtdTimesException();
        }
        times.add(time);
        timesMap.put(time.getNome(), time);
    }

    public void adicionarRodada(Rodada rodada) {
        rodadas.add(rodada);
    }

    public int getTotalRodadas() {
        return rodadas.size();
    }

    public String getNome() { return nome; }
    public List<Time> getTimes() { return times; }
    public List<Rodada> getRodadas() { return rodadas; }
}
