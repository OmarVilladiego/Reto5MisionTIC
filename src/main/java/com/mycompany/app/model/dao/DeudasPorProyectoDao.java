package com.mycompany.app.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;



import com.mycompany.app.util.JDBCUtilities;


import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import com.mycompany.app.model.vo.DeudasPorProyectoVo;

public class DeudasPorProyectoDao {
    public List<DeudasPorProyectoVo> Listar(Double limite) throws Exception{


        ArrayList<DeudasPorProyectoVo> result = new ArrayList<DeudasPorProyectoVo>();

        ResultSet rs = null;
        Connection  connection = JDBCUtilities.getConnection();
        PreparedStatement statement = null;
        String Consulta =
        "SELECT P.ID_PROYECTO AS ID, SUM(C.CANTIDAD * MC.PRECIO_UNIDAD) AS VALOR"
        +" FROM PROYECTO P"
        +" JOIN COMPRA C ON (P.ID_PROYECTO = C.ID_PROYECTO)" 
        +" JOIN MATERIALCONSTRUCCION MC ON (C.ID_MATERIALCONSTRUCCION = MC.ID_MATERIALCONSTRUCCION)"
        +" WHERE C.PAGADO = 'No'"
        +" GROUP BY P.ID_PROYECTO"
        +" HAVING SUM(C.CANTIDAD * MC.PRECIO_UNIDAD) > ?"
        +" ORDER BY VALOR DESC;";
        


                try {
                    statement = connection.prepareStatement(Consulta);
                    statement.setDouble(1, limite);
                    rs = statement.executeQuery();
                    while (rs.next()) {
                        DeudasPorProyectoVo objeto = new DeudasPorProyectoVo();
                        objeto.setId(rs.getInt("id"));
                        objeto.setValor(rs.getDouble("valor"));
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
