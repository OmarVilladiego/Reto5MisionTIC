package com.mycompany.app.model.vo;

public class InformacionComprasProveedorVo {
    private Integer id;
    private String constructora;
    private String banco;

    public InformacionComprasProveedorVo() {
        
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    

    @Override
    public String toString() {
        return String.format("%-25s %,15.1f", id, constructora, banco);
    }
    
    
}
