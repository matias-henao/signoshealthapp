package org.example.modelos;

public class Enfermedad {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String sintomas;
    private String tratamiento;
    private String causas; // Causas de la enfermedad
    private String tipo; // Tipo de enfermedad (aguda, crónica)
    private String pronostico; // Pronóstico de la enfermedad
    private Boolean contagiosa; // Si es contagiosa o no
    private String grupoRiesgo; // Grupos de riesgo

    public Enfermedad() {
    }

    public Enfermedad(Integer id, String nombre, String descripcion, String sintomas, String tratamiento, String causas, String tipo, String pronostico, Boolean contagiosa, String grupoRiesgo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sintomas = sintomas;
        this.tratamiento = tratamiento;
        this.causas = causas;
        this.tipo = tipo;
        this.pronostico = pronostico;
        this.contagiosa = contagiosa;
        this.grupoRiesgo = grupoRiesgo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public Boolean getContagiosa() {
        return contagiosa;
    }

    public void setContagiosa(Boolean contagiosa) {
        this.contagiosa = contagiosa;
    }

    public String getGrupoRiesgo() {
        return grupoRiesgo;
    }

    public void setGrupoRiesgo(String grupoRiesgo) {
        this.grupoRiesgo = grupoRiesgo;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", sintomas='" + sintomas + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", causas='" + causas + '\'' +
                ", tipo='" + tipo + '\'' +
                ", pronostico='" + pronostico + '\'' +
                ", contagiosa=" + contagiosa +
                ", grupoRiesgo='" + grupoRiesgo + '\'' +
                '}';
    }
}
