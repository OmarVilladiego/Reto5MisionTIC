package com.mycompany.app;

import com.mycompany.app.model.dao.InformacionLiderDao;
import com.mycompany.app.model.vo.InformacionLiderVo;
import com.mycompany.app.view.ReportesView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        

      
System.out.println( "Consulta");
        var reportesView = new ReportesView();
        var banco = "Conavi";
        reportesView.proyectosFinanciadosPorBanco(banco);


        System.out.println( "Consulta");
        var reportesView1 = new ReportesView();

       
        var limiteInferior = 50_000d;
        reportesView1.totalAdeudadoPorProyectosSuperioresALimite(limiteInferior);

        var reportesView2 = new ReportesView();
        reportesView2.lideresQueMasGastan();


    }
}
