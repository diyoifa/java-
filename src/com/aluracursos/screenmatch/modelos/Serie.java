package com.aluracursos.screenmatch.modelos;

public class Serie  extends  Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;


    public Serie(String name, int fechaLanzamiento,  boolean incluidoEnElPlan, int temporadas, int episodiosPorTemporada, int minutosPorEpisodio) {
        super(name, fechaLanzamiento, incluidoEnElPlan);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuration(){
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
