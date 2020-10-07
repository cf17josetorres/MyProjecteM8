package com.example.myprojectem8;

public class Incidencia {
    String Titol;
    String Urgencia;//(Alta, Mitjana, Baixa)

    public Incidencia() {}

    public Incidencia(String Titol, String Urgencia) {
        this.Titol = Titol;
        this.Urgencia = Urgencia;
    }

    public String getTitol() {
        return Titol;
    }

    public void setTitol(String titol) {
        Titol = titol;
    }

    public String getUrgencia() {
        return Urgencia;
    }

    public void setUrgencia(String urgencia) {
        Urgencia = urgencia;
    }
}
