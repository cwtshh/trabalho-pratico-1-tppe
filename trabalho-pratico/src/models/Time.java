package models;

public class Time {
    private String nome;
    private int pontos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsMarcados;
    private int golsSofridos;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }

    public void adicionarVitoria() {
        this.vitorias++;
        this.pontos += 3;
    }

    public void adicionarEmpate() {
        this.empates++;
        this.pontos += 1;
    }

    public void adicionarDerrota() {
        this.derrotas++;
    }

    public void adicionarGolsMarcados(int gols) {
        this.golsMarcados += gols;
    }

    public void adicionarGolsSofridos(int gols) {
        this.golsSofridos += gols;
    }

    public int getJogos() {
        return vitorias + empates + derrotas;
    }

    public String getNome() { return nome; }
    public int getPontos() { return pontos; }
    public int getVitorias() { return vitorias; }
    public int getEmpates() { return empates; }
    public int getDerrotas() { return derrotas; }
    public int getGolsMarcados() { return golsMarcados; }
    public int getGolsSofridos() { return golsSofridos; }
}
