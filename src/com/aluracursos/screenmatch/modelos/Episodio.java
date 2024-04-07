package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmacth.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private  int number;
    private String name;
    private  Serie serie;

    private int totalVisualizaciones;

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
       return  totalVisualizaciones > 100 ? 4 : 2;
    }
}
