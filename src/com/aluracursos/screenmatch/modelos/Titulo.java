package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String name;
    private int fechaLanzamiento;
    private int duration;

    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    private int totalDelasEvaluaciones;


    public Titulo(String name, int fechaLanzamiento, int duration, boolean incluidoEnElPlan) {
        this.name = name;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duration = duration;
        this.incluidoEnElPlan = incluidoEnElPlan;
    }
    public Titulo(String name, int fechaLanzamiento,  boolean incluidoEnElPlan) {
        this.name = name;
        this.fechaLanzamiento = fechaLanzamiento;
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDelasEvaluaciones() {
        return totalDelasEvaluaciones;
    }

    public void setTotalDelasEvaluaciones(int totalDelasEvaluaciones) {
        this.totalDelasEvaluaciones = totalDelasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la película es: " + name);
        System.out.println("Su fecha de lanzamiento es: " + fechaLanzamiento);
        System.out.println("Duración en minutos: "+ getDuration());
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDelasEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDelasEvaluaciones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }
}
