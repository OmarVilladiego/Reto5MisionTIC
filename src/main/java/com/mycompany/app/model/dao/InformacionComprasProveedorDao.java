package com.mycompany.app.model.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.app.model.vo.InformacionComprasProveedorVo;
import com.mycompany.app.util.JDBCUtilities;

public class InformacionComprasProveedorDao {
    public List<InformacionComprasProveedorVo> Listar() throws Exception{


        ArrayList<InformacionComprasProveedorVo> result = new ArrayList<InformacionComprasProveedorVo>();

        ResultSet rs = null;
        Connection  connection = JDBCUtilities.getConnection();
        Statement statement = null;
        String Consulta = "SELECT ID_Compra, p.Constructora, p.Banco_Vinculado"
                +" FROM Compra c"
                +" INNER JOIN Proyecto p ON c.ID_Proyecto=p.ID_Proyecto"
                +" WHERE p.Ciudad='Salento'"
                +" AND c.Proveedor='Homecenter';";


                try {
                    statement = connection.createStatement();
                    rs = statement.executeQuery(Consulta);
                    while (rs.next()) {
                        InformacionComprasProveedorVo objeto = new InformacionComprasProveedorVo();
                        objeto.setId(rs.getInt("ID_Compra"));
                        objeto.setConstructora(rs.getString("Constructora"));
                        objeto.setBanco(rs.getString("Banco_Vinculado"));
                        
                        result.add(objeto);

                        
                       
                        



                    }




                } finally {
                  
                    if (rs != null){
                    rs.close();
                    }
                    if (statement != null) {
                    statement.close();
                    }
                    if (connection != null){
                    connection.close();
                    }
                    
    }


    


   
    
    
    return result;

}
}


/* String Consulta = "SELECT L.NOMBRE ||' '||L.PRIMER_APELLIDO ||' '||L.SEGUNDO_APELLIDO"
                           +"AS LIDER, SUM(C.CANTIDAD * MC.PRECIO_UNIDAD) AS VALOR"
                           +"FROM LIDER L"
                           +"JOIN PROYECTO P ON (P.ID_LIDER = L.ID_LIDER)"
                           +"JOIN COMPRA C ON (P.ID_PROYECTO = C.ID_PROYECTO)"
                           +"JOIN MATERIALCONSTRUCCION MC ON (C.ID_MATERIALCONSTRUCCION ="
                           +"MC.ID_MATERIALCONSTRUCCION)"
                           +"GROUP BY L.NOMBRE ||' '||L.PRIMER_APELLIDO ||' '||L.SEGUNDO_APELLIDO"
                           +"ORDER BY VALOR DESC"
                           +"LIMIT 10;";
                           
                           
                           
                           
                              public List<ComprasDeLiderVo> Listar(Double limite) throws Exception{


        ArrayList<ComprasDeLiderVo> result = new ArrayList<ComprasDeLiderVo>();

        ResultSet rs = null;
        Connection  connection = null;
        Statement statement = null;
        String Consulta = "SELECT L.NOMBRE ||' '||L.PRIMER_APELLIDO ||' '||L.SEGUNDO_APELLIDO"
        +"AS LIDER, SUM(C.CANTIDAD * MC.PRECIO_UNIDAD) AS VALOR"
        +"FROM LIDER L"
        +"JOIN PROYECTO P ON (P.ID_LIDER = L.ID_LIDER)"
        +"JOIN COMPRA C ON (P.ID_PROYECTO = C.ID_PROYECTO)"
        +"JOIN MATERIALCONSTRUCCION MC ON (C.ID_MATERIALCONSTRUCCION ="
        +"MC.ID_MATERIALCONSTRUCCION)"
        +"GROUP BY L.NOMBRE ||' '||L.PRIMER_APELLIDO ||' '||L.SEGUNDO_APELLIDO"
        +"ORDER BY VALOR DESC"
        +"LIMIT 10;";


                try {
                    connection = JDBCUtilities.getConnection();
                    statement = (Statement) connection.createStatement();
                    rs = ((java.sql.Statement) statement).executeQuery(Consulta);
                    while (rs.next()) {
                        ComprasDeLiderVo objeto = new ComprasDeLiderVo();
                        objeto.setLider(rs.getString("lider"));
                        objeto.setValor(rs.getDouble("valor"));
                        //Escribe codigo aquí
                        result.add(objeto);

                        
                       
                        



                    }




                } finally {
                  
                    if (rs != null){
                    rs.close();
                    }
                    if (statement != null) {
                    ((Connection) statement).close();
                    }
                    if (connection != null){
                    connection.close();
                    }
                    
    }


    


   
    
    
    return result;

}*/



