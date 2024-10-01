package org.example.modelos;

import java.time.LocalDate;

public class SignoVital {
    private Integer id;
    private String tipo;
    private Double valor;
    private String unidad;
    private LocalDate fechaRegistro;
    private String comentario;
    private String pacienteId;
    private String medicoId;
    private String estado;
    private String metodoMedicion;

    public SignoVital() {
    }

    public SignoVital(Integer id, String tipo, Double valor, String unidad, LocalDate fechaRegistro, String comentario, String pacienteId, String medicoId, String estado, String metodoMedicion) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.unidad = unidad;
        this.fechaRegistro = fechaRegistro;
        this.comentario = comentario;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.estado = estado;
        this.metodoMedicion = metodoMedicion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(String medicoId) {
        this.medicoId = medicoId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoMedicion() {
        return metodoMedicion;
    }

    public void setMetodoMedicion(String metodoMedicion) {
        this.metodoMedicion = metodoMedicion;
    }

    @Override
    public String toString() {
        return "SignoVital{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", unidad='" + unidad + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", comentario='" + comentario + '\'' +
                ", pacienteId='" + pacienteId + '\'' +
                ", medicoId='" + medicoId + '\'' +
                ", estado='" + estado + '\'' +
                ", metodoMedicion='" + metodoMedicion + '\'' +
                '}';
    }
}
