package models;

import exceptions.PartidaFinalizadaException;

public class Partida {
    private Time mandante;
    private Time visitante;
    private Integer golsMandante;
    private Integer golsVisitante;
    private boolean finalizado;

    public Partida(Time mandante, Time visiante) {
        this.mandante = mandante;
        this.visitante = visiante;
        this.finalizado = false;
    }


    public void registrarResultado(int golsMandante, int golsVisitante) throws PartidaFinalizadaException {
        if(finalizado) {
            throw new PartidaFinalizadaException();
        }

        this.golsMandante = golsMandante;
        this.golsVisitante = golsVisitante;
        this.finalizado = true;

        // atualiza as estatisticasd do time
        mandante.adicionarGolsMarcados(golsMandante);
        mandante.adicionarGolsSofridos(golsVisitante);
        visitante.adicionarGolsMarcados(golsVisitante);
        visitante.adicionarGolsSofridos(golsMandante);

        // atualiza pontos vitorias, empates e derrotas
        if(golsMandante > golsVisitante) {
            mandante.adicionarVitoria();
            visitante.adicionarDerrota();
        } else if (golsVisitante > golsMandante) {
            visitante.adicionarVitoria();
            mandante.adicionarDerrota();
        } else {
            mandante.adicionarEmpate();
            visitante.adicionarEmpate();
        }
    }

    public Time getMandante() { return mandante; }
    public Time getVisitante() { return visitante; }
    public Integer getGolsMandante() { return golsMandante; }
    public Integer getGolsVisitante() { return golsVisitante; }
    public boolean isFinalizado() { return finalizado; }
}
