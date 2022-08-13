package com.mycompany.app.model.vo;

public class InformacionLiderVo {
    //Definir los atributos pertenecientes a la información del lider
    private Integer id;
    private String nombre;
    private String primerApellido;
    private String ciudadRecidencia;
    
    //Constructor vacío de la clase InformacionLiderVo
    public InformacionLiderVo() {
        
    }
    //Generar getter y setter para extracción y modificación de los atributos
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public InformacionLiderVo(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadRecidencia() {
        return ciudadRecidencia;
    }

    public void setCiudadRecidencia(String ciudadRecidencia) {
        this.ciudadRecidencia = ciudadRecidencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    
    
    
   //Sobreescribir metodo toString
    @Override
    public String toString() {
        return String.format("%3d %-25s %-20s %-15s", id, nombre, primerApellido, ciudadRecidencia);

    }





    
}
