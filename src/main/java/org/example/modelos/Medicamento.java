package org.example.modelos;

public class Medicamento {
    private Integer id;
    private String nombre;
    private String principioActivo;
    private String formaFarmaceutica;
    private String dosis;
    private String viaAdministracion;
    private String efectosSecundarios;
    private String contraindicaciones;
    private Integer duracionTratamiento;
    private String fabricante;

    public Medicamento() {
    }

    public Medicamento(Integer id, String nombre, String principioActivo, String formaFarmaceutica, String dosis, String viaAdministracion, String efectosSecundarios, String contraindicaciones, Integer duracionTratamiento, String fabricante) {
        this.id = id;
        this.nombre = nombre;
        this.principioActivo = principioActivo;
        this.formaFarmaceutica = formaFarmaceutica;
        this.dosis = dosis;
        this.viaAdministracion = viaAdministracion;
        this.efectosSecundarios = efectosSecundarios;
        this.contraindicaciones = contraindicaciones;
        this.duracionTratamiento = duracionTratamiento;
        this.fabricante = fabricante;
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

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }

    public String getEfectosSecundarios() {
        return efectosSecundarios;
    }

    public void setEfectosSecundarios(String efectosSecundarios) {
        this.efectosSecundarios = efectosSecundarios;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public Integer getDuracionTratamiento() {
        return duracionTratamiento;
    }

    public void setDuracionTratamiento(Integer duracionTratamiento) {
        this.duracionTratamiento = duracionTratamiento;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", principioActivo='" + principioActivo + '\'' +
                ", formaFarmaceutica='" + formaFarmaceutica + '\'' +
                ", dosis='" + dosis + '\'' +
                ", viaAdministracion='" + viaAdministracion + '\'' +
                ", efectosSecundarios='" + efectosSecundarios + '\'' +
                ", contraindicaciones='" + contraindicaciones + '\'' +
                ", duracionTratamiento=" + duracionTratamiento +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
