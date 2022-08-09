package com.mycompany.app.view;

import java.util.List;

import com.mycompany.app.controller.ReportesController;
import com.mycompany.app.model.vo.ComprasDeLiderVo;
import com.mycompany.app.model.vo.DeudasPorProyectoVo;
import com.mycompany.app.model.vo.InformacionLiderVo;
public class ReportesView {
    private static ReportesController controlador;
    public ReportesView() {
        controlador = new ReportesController();
    }


    private String repitaCaracter(Character caracter, Integer veces) {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
        respuesta += caracter;
        }
        return respuesta;
        }



        public void proyectosFinanciadosPorBanco(String banco) {
        System.out.println(repitaCaracter('=', 36) + " LISTADO DE PROYECTOS POR BANCO "
        + repitaCaracter('=', 37));
        if (banco != null && !banco.isBlank()) {
        System.out.println(String.format("%3s %-25s %-20s %-15s %-7s %-30s",
        "ID", "CONSTRUCTORA", "CIUDAD", "CLASIFICACION", "ESTRATO", "LIDER"));
        System.out.println(repitaCaracter('-', 105));
        try {
            List<InformacionLiderVo> Proyecto = controlador.ListarProyectoBanco(banco);
            for(InformacionLiderVo proyect : Proyecto) {
                System.out.println(proyect);
            }
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }

        
        // TODO Imprimir en pantalla la información del proyecto
        }
       
        }
        public void totalAdeudadoPorProyectosSuperioresALimite(Double limite) {
        System.out.println(repitaCaracter('=', 1) + " TOTAL DEUDAS POR PROYECTO "
        + repitaCaracter('=', 1));
        if (limite != null) {
        System.out.println(String.format("%3s %15s", "ID", "VALOR"));
        System.out.println(repitaCaracter('-', 29));
        // TODO Imprimir en pantalla la información del total adeudado

        try {
            List<DeudasPorProyectoVo> Proyecto = controlador.ListarDeudarPor(limite);
            for(DeudasPorProyectoVo proyect : Proyecto) {
                System.out.println(proyect);
            }
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }

        }



        
        
        
        }
        public void lideresQueMasGastan() {System.out.println(repitaCaracter('=', 6) + " 10 LIDERES MAS COMPRADORES "
        + repitaCaracter('=', 7));
        System.out.println(String.format("%-25s %15s", "LIDER", "VALOR"));
        System.out.println(repitaCaracter('-', 41));
        // TODO Imprimir en pantalla la información de los líderes

        try {
            List<ComprasDeLiderVo> Proyecto = controlador.ListarComprasDeLider();
            for(ComprasDeLiderVo proyect : Proyecto) {
                System.out.println(proyect);
            }
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }

        }
}
