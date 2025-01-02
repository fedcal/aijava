package com.aijava.decisiontree;

public class Persona {
    private String nome;
    private int eta;
    private String sesso;
    private double reddito;
    private boolean haFigli;

    
    public Persona(String nome, int eta, String sesso, double reddito, boolean haFigli) {
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
        this.reddito = reddito;
        this.haFigli = haFigli;
    }
    public Persona() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEta() {
        return eta;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    public String getSesso() {
        return sesso;
    }
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
    public double getReddito() {
        return reddito;
    }
    public void setReddito(double reddito) {
        this.reddito = reddito;
    }
    public boolean isHaFigli() {
        return haFigli;
    }
    public void setHaFigli(boolean haFigli) {
        this.haFigli = haFigli;
    }    
}
