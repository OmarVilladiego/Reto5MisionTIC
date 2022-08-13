package com.mycompany.app.model.vo;

public class InformacionCasaCampestreVo {
    private Integer idproyecto;
    private String constructora;
    private Integer numerohabitaciones;
    private String ciudad;

    public Integer getIdproyecto() {
        return idproyecto;
    }

    public void setIdproyecto(Integer idproyecto) {
        this.idproyecto = idproyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getNumerohabitaciones() {
        return numerohabitaciones;
    }

    public void setNumerohabitaciones(Integer numerohabitaciones) {
        this.numerohabitaciones = numerohabitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    


    

   @Override
   public String toString() {
    return String.format("%3d %-25s %-20s %-15s", idproyecto, constructora, numerohabitaciones, ciudad);
   }


   

    
}
